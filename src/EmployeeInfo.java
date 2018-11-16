import java.util.Scanner;

public class EmployeeInfo {
  private StringBuilder name;
  private String code;

  //following methods defined
  public EmployeeInfo(){
    setName();
  }

  public StringBuilder getName(){
    return name;
  }

  public String getCode(){
    return code;
  }

  private void setName(){
    String nameString = inputName();
    name = new StringBuilder(nameString);
    createEmployeeCode(name);
  }

  private void createEmployeeCode(StringBuilder name){
    if (checkName(name)){
      code = name.charAt(0) + name.substring(name.indexOf("") + 1);
    }
    else {
      code = "guest";
    }
  }

  private String inputName(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter your first and last name: ");
    String nameString = scanner.nextLine();

    return nameString;
  }

  private boolean checkName(StringBuilder name){
    return (name.indexOf(" ") > 0);
  }
}