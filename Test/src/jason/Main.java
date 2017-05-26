package jason;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> inputs = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        if(line != null && !line.isEmpty()) {
            int res = resolve(line.trim());
            System.out.println(String.valueOf(res));
        }
    }

    // write your code here
    public static int resolve(String expr) {
       Stack<String> stack = new Stack<>();
       char[] characters = expr.toCharArray();
       for (Character character : characters)
       {
    	   String string = character.toString();
    	   if (!string.equals("^"))
    	   {
    		   if (!string.equals("*"))
    		   {
    			   if (!string.equals("+"))
    			   {
    				   int i = Integer.parseInt(string);
    			   }
    		   }
    	   }
       }
       return 1;
    }
}
