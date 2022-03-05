import java.util.Scanner;

public class J2439 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		 
		int num = in.nextInt();
		in.close();
 
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
		
		
	}


