public class AudioPlayerDriver{
//private String audioSpecification;
//private ItemType mediaType;

  public static void  testAudioPlayer(){
    AudioPlayer ap1 = new AudioPlayer("ipod Mini", "MP3");
    ap1.play();
    ap1.stop();
    ap1.next();
    ap1.previous();
    System.out.println(ap1.toString());
    AudioPlayer ap2 = new AudioPlayer("Walkman", "WAV");
    System.out.println(ap2.toString());
  }
}