/*Garrett Graber
09/29/2018
This file creates a class called Product */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Product implements Item,Comparable<Product> {

  ////Add the following fields to Product
  // int serialNumber
  // String manufacturer
  // Date manufacturedOn
  // String name
  private int serialNumber;
  //String manufacturer;
  private Date manufacturedOn;
  private String name;

  final String manufacturer = Item.manufacturer;
  static int currentProductionNumber = 1;

  /**
   * Returns 1 if name Greater than n.getName
   * Return 0 if both are equal
   * Return -1 if name is lessThan n.getName
   */
  public int compareTo(Product n) {

    return name.compareTo(n.getName());
    // Returns 1 if name Greater than n.getName
    // Return 0 if both are equal
    // Return -1 if name is lessThan n.getName
  }

  public void setProductionNumber(int productionNumber) {
    //this.currentProductionNumber = parameter;
    serialNumber = productionNumber;
  }

  //A method setName that would have one String parameter
  public void setName(String name) {
    this.name = name;
  }

  //A method getName that would return a String
  public String getName() {
    return name;
  }

  public Date getManufactureDate() {
    return manufacturedOn;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  Product(String name) {
    //Widget will pass a name to this constructor
    //Product's instance name will be set to parameter name
    this.name = name;
    //Also assign a serial number from the currentProductionNumber. The currentProductionNumber
    //should be incremented in readiness for the next instance
    serialNumber = currentProductionNumber++;
    //Set manufacturedOn as the current date and time
    manufacturedOn = new Date();
  }

  static void printType(List<?> list, Class<? extends Product> c) {
    //Check if Class matches the Object's class and if class matches then print toString.
    for (Object o : list) {
      if (c.isInstance(o)) {
        System.out.println(o.toString());
      }

    }

  }

  /*Add a toString method that will return the following: (example data shown).
  Manufacturer : OraclProduction
  Serial Number : 1
  Date : Thu May 14 15:18:43 BST 2015
  Name : Product Name*/
  @Override
  public String toString() {
    return "Manufacturer : " + manufacturer + "\n"
        +
        "Serial Number : " + serialNumber + "\n"
        +
        "Date : " + manufacturedOn + "\n"
        +
        "Name : " + name + "\n";
  }
}
