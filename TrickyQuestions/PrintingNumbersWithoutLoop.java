package TrickyQuestions;
import java.io.*;
public class PrintingNumbersWithoutLoop {
   public static void main(String[] args)
	    {
	        printNumbers(1, 100);
	    }
	    public static void printNumbers(int initial, int last)
	    {
	        if (initial <= last) {
	            System.out.print(initial + " ");
	            printNumbers(initial + 1 ,last);
	        }
	    }
	}

