
public class AB {
String num;
public AB(String num) {
	this.num = num;
}
public int validate(String ans) {
	 int result = 0;
	 for (int i = 0; i < ans.length(); i++) {
		 for (int j = 0; j < num.length(); j++) {
if(ans.charAt(i)==num.charAt(j) & i == j) {
	result = result + 10;
}			else {
	if(ans.charAt(i)==num.charAt(j)) {
		result = result +1;
		break;
	}
}
		}
		
	}
	return result;
 }
}
