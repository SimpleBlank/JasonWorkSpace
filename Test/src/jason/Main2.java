package jason;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String string = null;
		string = input.nextLine();
		char[] parentheses = new char[1000];
		parentheses = string.toCharArray();
		int length = string.length();
		int leftLength = 0;
		int rightLength = 0;
		int resultLength = 0;
		Long pattern = 0L;
		for (int index = 0; index < length - 1; index++) {
			if (parentheses[index] == '(') {
				leftLength++;
			}
		}

		rightLength = length - leftLength;
		if (rightLength > leftLength) {
			resultLength = rightLength - leftLength;
		} else if (leftLength > rightLength) {
			resultLength = leftLength - rightLength;
		}

		System.out.println(resultLength + " " + pattern);
	}
}
