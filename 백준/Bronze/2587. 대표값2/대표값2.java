import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int sum = 0;
		for(int i=0; i<5; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		int avg = sum/5;
		Arrays.sort(num);
		System.out.println(avg+"\n"+num[2]);
		sc.close();
	}
}