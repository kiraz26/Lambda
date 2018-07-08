package warmup;

public class ComputeStuff {

	public static void main(String[] args) {

		Computable evenNumFinder = new Computable()  {
			@Override
			public boolean canBeComputed(Integer i, Integer j)  {
				return (i % 2 == 0) && (j % 2 == 0);
			}
		};

	}
}

@FunctionalInterface
interface Computable {
	boolean canBeComputed(Integer i, Integer j);
}
