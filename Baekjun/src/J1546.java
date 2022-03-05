import java.util.Arrays;
import java.util.Scanner;

public class J1546 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc=new Scanner(System.in);
		
	
		double nums[]=new double[sc.nextInt()];
		double max=nums[0];
		
		
		for(int i=0;i<nums.length;i++) {
			nums[i]=sc.nextDouble();
		}
		
		sc.close();
		
		double sum=0;
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length;i++) {
			sum+=((nums[i]/nums[nums.length-1])*100);
		}
		
		System.out.println(sum/nums.length);
		
		
	}
    
	
	
}
