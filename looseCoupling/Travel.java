package looseCoupling;
public class Travel implements Itravel{

	//sending transport object into travel class
	private Transport transport;
	
	//constructor  set the value
	Travel(Transport transport){
		this.transport=transport;
	}
	
	//
	@Override
	public void start() {
		transport.start();
	}
}