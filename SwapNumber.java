// 6) Write a Program to Swap Two Numbers

public class SwapNumber {
  public static void main(String[] args) {
    int num1 = 19;
    int num2 = 91;
    System.out.println("Before Swap:-");
    System.out.println("Number 1: " + num1);
    System.out.println("Number 2: " + num2);
    int temp = num1;
    num1 = num2;
    num2 = temp;
    System.out.println("After Swap:-");
    System.out.println("Number 1: " + num1);
    System.out.println("Number 2: " + num2);

  }
}