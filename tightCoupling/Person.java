package tightCoupling;

public class Person {
 public void start()
 {
	 Bus b=new Bus();
	 b.run();
	 Train t=new Train();
	 t.go();
 }
}
