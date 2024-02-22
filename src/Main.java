import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Gerekli degiskenler tanimlandi.
        int k, i = 0, total = 0, sayac = 0;

        // Scanner sinifina ait degisken projeye dahil edildi.
        Scanner input = new Scanner(System.in);

        // Kullanicidan veri alinip bu veri degiskene atandi.
        System.out.println("Bir sayi gir: ");
        k = input.nextInt();

        // Mantiksal kontroller saglandi.
        while (i < k) {
            if (i % 3 == 0 && i % 4 == 0){
                total += i;
                sayac++;
            }
            i++;
        }
        System.out.println(total / sayac); // Alinan bu verinin ortalamasi hesaplanip kullaniciya iletildi.
    }
}