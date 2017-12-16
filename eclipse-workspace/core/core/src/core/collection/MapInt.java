package core.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("unchecked")
public class MapInt {

	public static void main(String[] args) {

		HashMap map = new HashMap();

		map.put(101, "omprk");
		map.put(102, "adhsk");
		map.put(103, "dsfhj");
		map.put(104, "safhj");

		Set s = map.entrySet();

		Iterator l = s.iterator();

		while (l.hasNext()) {

			Map.Entry entry = (Map.Entry) l.next();

			if (entry.getKey().equals("safhj")) {
				entry.setValue("pappu");
			}

			

		}
		System.out.println(s);
	}

}
