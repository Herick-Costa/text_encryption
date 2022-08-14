package encryption;

import javax.swing.JOptionPane;

public class BinaryEncryption {
  public static void main(String[] args) {

    String message1 = JOptionPane.showInputDialog("Enter the message to be encrypted: ").toLowerCase();

    String message2 = message1
    .replace("a", "0 ")
    .replace("b", "1 ")
    .replace("c", "10 ")
    .replace("d", "11 ")
    .replace("e", "100 ")
    .replace("f", "101 ")
    .replace("g", "110 ")
    .replace("h", "111 ")
    .replace("i", "1000 ")
    .replace("j", "1001 ")
    .replace("k", "1010 ")
    .replace("l", "1011 ")
    .replace("m", "1100 ")
    .replace("n", "1101 ")
    .replace("o", "1110 ")
    .replace("p", "1111 ")
    .replace("q", "10000 ")
    .replace("r", "10001 ")
    .replace("s", "10010 ")
    .replace("t", "10011 ")
    .replace("u", "10100 ")
    .replace("v", "10101 ")
    .replace("x", "10110 ")
    .replace("w", "10111 ")
    .replace("y", "11000 ")
    .replace("z", "11001 ");

    System.out.println(message2);
  }
}
  

