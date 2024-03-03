package segitiga;
import java.util.Scanner;

public class segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isValid = false;
        
        while (!isValid) {
            System.out.print("Masukkan panjang sisi a: ");
            int a = input.nextInt();
            System.out.print("Masukkan panjang sisi b: ");
            int b = input.nextInt();
            System.out.print("Masukkan panjang sisi c: ");
            int c = input.nextInt();

            if (a <= b && b <= c) {
                if (a * a + b * b == c * c) {
                    System.out.println("Segitiga siku-siku.");
                } else if (a * a + b * b < c * c) {
                    System.out.println("Segitiga tumpul.");
                } else {
                    System.out.println("Segitiga lancip.");
                }
                isValid = true;
                
            } else {
                System.out.println("Input salah, silakan coba lagi.");
            }
        }

    }
}
