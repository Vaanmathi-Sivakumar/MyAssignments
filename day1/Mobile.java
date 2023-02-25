package week1.day1;

public class Mobile {

	String mobileBrandName ="oppo";
	char mobileLogo='o';
	short noOfMobilePiece=999;
	int modelNumber=232425;
	long mobileImeiNumber=34567890123L;
	float mobilePrice=39999.65F;
	boolean isDamaged=true;
	public static void main(String[] args) 
	{
		Mobile mob=new Mobile();
		System.out.println(mob.mobileBrandName);
		System.out.println("Mobile logo ="+mob.mobileLogo);
		System.out.println("No. of mobile piece "+" ="+mob.noOfMobilePiece);
		System.out.println("Mobile IMEI number "+" ="+mob.mobileImeiNumber);
		System.out.println("Mobile price "+" ="+mob.mobilePrice);
		System.out.println("Damaged "+" ="+mob.isDamaged);
		
	}
}
