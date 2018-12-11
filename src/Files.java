public class Files {

  /**
   * OraclProduction Ltd now wants to store the results of the tests and who carried out that test
   * to a file for archiving purposes.
   */
  public static void main(String[] args) {

    ProcessFiles pf = new ProcessFiles();
    try {
      pf.WriteFile("test3");
    } catch (Exception ex) {
      System.out.println("Could not work");
    }
  }
}
