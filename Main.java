import java.util.Scanner;
public class Main {
    static int power ( int a , int b) {
       int result = 1 ;
        for (int i = 1; i <= b; i++) {
            result *= a ;
        }
        return result;
    }
    public static void main(String [] args ) {
        Scanner scan = new Scanner(System.in);
        int base, exponent, result, answer; // değerleri atadık
        while(true) { // tekrar sormak için
                System.out.print("Taban değeri giriniz = ");
                    base = scan.nextInt();
                System.out.print("Üs değeri giriniz = ");
                    exponent = scan.nextInt();
                System.out.println("Sonuç :" + power(base, exponent)); //metottan işlemi uygulattık
        }
    }
}



