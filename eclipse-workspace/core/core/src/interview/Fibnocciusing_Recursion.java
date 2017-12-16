package interview;

public class Fibnocciusing_Recursion {

	int j = 0;
	int k = 1;
	int p;

	void m2(int i) {

		if (i <= 10) {
			p = j + k;

			j = k;
			k = p;
			System.out.print(" " + p);
			i++;
			m2(i);
		}
	}

	int j1 = 0;
	int k1 = 1;

	public static void main(String[] args) {
		Fibnocciusing_Recursion f = new Fibnocciusing_Recursion();

		System.out.print(f.j1 + " " + f.k1);
		f.m2(f.k1);

	}

}
