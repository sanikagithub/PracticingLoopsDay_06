import java.util.Scanner;
import java.util.ArrayList;

public class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any word");
        String input = scanner.nextLine();
        ArrayList<String> list = new ArrayList<String>();

        while
         (!input.equals("")){
            list.add(input);
            input = scanner.nextLine();
           }
          
            System.out.println("The total number of items in the list was: " + list.size());
            
            scanner.close();
            }
}
