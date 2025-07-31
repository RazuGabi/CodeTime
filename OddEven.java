import java.util.Scanner;

public class OddEven{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number:  ");
        int num = scanner.nextInt();

        System.out.println("");

        if(num % 2 == 0){
            System.out.println(num + " is Even!");
        }
        else{
            System.out.println(num + " is Odd!");
        }
    }
}
