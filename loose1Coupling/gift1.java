package loose1Coupling;

public class gift1 implements gift{
private Exam Exam;
 gift1 (Exam Exam)
{
	this.Exam=Exam;
}
	@Override
	public void gift() {
		Exam.pass();		
	}

}
