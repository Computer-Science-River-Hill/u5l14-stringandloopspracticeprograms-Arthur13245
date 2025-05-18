package org.example; //DO NOT DELETE
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int choice;

      do {
      System.out.println("\n--- Main Menu ---");
      System.out.println("1. Further Substring Fun");
      System.out.println("2. Run of Integers");
      System.out.println("3. Sum of a Range of Sequential Integers");
      System.out.println("4. Repeatedly Echo a Word");
      System.out.println("5. Words Separated by Dots");
      System.out.println("6. Adding Up Integers");
      System.out.println("7. Shipping Cost Calculator");
      System.out.println("0. Exit");
      System.out.print("Enter your choice: ");
      choice = scanner.nextInt();
      scanner.nextLine(); // Consume newline

      switch (choice) {
      case 1 -> substringFun(scanner);
      case 2 -> runOfIntegers(scanner);
      case 3 -> sumOfRange(scanner);
      case 4 -> echoWord(scanner);
      case 5 -> wordsWithDots(scanner);
      case 6 -> addIntegers(scanner);
      case 7 -> shippingCost(scanner);
      case 0 -> System.out.println("Goodbye!");
      default -> System.out.println("Invalid choice. Please try again.");
      }

      } while (choice != 0);
      }

      // Exercise 1
      public static void substringFun(Scanner scanner) {
      System.out.println("Enter a string:");
      String original = scanner.nextLine();
      System.out.print("Enter beginning index: ");
      int begin = scanner.nextInt();
      System.out.print("Enter ending index: ");
      int end = scanner.nextInt();
      scanner.nextLine(); // consume newline

      System.out.println("\nOriginal string:\n" + original);
      System.out.println("\nSubstring:\n" + original.substring(begin, end));
      }

      // Exercise 2
      public static void runOfIntegers(Scanner scanner) {
      System.out.print("Enter Start: ");
      int start = scanner.nextInt();
      System.out.print("Enter End: ");
      int end = scanner.nextInt();

      for (int i = start; i <= end; i++) {
      System.out.println(i);
      }
      }

      // Exercise 3
      public static void sumOfRange(Scanner scanner) {
      System.out.print("Enter low: ");
      int low = scanner.nextInt();
      System.out.print("Enter high: ");
      int high = scanner.nextInt();

      int sumHigh = (high * (high + 1)) / 2;
      int sumLowMinus1 = ((low - 1) * (low)) / 2;
      int sum = sumHigh - sumLowMinus1;

      System.out.println("Sum = " + sum);
      }

      // Exercise 4
      public static void echoWord(Scanner scanner) {
      System.out.print("Enter a word: ");
      String word = scanner.nextLine();
      int times = word.length();

      for (int i = 0; i < times; i++) {
      System.out.println(word);
      }
      }

      // Exercise 5
      public static void wordsWithDots(Scanner scanner) {
      System.out.print("Enter first word: ");
      String word1 = scanner.nextLine();
      System.out.print("Enter second word: ");
      String word2 = scanner.nextLine();

      int totalLength = 30;
      int dotsCount = totalLength - (word1.length() + word2.length());

      System.out.print(word1);
      for (int i = 0; i < dotsCount; i++) {
      System.out.print(".");
      }
      System.out.println(word2);
      }

      // Exercise 6
      public static void addIntegers(Scanner scanner) {
      System.out.print("How many integers will be added: ");
      int count = scanner.nextInt();
      int sum = 0;

      for (int i = 0; i < count; i++) {
      System.out.print("Enter an integer: ");
      sum += scanner.nextInt();
      }

      System.out.println("\nThe sum is " + sum);
      }

      // Exercise 7
      public static void shippingCost(Scanner scanner) {
      double handling = 3.00;
      while (true) {
      System.out.print("Weight of Order: ");
      double weight = scanner.nextDouble();

      if (weight <= 0) {
      System.out.println("bye");
      break;
      }

      double shipping = handling;
      if (weight > 10) {
      shipping += (weight - 10) * 0.25;
      }

      System.out.printf("Shipping Cost: $%.2f\n", shipping);
      }
   }
}