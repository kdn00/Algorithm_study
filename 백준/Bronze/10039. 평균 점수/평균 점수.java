import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = 0, num = 0;
		for(int i = 0; i<5; i++) {
			num = sc.nextInt();
			if(num < 40) {
				sum += 40;
			} else {
				sum += num;
			}
		} System.out.println(sum/5);
	}
}