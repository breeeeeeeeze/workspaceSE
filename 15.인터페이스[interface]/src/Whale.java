
public class Whale implements Mermmalia {

	@Override
	public void operation1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void operation2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void operation3() {
		// TODO Auto-generated method stub
		
	}
	
	// static 이니까 괜찮다......? 
	public static void main(String[] args) {
		Whale whale = new Whale();
		whale.operation1();
		whale.operation2();
		whale.operation3();
		Mermmalia mermmalia=whale;
		mermmalia.operation1();
		mermmalia.operation2();
		mermmalia.operation3();
	}

}
