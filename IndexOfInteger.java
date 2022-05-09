import java.util.Scanner;
import java.util.ArrayList;


public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any integer");
        int number =scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();

        while
         (number !=0){
            list.add(number);
            number = scanner.nextInt();
           }
          
            System.out.println("Done entering integers into the list");
            System.out.println("What number are you looking for in the list?");
            int number2 =scanner.nextInt();
            System.out.println(number2 + " is at index " + list.indexOf(number2));
            System.out.println(number2 + " is at index " + list.get((number2) - 1));

            scanner.close();
            }
}
