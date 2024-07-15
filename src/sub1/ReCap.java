package sub1;

import java.util.Scanner;
//Ben baya sorting yaptım neden bilmem daha keyif verici geldi ama çok anlamsız, arrayler ile tekrar düzenlerim ödeve gelince.
public class ReCap {
    public static void main(String[] args) {
        System.out.println("ReCap uygulaması ama Sorting: \n");
        Scanner input = new Scanner(System.in);

        System.out.println("Rastgele 3 Tamsayı Giriniz: \n");
        int sayi1 = input.nextInt();
        System.out.println("Girdiğiniz ilk tamsayı: " +sayi1+"\n");
        int sayi2 = input.nextInt();
        System.out.println("Girdiğiniz ikinci tamsayı: " +sayi2+"\n");
        int sayi3 = input.nextInt();
        System.out.println("Girdiğiniz üçüncü tamsayı: " +sayi3+"\n");


        if (sayi1 >= sayi2 && sayi1 >= sayi3) {
            System.out.print(sayi1 + " > ");
            if (sayi2 >= sayi3) {
                System.out.print(sayi2 + " > " + sayi3);
            } else {
                System.out.print(sayi3 + " > " + sayi2);
            }
        } else if (sayi2 >= sayi1 && sayi2 >= sayi3) {
            System.out.print(sayi2 + " > ");
            if (sayi1 >= sayi3) {
                System.out.print(sayi1 + " > " + sayi3);
            } else {
                System.out.print(sayi3 + " > " + sayi1);
            }
        } else if (sayi3 >= sayi1 && sayi3 >= sayi2) {
            System.out.print(sayi3 + " > ");
            if (sayi1 >= sayi2) {
                System.out.print(sayi1 + " > " + sayi2);
            } else {
                System.out.print(sayi2 + " > " + sayi1);
            }

        }
    }
}