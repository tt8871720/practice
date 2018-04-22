import java.util.Scanner;

public class ABTester {

	public static void main(String[] args) {
		String ans = "1234";
		Scanner scanner = new Scanner(System.in);
String num;
int result = 0;
while(result /10 != 4) {
	System.out.println("Please entry your number");
	AB ab = new AB(scanner.nextLine());
	result = ab.validate(ans);
System.out.println((result/10) + "A" + (result%10) + "B");
}
	}
}
