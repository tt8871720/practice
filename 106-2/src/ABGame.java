import java.util.Scanner;

public class ABGame {

	public static void main(String[] args) {
String answer = "1234";
Scanner scanner = new Scanner(System.in);
int a = 0;
int b = 0;
	while(a !=4) {
		a = 0;
		b = 0;
		System.out.println("Please entry your number");
		String guess = scanner.nextLine();
		for (int i = 0; i < answer.length(); i++) {
			for (int j = 0; j <guess.length(); j++) {
				if(answer.charAt(i) == guess.charAt(j) & i == j) {
					a++;
				}else {
					if(answer.charAt(i) == guess.charAt(j)) {
						b++;
						break;
					}
				}
			}
			
		}
	System.out.println(a + "A:" + b + "B");}
	}}