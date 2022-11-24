import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number ");
        number = input.nextInt();

            for (int i = 1; i <=number ; i*=4) {
                System.out.println("4's pow " +i);
            }
        for (int i = 1; i <= number ; i*=5) {
            System.out.println("5' s pow  " + i );
        }
    }
}