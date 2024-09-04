package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n1, n2 = 0;
		System.out.print("Give me 2 integers to be averaged.");
	    n1 = scan.nextInt();
	    n2 = scan.nextInt();
	    
	    double avg = n1+n2;
	    avg /= 2;
	    System.out.print("Average of "+n1+ " and"+n2+ " is" + avg);
	    
	}

}
