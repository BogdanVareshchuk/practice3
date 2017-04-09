package ua.edu.uzhnu.practice3;

import java.util.*;


/**
 * Created by User-Bogdan on 28.03.2017.
 */
public class HuffmanEncoder {

   public EncodingResult encode(String message){
       Map<Character, CharNode> map1 = new HashMap<Character, CharNode>();
       int t = message.length();
       for ( int i = 0; i<t; i++) {
           char c = message.charAt(i);
           if (!map1.containsKey(c)) {
               map1.put(c, new CharNode(c));
           } else if (map1.containsKey(c)) {
               CharNode cn = map1.get(c);
               cn.incrementCount();
               map1.put(c, cn);
           }
       }
       List<CharNode> second = new ArrayList<CharNode>(map1.values());
       while (second.size()!= 1){
           int min = second.get(0).count;
           int ind = 0;
           for (int i = 1; i<second.size(); i++){
               if (second.get(i).count <= min){
                   min = second.get(i).count;
                   ind = i;
               }
           }
           CharNode nodeRight = second.get(ind);
           second.remove(ind);
           min = second.get(0).count;
           ind = 0;
           for ( int i = 1; i<second.size(); i++){
               if (second.get(i).count <= min){
                   min = second.get(i).count;
                   ind = i;
               }
           }
           CharNode nodeLeft = second.get(ind);
           second.remove(ind);
           second.add(new CharNode(nodeLeft, nodeRight));
       }
       second.get(0).setHuffmanCode("");

       return null;
   }





   public String decode (String Message, Map<String, Character> charTable ){
       String decoded = new String();

       return null;

   }
}
