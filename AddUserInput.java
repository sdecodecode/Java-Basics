// 3) Write a Program to Add Two Integer Numbers Entered by User

import java.util.Scanner;

public class AddUserInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter two numbers 1: ");
    int num1 = scanner.nextInt();
    System.out.println("Enter two numbers 2: ");
    int num2 = scanner.nextInt();
    int sum = num1 + num2;
    System.out.println("Number 1 + Number 2: " + sum);
    scanner.close();
  }
}