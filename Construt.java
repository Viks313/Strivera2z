class Demo {
	int x, y;

	Demo(int p, int q) {
		x = p;
		y = q;
		System.out.println(x);
		System.out.println(y);
	}

	Demo() {
		System.out.println("Default constructor");
	}

	Demo(int f) {
		System.out.println(f);
		System.out.println("Parameterised constructor");
	}
}

class Construt {

	public static void main(String []args) {

		Demo d1 = new Demo(5, 65);
		Demo d2 = new Demo(35, 5);
		Demo d4 = new Demo();
		Demo d3 = new Demo(565);
	}
}
