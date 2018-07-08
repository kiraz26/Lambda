package warmup;

public class Animal implements Moveable{

	@Override
	public void move(int distance) {
		System.out.println("Animal is moving mile: "+distance);
		
	}

}
