import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr;
		int testcase = sc.nextInt();

		for(int i = 0 ; i < testcase ; i++) {
			int n = sc.nextInt();
			arr = new int[n];
			double sum = 0;

			for(int j = 0 ; j < n ; j++) {
				int grade = sc.nextInt();
				arr[j] = grade;
				sum += grade;
			}
			
			double avg = (sum / n) ;
			double count = 0;
			
			for(int j = 0 ; j < n ; j++) {
				if(arr[j] > avg) count++;
			}
			System.out.printf("%.3f%%\n",(count/n)*100);
		}
		sc.close();
	}
}