import java.util.ArrayList;
import java.util.Random;

public class Poker {
	String flowers = "SHDC";
	ArrayList<Integer> cards = new ArrayList<>();
	Random random = new Random();

	public Poker() {
for (int i = 0; i < 52; i++) {
	cards.add(i);
	System.out.println((cards.get(i)%13) + 1 + " " + flowers.charAt((i /13)));
}
	}
	public void shuffle() {
//		System.out.println("Shuffle");
		for (int i = 0; i < 52; i++) {
	int s = random.nextInt(52);
	
cards.set(i, s);
System.out.print(cards.get(i)%13 + 1 + " " );
if(i % 13 ==0) {
	System.out.println();
}
	}
}}
