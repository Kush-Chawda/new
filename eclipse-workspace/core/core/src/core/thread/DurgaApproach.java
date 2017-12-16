package core.thread;

class Durga extends Thread {
	public void run() {
		System.out.println("run");
	}

}

class DurgaApproach {
	public static void main(String[] args) {
		Durga d = new Durga();
		Thread t = new Thread(d);
		t.start();

		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("kush");
		System.out.println(Thread.currentThread().getName());
	}
}
