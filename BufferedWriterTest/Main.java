import java.io.*;

public class Main {
  public static void main(String[] args) {
    try {
      String fileName = "output.txt";
      File file = new File(fileName);
      FileWriter fileWriter = new FileWriter(file, true); // true secifies append
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

      String sentence1 = "This is a sentence.\n";
      String sentence2 = "This is another sentence.\n";

      bufferedWriter.write(sentence1);
      bufferedWriter.write(sentence2);

      bufferedWriter.close();
    } catch (Exception e) {
      System.out.println("An exception occurred: " + e);
    }
  }
}
