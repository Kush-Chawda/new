package core.thread;

class Thread4 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}

		}
	}
}

class JoinExample

{

	public static void main(String[] args) throws Exception {
		Thread4 t4 = new Thread4();

		t4.start();
		Thread.currentThread().join();
		for (int i = 0; i < 10; i++) {
			System.out.println("main Thread");
			Thread.sleep(1000);
		}

	}
}
