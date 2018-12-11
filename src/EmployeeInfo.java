import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeInfo {

  /*The class will have 2 fields
  StringBuilder name;
  String code;*/
  StringBuilder name = new StringBuilder();
  String code;
  String deptId;
  Pattern p;
  Scanner in;

  /**
   * The class will have the following methods defined.
   */
  public EmployeeInfo() {

    /**The class will have the following methods defined:
    *public StringBuilder getName()
    public String getCode()
    private void setName()
    private void createEmployeeCode(StringBuilder name)
    private String inputName()
    private boolean checkName(StringBuilder name)*/

    in = new Scanner(System.in);

    setName();
    checkName(name);
    createEmployeeCode(name);
    String patternString = "([A-Z])[a-z][a-z][a-z]\\d\\d";
    p = Pattern.compile(patternString);
    setDeptId();
    in.close();
  }

  //The following new methods have to be defined:
  // public String reverseString(String id)

  /**
   * EmployeeInfo class that will reverse the order of the text stored for the department id.
   * This should be done recursively using a method named reverseString().
   * @param id employee code
   * @return code reversed
   */
  public String reverseString(String id) {
    char letter = id.charAt(id.length() - 1);

    if (id.length() == 1) {
      return Character.toString(letter);

    } else {
      return letter + reverseString(id.substring(0,id.length() - 1));
    }
  }

  public StringBuilder getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  private void setName() {
    name.append(inputName());
  }

  private void createEmployeeCode(StringBuilder name) {
    Boolean containsSpace = name.toString().contains(" ");
    if (containsSpace) {
      code = name.toString().substring(0,1);
      int space = name.toString().indexOf(" ");
      int space1 = space;
      code += name.toString().substring(++space,name.length());

    } else {
      code = "guest";
    }
  }

  private String inputName() {
    System.out.println("Please enter your first and last name: ");
    String nameString = in.nextLine();

    return nameString;

  }

  private boolean checkName(StringBuilder name) {
    Boolean validInput = false;
    Boolean containsSpace = name.toString().contains(" ");
    if (containsSpace) {
      validInput = true;
    }
    return validInput;
  }

  /**
   * The following new methods have to be defined.
   * public String getDeptId()
   * */
  public String getDeptId() {
    System.out.println("Please enter the department ID: ");
    String deptId2 = in.nextLine();

    return deptId2;
  }

  //setDeptId() will call getDeptId() to get the id from the user before validId() is used to check
  // if the input matches the pattern.  If the pattern matches then the given id is set to deptId
  // otherwise a default value of None01 should be assigned.
  private void setDeptId() {
    String inputId = getDeptId();
    if (validId(inputId)) {
      deptId = reverseString(inputId);


    } else {
      deptId = "None01";
    }
  }

  private String getId() {
    return deptId;
  }

  private boolean validId(String id) {
    Boolean matches = false;

    Matcher matcher = p.matcher(id);
    matches = matcher.matches();
    return matches;
  }

  @Override
  public String toString() {
    return "Employee Code : " + code + "\n"
        +
        "Department Number : " + deptId + "\n";
  }
}
