package wordcount.task;

import org.apache.samza.system.IncomingMessageEnvelope;
import org.apache.samza.system.SystemStream;
import org.apache.samza.task.MessageCollector;
import org.apache.samza.task.StreamTask;
import org.apache.samza.task.TaskCoordinator;
import wordcount.system.WordFeed;
import java.util.Map;
/*
    Generate random sentences
 */

public class WordFeedStreamTask implements StreamTask{
    private static final SystemStream Output_Stream = new SystemStream("kafka","wordcount-raw");
    public void process(IncomingMessageEnvelope envelope, MessageCollector collector, TaskCoordinator coordinator) {

    }
}
