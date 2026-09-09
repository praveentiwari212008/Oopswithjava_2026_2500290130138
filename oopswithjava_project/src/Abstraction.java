abstract class Device{
    //variable
    String brand ="Samsung";
    abstract void turnOn();
    void showBrand(){
        System.err.println("Brand: "+brand);
    }
}
//interface1
interface  Camera {
    int MAX_ZOOM=10;//public static final
    void takePhoto();//abstract and public method
    default void cameraInfo(){
        System.err.println("Camera is ready");
    }
}
//interface02
interface MusicPlayer{
    String TYPE="Digital";//public static final
    void playMusic();//abstract and public method
    default void musicInfo(){
        System.err.println("Music player is ready");
    }
}
class Smartphone extends Device implements Camera, MusicPlayer{
    //implementing abstract method of device 
    void turnOn(){
        System.err.println("Smartphone is turned ON.....");
    }
    public void takePhoto(){
        System.err.println("Taking Photo....");
    }
    public void playMusic(){
        System.err.println("Playing Music....");
    }
}
public class Abstraction{
    public static void main(String[] args) {
        Smartphone s=new Smartphone();
        s.turnOn();
        s.showBrand();
        s.takePhoto();
        s.playMusic();
        s.cameraInfo();
        s.musicInfo();
       System.err.println("Maximum Zoom: "+ Camera.MAX_ZOOM);
       System.err.println("Music Type: "+MusicPlayer.TYPE);
       
    }
}