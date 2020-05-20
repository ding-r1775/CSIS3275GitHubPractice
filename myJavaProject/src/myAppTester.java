import java.util.Scanner;

public class myAppTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please print the first line");

        int n = input.nextInt();
        int sqre = n * n;

        System.out.println("The sqr number of " + n + " is " + sqre);

        input.close();
    }
}