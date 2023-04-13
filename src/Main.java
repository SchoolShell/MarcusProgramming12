import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        if (x == 0 || y == 0) {
            System.out.println("Quadrant unknown");
        } else {
            if (x > 0) {
                if (y > 0) {
                    System.out.println("Quadrant 1");
                } else {
                    System.out.println("Quadrant 4");
                }
            } else {
                if (y > 0) {
                    System.out.println("Quadrant 2");
                } else {
                    System.out.println("Quadrant 3");
                }
            }
        }
    }
}

