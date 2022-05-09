import java.util.Scanner;
import java.util.ArrayList;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number =scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();

        while
         (number !=0){
            list.add(number);
            number = scanner.nextInt();
           }
           int sum = 0;
           for (int i = 0; i < list.size(); i++){
           sum = sum + list.get(i);
           }

           System.out.println(list + " were the items in the list. The sum of the list is: ");
           System.out.println(sum);
            scanner.close();
            }

}
