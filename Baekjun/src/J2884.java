import java.util.Scanner;

public class J2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt(); // ��
		int M = sc.nextInt(); // ��
		sc.close();
		
		if(M < 45) {
			H--;		// ��(hour) 1 ����
			M= 60 - (45 - M); 	// ��(min) ����
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else {
			System.out.println(H + " " + (M - 45));
	 
		}
	}
}
