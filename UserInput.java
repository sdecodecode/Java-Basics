// 2) Write a Program to Print Integer Number Entered by User

import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your integer: ");
    int input = scanner.nextInt();
    System.out.println("Your integer is: " + input);

    scanner.close();
  }
}
