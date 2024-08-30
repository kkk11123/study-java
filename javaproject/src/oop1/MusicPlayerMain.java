package oop1;

public class MusicPlayerMain {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        mp.start();
        int i = 0;
        while(i < 11){
        mp.Up();
        i++ ;
        }
        int j = 0;
        while(j < 1 ){
            mp.Down();
            j++ ;
        }
        mp.Pause();
        mp.check();
    }
}
