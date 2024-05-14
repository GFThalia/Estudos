package codecademy.IntermediateJava.inputAndOutput;

import java.io.FileWriter;
import java.io.IOException;
public class FileWriter1 {
  public static void main(String[] args) throws IOException{
    // Your code here:
    FileWriter output = new FileWriter("output.txt");
    String outputText = "testando, 1, 2, 3, testando.";
    output.write(outputText);
    output.close();
  }
}