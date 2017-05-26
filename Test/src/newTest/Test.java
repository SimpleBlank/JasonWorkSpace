package newTest;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int totalNum = 0;

		Scanner input = new Scanner(System.in);

		totalNum = input.nextInt();
		int[] passwordList = new int[totalNum];
		int i = 0;
		while (input.hasNext()) {
			
			passwordList[i++] = input.nextInt();
			if (i == passwordList.length) {
				break;
			}
		}
		int flag = 0;
		for (int index = totalNum - 1; index > 0; index--) {
			if (passwordList[index] < passwordList[index - 1]) {
				flag = index - 1;
				break;
			}
		}

		for (int index = 0; index <= flag; index++) {
			System.out.print(passwordList[index] + " ");
		}

	}
}
