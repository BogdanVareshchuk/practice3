package ua.edu.uzhnu.practice3;


import java.util.Map;

/**
 * Created by User-Bogdan on 28.03.2017.
 */
public class CharNode {

    char value;
    int count;
    String huffmanCode;
    CharNode left;
    CharNode right;

    public CharNode(char value) {
        this.value = value;
    }

    public CharNode(CharNode left, CharNode right) {
        this.left = left;
        this.right = right;
        this.count = left.count + right.count;
    }

    public int incrementCount(){
        return count++;
    }

    public void setHuffmanCode(String code){
        this.huffmanCode = code;
        if (this.left != null){
            this.left.setHuffmanCode(code+"0");
        } else
        if (this.right != null) {
            this.right.setHuffmanCode(code + "1");
        }
    }

}
