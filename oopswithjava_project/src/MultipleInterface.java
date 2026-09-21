public class MultipleInterface {
    public static void main(String[] args){
        Smartphone p1 =new Smartphone();
        p1.clickPhoto();
        p1.playMusic();
    }
}
interface Camera{
     void clickPhoto();
}
interface  MusicPlayer{
     void  playMusic();
}
class Smartphone implements Camera,MusicPlayer{
    public void clickPhoto(){
        System.out.println("Photo clicked using Smartphone");
    }
    public void  playMusic(){
        System.out.println("Music is playing on Smartphone");
    }
}
