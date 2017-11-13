package wordcount.system;

import org.codehaus.jackson.map.ObjectMapper;
import org.schwering.irc.lib.IRCConnection;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class WordFeed {
    private static final Logger log = LoggerFactory.getLogger(WordFeed.class);
    private static final Random random = new Random();
    private static final ObjectMapper jsonMapper = new ObjectMapper();


}
