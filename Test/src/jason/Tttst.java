package jason;

import java.util.Scanner;

import org.omg.CosNaming.IstringHelper;

public class Tttst {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String message = input.nextLine();
		String pattern = input.nextLine();
		if (pattern.contains("?"))
		{
			String[] te = pattern.split("\\?");
			System.out.println(te[1]);
		}
		
		
		
	}
}
