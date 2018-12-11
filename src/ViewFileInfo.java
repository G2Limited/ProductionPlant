import java.io.FileReader;

public class ViewFileInfo {

  /**
   * Create a driver class named ViewFileInfo that will read the information from
   * the TestResults.txt file and display the contents to the console.
   */
  public static void main(String[] args) {
    try {
      FileReader fileReader = new FileReader("C:\\LineTests\\TestResults.txt");
      int i;
      while ((i = fileReader.read()) != -1) {
        System.out.print((char) i);
      }
    } catch (Exception ex) {
      System.out.println("Unable to read file");
    }
  }

}
