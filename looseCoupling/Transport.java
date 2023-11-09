package looseCoupling;

public interface Transport {

	
	public default void start() {
		System.out.println("train journey started....");
		
	}

}

