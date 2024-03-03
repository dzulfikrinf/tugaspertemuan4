package kubus;
import java.util.Scanner;

public class Kubus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] sisi = new int[3];
        for(int i = 0; i < 3; i++){
            System.out.print("Masukkan Sisi ke-" + (i+1) + ": ");
            sisi[i] = input.nextInt();
        }
        
        boolean semuaSama = true;
        for(int i = 1; i < sisi.length; i++){
            if(sisi[i] != sisi[0]){
                semuaSama = false;
                break;
            }
        }
        
        if(semuaSama){
            System.out.println("Termasuk Kubus");
        } else {
            System.out.println("Bukan Kubus");
        }
    }
}
