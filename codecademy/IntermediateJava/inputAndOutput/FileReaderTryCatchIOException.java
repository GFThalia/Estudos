/*Take a look at our program on the right that implements a try-catch block:
* You will notice in the method signature we have removed the throws IOException clause since it is caught in the try block.
* Moving inside the main method you will see we have deliberately created a file path that is incorrect in order to get the compiler to throw an IOException.
* Inside the try block we try to read the data that is contained in the file with the bad path, resulting in the Exception being thrown.
* The catch block catches the exception and prints back out to the user what has happened… it doesn’t crash the program. 
*/

package codecademy.IntermediateJava.inputAndOutput;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTryCatchIOException {
  public static void main(String[] args) {
    String path = "/a/bad/file/path/to/thisFile.txt";
    try {
      FileReader reader = new FileReader(path);  
      while (reader.ready()) {    
        System.out.print((char) reader.read());    
      }    
      reader.close();
    } catch (IOException e) {
      System.out.println("There has been an IO exception!");
      System.out.println(e);
    }
  }
}
