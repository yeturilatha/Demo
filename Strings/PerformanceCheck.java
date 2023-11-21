package Strings;

public class PerformanceCheck {

	public static void main(String[] args) {
		
		long start_time=System.currentTimeMillis();
		
		StringBuffer sb=new StringBuffer("Hello ");
		for (int i = 0; i < 10000; i++) {
			sb.append("world");
		}
		System.out.println("Time taken by StringBuffer="+(System.currentTimeMillis()-start_time)+"ms");
	
		start_time=System.currentTimeMillis();
		StringBuilder sb1=new StringBuilder("Hello ");
		for (int i = 0; i < 10000; i++) {
			sb1.append("world");
		}
		System.out.println("Time taken by StringBuilder="+(System.currentTimeMillis()-start_time)+"ms");
	}
}