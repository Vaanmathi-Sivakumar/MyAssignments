package week2.day1;

public class Mobile {// class
	public void switchOn()//method
	{
		System.out.println("Switch on Mobile");
	}
	public void switchOff()
	{
		System.out.println("Switch off Mobile");
	}
	public void sendText()
	{
		System.out.println("send a text");
	}
	public void makeCall()
	{
		System.out.println("Make a call");
	}
	public void downloadApps()
	{
		System.out.println("Download an app");
	}
	public void capturePicture()
	{
		System.out.println("Capture a picture");
	}
	public void takeVideos()
	{
		System.out.println("Take Videos");
	}
	public void turnOnWifi()
	{
		System.out.println("Turn on Wi-Fi");
	}
	public void turnOffWifi()
	{
		System.out.println("Turn off Wi-Fi");
	}
	public void playSongs()
	{
		System.out.println("Playing songs");
	}
	public static void main(String[] args) {//main method
		Mobile mob = new Mobile();//mobile() is a constructor
		mob.switchOn();//calling method by object
		mob.switchOff();
		mob.sendText();
		mob.makeCall();
		mob.downloadApps();
		mob.capturePicture();
		mob.takeVideos();
		mob.turnOnWifi();
		mob.turnOffWifi();
		mob.playSongs();
	}
}
