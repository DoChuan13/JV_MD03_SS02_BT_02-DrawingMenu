package DrawingMenu;

import java.util.Scanner;

public class DrawingMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println(" 1. Print the rectangle ");
        System.out.println(" 2. Print the square triangle (The conner is square at 4 different angle: top-left, top-right, bottom-left, bottom-right ");
        System.out.println(" 3. Print Isosceles Triangle  ");
        System.out.println(" 0. Exit ");
        int opt = -1;
        while (opt != 0) {
            System.out.println("Please input select: ");
            opt = input.nextInt();
            switch (opt) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("\nTriangle Bottom-left");
                    for (int i = 0; i <= 7; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    System.out.println("\nTriangle Top-left");
                    for (int i = 7; i >= 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    int width = 6;
                    for (int i = 0; i <= width/2; i++) {
                        for (int j = 0; j <= 10; j++) {
                            if (j >= (width / 2) - i && j <= (width / 2) + i) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println("");
                    }
                    break;
                case 0:
                    System.out.println("Program will be finished");
                    break;
                default:
                    System.out.println("Invalid option, please select again.");
            }
        }
    }
}
