//Create a class called AudioPlayer that is a subclass of Product and implements
//the MultimediaControl interface
public class AudioPlayer extends  Product implements MultimediaControl {
  //The class will have 2 fields
  // String audioSpecification
  // ItemType mediaType
  private String audioSpecification;
  private ItemType mediaType;

  public AudioPlayer() {
    super("Player");
    audioSpecification = "";
    mediaType = ItemType.AUDIO;
  }

  //Create a constructor that will take in 2 parameters – name and audioSpecification.
  //The constructor should call its parents constructor and also setup the media type.
  AudioPlayer(String name, String audioSpecification){
    super(name);
    this.audioSpecification= audioSpecification;
    this.mediaType= ItemType.AUDIO ;
  }

  public String getAudioSpecification() {
    //Get this object's audioSpecification value
    return audioSpecification;
  }

  //Implement the methods from the MultimediaControl interface by simply writing the action to
  //the console. E.g. in play System.out.println("Playing");
  @Override
  public void play() {
    System.out.println("Playing");
  }

  @Override
  public void stop() {
    System.out.println("Stopping");
  }

  @Override
  public void previous() {
    System.out.println("Previous");

  }

  @Override
  public void next() {
    System.out.println("Next");

  }

  //Create a toString method that will display the superclasses toString method, but also add
  //rows for Audio Spec and Type
  @Override
  public String toString() {
    return
        super.toString()+
            "Audio Spec : " + audioSpecification +
            "\nType : " + mediaType
        ;
  }

  //Create a driver class for AudioPlayer that will test to see whether we can instantiate
  //occurrences of it, use the media controls and print out their details to the console.
  public static void main(String [] args){
    AudioPlayer ap = new AudioPlayer("testName","testSpecs");
    System.out.println(ap.toString());
  }
}
