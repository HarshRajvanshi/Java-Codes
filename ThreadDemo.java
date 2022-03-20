package OK;


class Hi extends Thread{
	public void run() {
	for(int i=0;i<500;i++) {
		System.out.println(i+" of HI");
	}
	}
	
}
class Hello extends Thread{
	public void run() {
		for(int i=0;i<500;i++) {
			System.out.println(i+" of HELLO");
		}
		}
		
}


public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi obj1=new Hi();
		Hello obj2=new Hello();
	    obj1.start();
	    obj2.start();

	}

}
