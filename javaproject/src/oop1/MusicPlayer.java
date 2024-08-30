package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;


    public void start(){
        System.out.println("플레이어를 재생시킵니다.");
        isOn = true;
    }
    public void Up(){
        if (volume > 10) {
            System.out.println("더 이상 볼륨을 올릴 수 없습니다.");
        }
        else {
        System.out.println("볼륨을 증가합니다.");
        volume ++;
        System.out.println("현재 볼륨: " +volume);
    }
        }

    public void Down(){
        if(volume < 0){
            System.out.println("이미 최소 볼륨입니다.");
        }
        System.out.println("볼륨을 감소합니다.");
        volume --;
        System.out.println("현재 볼륨: " +volume);
    }
    public void Pause(){
        System.out.println("음악을 종료합니다.");
        isOn = false;
    }
    public void check(){
        if(isOn){
            System.out.println("재생중입니다.");
        }
        else{
            System.out.println("재생X");
        }
    }
}
