package day;


public class Bank {
	 int regno;
	 String loc;
	 Bank(int regno , String loc){
		 this.regno=regno;
		 this.loc=loc;
	 }
		public static void main(String[] args) {
			Bank b= new Bank(123, "bangalore");
			System.out.println(b.regno);
			System.out.println(b.loc);
			

		}

	}

