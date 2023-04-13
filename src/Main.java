import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("happyorsad.txt"));
        char[] line = scanner.nextLine().toCharArray();
        int happiness = 0;
        boolean detected = false;
        for (int i = 0; i < line.length - 2; i++) {
            if (line[i] == ':') {
                if (line[i + 1] == '-') {
                    char c = line[i + 2];
                    if (c == '(') {
                        detected = true;
                        happiness--;
                    } else if (c == ')') {
                        detected = true;
                        happiness++;
                    }
                }
            }
        }
        if (!detected) {
            System.out.println("none");
        } else if (happiness == 0) {
            System.out.println("unsure");
        } else if (happiness > 0) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}

