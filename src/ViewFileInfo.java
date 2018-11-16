import java.io.FileReader;

public class ViewFileInfo {

  public static void main(String[] args) {
    try {
    FileReader fr = new FileReader("C:\\LineTests\\TestResults.txt");
      int i;
      while ((i = fr.read()) != -1) {
        System.out.print((char) i);
      }
    } catch (Exception ex) {
      System.out.println("Unable to read file");
    }
  }

}
