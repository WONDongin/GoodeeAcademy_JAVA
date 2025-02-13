package test;
/*
구동 클래스를 실행 했을 때 다음의 결과가 나오도록 
RemoteControl 인터페이스 완성하기

[결과]
TV를 켭니다.
Tv의 볼륨을 10으로 설정합니다.
TV를 끕니다.
무음 처리합니다.
Audio를 켭니다.
Audio의 볼륨을 20으로 설정합니다.
Audio를 끕니다.
무음을 해제합니다.
건전지를 교환합니다.
*/
interface RemoteControl {
	int volumn = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int i);
	abstract void setMute(boolean b);
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
class Television implements RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	@Override
	public void setVolume(int volumn) {
		System.out.println("Tv의 볼륨을 "+volumn+"으로 설정합니다.");
	}
	@Override
	public void setMute(boolean b) {
		System.out.println( b == true ? "무음 처리합니다." : "무음을 해제합니다.");
	}
}
class Audio implements RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	@Override
	public void setVolume(int volumn) {
		System.out.println("Audio의 볼륨을 "+volumn+"으로 설정합니다.");
	}
	@Override
	public void setMute(boolean b) {
		System.out.println( b == true ? "무음 처리합니다." : "무음을 해제합니다.");
	}
}
public class Test01 {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn(); //TV를 켭니다.
		rc.setVolume(10); //Tv의 볼륨을 10으로 설정합니다.
		rc.turnOff(); //TV를 끕니다.
		rc.setMute(true); //무음 처리합니다.
		rc = new Audio();
		rc.turnOn(); //Audio를 켭니다.
		rc.setVolume(20); //Audio의 볼륨을 20으로 설정합니다.
		rc.turnOff(); //Audio를 끕니다.
		rc.setMute(false); //무음을 해제합니다.
		RemoteControl.changeBattery(); //건전지를 교환합니다.
	}
}
