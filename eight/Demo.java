package eight;

public class Demo {
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("A");
		ThreadClass thread1 = new ThreadClass(stringBuffer);
		ThreadClass thread2 = new ThreadClass(stringBuffer);
		ThreadClass thread3 = new ThreadClass(stringBuffer);
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class ThreadClass extends Thread {
	StringBuffer stringBuffer;

	public ThreadClass(StringBuffer stringBuffer) {
		this.stringBuffer = stringBuffer;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	synchronized(stringBuffer) {
		for(int i=0;i<100;i++) {
			System.out.print(this.stringBuffer+" ");
		}
		this.stringBuffer.replace(0,1,""+(char)(this.stringBuffer.charAt(0)+1));
	}
		
	}
}
