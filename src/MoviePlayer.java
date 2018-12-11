//Create a class called MoviePlayer that extends Product and implements MultimediaControl.
public class MoviePlayer extends Product implements MultimediaControl {

  //Add 2 fields to this class called screen and monitor type and assign appropriate types to them
  Screen screen;
  MonitorType monitorType;

  /**
   * The production facility will also create portable movie players.
   */
  public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    super(name);
    this.screen = screen;
    this.monitorType = monitorType;
  }

  /**
   * The main difference between these and the audio players is that they contain screens.
   */
  public MoviePlayer() {
    super("Windows Media PLayer Classic");
    screen = new Screen("200x200", 33, 33);
    monitorType = MonitorType.LCD;
  }

  //Complete the methods from the MultimediaControl interface in a similar fashion to the
  //audio player
  @Override
  public void play() {
    System.out.println("Playing movie");
  }

  @Override
  public void stop() {
    System.out.println("Stop movie");
  }

  @Override
  public void previous() {
    System.out.println("Previous movie");
  }

  @Override
  public void next() {
    System.out.println("Next movie");
  }

  //Create a toString method that calls the product toString, displays the monitor and the
  //screen details.
  @Override
  public String toString() {
    return super.toString()
        +
        "Screen : "
        + screen
        +
        "\nMonitorType : "
        + monitorType;
  }
}
