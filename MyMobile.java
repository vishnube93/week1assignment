package week1.assignment;

public class MyMobile {
	String mobile = "This is My Mobile!";
	short sim = 2;
	int battery = 5000;
	String feature = "My Mobile is used to:";

	public void makeCall() {
		System.out.println("Make calls");
	}

	public void sendMsg() {
		System.out.println("Send message");
	}

	private void payBills() {
		System.out.println("Pay bills");
	}

	public static void main(String[] args) {
		MyMobile obj = new MyMobile();
		System.out.println(obj.mobile);
		System.out.println("It has " + obj.sim + " Sims");
		System.out.println("It has " + obj.battery + " mAH Battery capacity");
		System.out.println(obj.feature);
		obj.makeCall();
		obj.sendMsg();
		obj.payBills();
	}
}
