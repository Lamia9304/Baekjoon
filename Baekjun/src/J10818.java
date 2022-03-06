import java.util.Arrays;
import java.util.Scanner;

public class J10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int[] num=new int[sc.nextInt()];
		
		
		
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		
		Arrays.sort(num);
		
		System.out.println(num[0]+" "+num[num.length-1]);
		
		
		
		
	}

}
