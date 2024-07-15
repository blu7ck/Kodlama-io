package sub;

import java.util.Scanner;

public class ifEls {
    public static void main(String[] args) {
        System.out.println("1-23 video serisinin uygulamaları: \n");
Scanner input = new Scanner(System.in);

    //if blocks
        System.out.println("Bir tamsayı giriniz: \n");
         int x = 20;
         int tamSayi = input.nextInt() ;

        if (x < tamSayi) {
            System.out.println(x + " < " + tamSayi + "\nx < girilen tamsayı değeri");
        }
        else if(x == tamSayi){
            System.out.println(x + " = x " + "\ngirilen tamsayı değeri = x");
        }
        else{
            System.out.println(x + " > " + tamSayi + "\nx > girilen tamsayı değeri");
        }
    }

}