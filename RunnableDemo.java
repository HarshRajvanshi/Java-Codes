package OK;


class Hi2 implements Runnable{
	public void run() {
	for(int i=0;i<500;i++) {
		System.out.println(i+" of HI");
	}
	}
	
}
class Hello2 implements Runnable{
	public void run() {
		for(int i=0;i<500;i++) {
			System.out.println(i+" of HELLO");
		}
		}
		
}


public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi2 obj1=new Hi2();
		Hello2 obj2=new Hello2();		
		
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
	    t1.start();
	    t2.start();

	}

}
