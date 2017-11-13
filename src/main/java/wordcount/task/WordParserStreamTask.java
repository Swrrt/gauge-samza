package wordcount.task;
import java.util.HashMap;
import java.util.Map;
import org.apache.samza.system.IncomingMessageEnvelope;
import org.apache.samza.system.OutgoingMessageEnvelope;
import org.apache.samza.system.SystemStream;
import org.apache.samza.task.MessageCollector;
import org.apache.samza.task.StreamTask;
import org.apache.samza.task.TaskCoordinator;

/*

 */
public class WordParserStreamTask implements StreamTask {
    private static final SystemStream OUTPUT_STREAM = new SystemStream("kafka", "wordcount-word");
    @SuppressWarnings("unchecked")
    public void process(IncomingMessageEnvelope envelope, MessageCollector collector, TaskCoordinator coordinator){
        Map<String, Object> jsonObject = (Map<String, Object>) envelope.getMessage();
        String raw = (String)jsonObject.get("raw");
        if(raw != null){
            String delims = "[ ]+";
            String[] tokens = raw.split(delims);
            for (String token: tokens){
                Map<String, Object> parsedjsonObject = new HashMap<String, Object>();
                parsedjsonObject.put("word",token);
                collector.send(new OutgoingMessageEnvelope(OUTPUT_STREAM, parsedjsonObject));
            }
        }
    }
}
