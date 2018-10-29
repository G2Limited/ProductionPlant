/*Garrett Graber
09/29/2018
This file creates an interface of Item which will include a constant for the
manufacturer, set methods for ProductionNumber and Name, and get methods
for Name, Manufacture Date, and Serial Number*/

import java.util.Date;
import java.util.*;

public interface Item {

  //A constant called manufacturer that would be set to “OracleProduction”.
  String manufacturer = "OraclProduction";

  //A method setProductionNumber that would have one integer parameter
  public void setProductionNumber(int productionNumber);

  //A method setName that would have one String parameter
  public void setName(String name);

  //A method getName that would return a String
  public String getName();

  //A method getManufactureDate that would return a Date
  public Date getManufactureDate();

  //A method getSerialNumber that would return an int
  public int getSerialNumber();
}