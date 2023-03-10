// 4) Write a program where the user is asked to enter two integers (divisor and dividend) and the quotient and the remainder of their division is computed.(Both divisor and dividend should be integers.)

import java.util.Scanner;

public class DivisorDivident {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your Divident: ");
    float divident = scanner.nextFloat();

    System.out.println("Enter your Divisor: ");
    float divisor = scanner.nextFloat();

    float quotient = divident / divisor;
    float remainder = divident % divisor;

    System.out.println("Quotient = " + quotient);
    System.out.println("Remainder = " + remainder);

    scanner.close();
  }
}