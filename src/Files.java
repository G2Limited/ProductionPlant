public class Files {

  public static void main(String[] args) {

    ProcessFiles pf = new ProcessFiles();
    try {
      pf.WriteFile("test3");
    } catch (Exception ex) {
      System.out.println("Could not work");
    }
  }
}
