import java.util.Scanner;
import java.util.ArrayList;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter at least 5 words, each on a seperate line");
        String input = scanner.nextLine();
        ArrayList<String> list = new ArrayList<String>();

        while
         (!input.equals("")){
            list.add(input);
            input = scanner.nextLine();
           }
          
            System.out.println("The fifth item is " + list.get(4));
            
            scanner.close();
            }
        }
        

    