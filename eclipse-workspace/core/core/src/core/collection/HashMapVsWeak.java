package core.collection;

import java.util.HashMap;
import java.util.WeakHashMap;

public class HashMapVsWeak {

	public static void main(String[] args) {
		Temp t = new Temp();

		WeakHashMap map = new WeakHashMap();

		map.put(t, "op");

		System.out.println(map);

		t = null;

		System.gc();
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(map);
	}

}

class Temp {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "temp";
	}

	@Override
	public void finalize() {
		// TODO Auto-generated method stub
		System.out.println("finalize method called");
	}
}
