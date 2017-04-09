package ua.edu.uzhnu.practice3;

import java.util.Map;
import java.util.HashMap;


/**
 * Created by User-Bogdan on 28.03.2017.
 */
public class EncodingResult {

    String encodedMessage;
    Map<String, Character> charTable;

    public EncodingResult(String encodedMessage, Map<String, Character> charTable) {
        this.encodedMessage = encodedMessage;
        this.charTable = charTable;
    }

    public String getEncodedMessage() {
        return encodedMessage;
    }

    public Map<String, Character> getCharTable() {
        Map<String,Character> copy = new HashMap<String, Character>();
        copy = charTable;
        return copy;
    }
}
