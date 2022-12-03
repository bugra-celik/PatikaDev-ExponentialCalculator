import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x,r,i=1,exp=1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Üstü alınacak sayıyı giriniz:");
        x = scan.nextInt();
        System.out.print("Sayının üstünü giriniz:");
        r = scan.nextInt();
        for(i=1;i<=r;i++){
            exp *= x;
        }

        System.out.println("Üstü alınan sayı:" +exp);
    }
}
