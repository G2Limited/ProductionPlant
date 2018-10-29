/*Garrett Graber
09/29/2018
Sources used: Professor Scott VanSelow, https://www.javatpoint.com/
, https://docs.oracle.com/javase/tutorial/java, Philemon Petit-Frere
This file creates the driver class Main */

import  java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    /*//create new objects from class Widget
    Widget w1 = new Widget("Widget 1");
    System.out.println(w1.toString());
    Widget w2 = new Widget("Widget 2");
    System.out.println(w2.toString());

    for (ItemType it : ItemType.values()) {
      System.out.println(it + " " + it.code);
    }*/

    /*MoviePlayerDriver.testMoviePlayer();
    PlayerDriver.testPlayer();*/

    //Write ome line of code to create and Array of products
    ArrayList<Product> productList = new ArrayList<>(); //Change to studentProducts for replit
    //Write one line of code to call testCollection and assign the result to the arraylist
    productList = testCollection();

    //Add functionality to your classes that would allow them to be sorted by name with the
    //Collections.sort method.
    /*Collections.sort(productList);
    print(productList);*/

    //Completed testCollection header
    //Demonstrate Product's printType
    Product.printType(productList,MoviePlayer.class);
    Product.printType(productList,AudioPlayer.class);

  }
  public static  <T> void print(List<T> products){

    for (T t :products) {
      System.out.println(t.toString());
    }
  }

  private static ArrayList<Product> testCollection() {

    /*Manufacturer : OracleProduction
    Serial Number : 3
    Date : Thu Oct 25 12:22:46 UTC 2018
    Name : DBPOWER MK101
    Screen : Resolution :  720x480
    Refresh rate : 40
    Response time : 22
    Monitor Type : LCD
    Manufacturer : OracleProduction
    Serial Number : 4
    Date : Thu Oct 25 12:22:46 UTC 2018
    Name : Pyle PDV156BK
    Screen : Resolution : 1366x768
    Refresh rate : 40
    Response time : 22
    Monitor Type : LED
    Manufacturer : OracleProduction
    Serial Number : 2
    Date : Thu Oct 25 12:22:46 UTC 2018
    Name : Walkman
    Audio Spec : WAV
    Type : AUDIO
    Manufacturer : OracleProduction
    Serial Number : 1
    Date : Thu Oct 25 12:22:46 UTC 2018
    Name : iPod Mini
    Audio Spec : MP3
    Type : AUDIO*/
    ArrayList<Product> products = new ArrayList<>();
    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101", new Screen("720x480",40,22),MonitorType.LCD);
    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK", new Screen("1366x768",40,22),MonitorType.LED);
    AudioPlayer a1 = new AudioPlayer("Walkman", "WAV");
    AudioPlayer a2 = new AudioPlayer("iPod Mini", "MP3");

    products.add(m1);
    products.add(m2);
    products.add(a1);
    products.add(a2);
    return products;
  }
}

//Widget extends Product
abstract class Widget extends Product {
  //Widget accepts name then uses name as parameter for Product's constructor
  public Widget(String name) {
    //super calls constructor of Product
    super(name);
  }
}