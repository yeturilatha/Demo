package day;

public class Addition {
	public void display(int i,int j) {
		System.out.println("method with two int parameters");
		int a = i+j;
		System.out.println(a);
	}
   public int  sky(int i,int j , int k) {
		System.out.println("method with 3 int parameters");
		int b = i+j+k;
		System.out.println(b);
		return 20;
		
   }

	public static void main(String[] args) {
		Addition a = new Addition();
		a.display(2, 3);
		
      a.sky(1, 02, 20);
      

	}

}
