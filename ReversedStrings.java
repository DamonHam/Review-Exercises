/**
If you want to add this to Codewars you will have to change the class name,
or just use the inner bits, can't have two files named Kata
**/
public class ReversedStrings {
	public static String solution(String str) {
	String reversed = "";
	for (int i = str.length() - 1; i >= 0; i--) {
		reversed += str.charAt(i);
	}
	return reversed;
	}
}
