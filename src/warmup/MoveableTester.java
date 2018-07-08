package warmup;

public class MoveableTester {

	public static void main(String[] args) {

		Moveable m1 = new Animal();
		Moveable m2 = new Truck();
		Moveable m3 = new Motorcycle();

		m1.move(2);
		m2.move(5);
		m3.move(10);

		// Anonymous INNER CLASS
		Moveable m4 = new Moveable() {
			@Override
			public void move(int distance) {
				System.out.println("Transportation 1 is moving mile: " + distance + " mile");
			}
		};

		Moveable m5 = new Moveable() {
			@Override
			public void move(int distance) {
				System.out.println("Transportation 2 is moving mile: " + distance + " mile");
			}
		};

		Moveable m6 = new Moveable() {
			@Override
			public void move(int distance) {
				System.out.println("Transportation 3 is moving mile: " + distance + " mile");
			}

		};
		m4.move(55);
		m5.move(44);
		m6.move(33);

		// Lambda Expression is instance of a Functional Interface
		Moveable m7 = (int distance) -> {
			System.out.println("Transportation 4 is moving mile: " + distance + " mile");
		};
		// OR
		Moveable m8 = (distance) -> {
			System.out.println("Transportation 5 is moving mile: " + distance + " mile");
		};
		// OR
		Moveable m9 = distance -> System.out.println("Transportation 5 is moving mile: " + distance + " mile");

		m7.move(77);
		m8.move(88);
		m9.move(99);
		
		
	}

}
