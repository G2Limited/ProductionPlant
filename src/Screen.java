//Create a class called Screen that implements ScreenSpec
public class Screen implements ScreenSpec {
  //Add three fields:
  //String resolution
  //int refreshrate
  //int responsetime
  String resolution;
  int refreshrate;
  int responsetime;

  @Override
  public String getResolution() {
    return null;
  }

  @Override
  public int getRefreshRate() {
    return 0;
  }

  @Override
  public int getResponseTime() {
    return 0;
  }

  //Add a toString method that will return the details of the 3 field in the same format as
  //the Product Class
  @Override
  public String toString() {
    String line = "Resolution : " + resolution + "\n" +
        "Refresh Rate : " + refreshrate + "\n" +
        "Response Time : " + responsetime;
    return line;
  }

  public Screen(String resolution, int refreshrate, int responsetime) {
    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;
  }
}