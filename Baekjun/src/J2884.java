import java.util.Scanner;

public class J2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Scanner sc=new Scanner(System.in);
	 
	 int h=sc.nextInt();
	 int m=sc.nextInt();
	 
	 
	 if(h-1<0&&m-45<=0) {System.out.println(h+23+" "+(m+15));return;}
	 else if(m-45<=0) System.out.println(h-1+ " "+(m+15));
	 else System.out.println(h+" " +(m-45));
	 
	 
	}

}
