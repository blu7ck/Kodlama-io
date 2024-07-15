package sub6;
//Aman işte anafikri anladınız arkadaslar
import java.util.Scanner;

public class Arrays {
    public static void main(String...args){
        Scanner input = new Scanner(System.in);
        String[] puantaj = new String[5];
        puantaj[0]="AA";
        puantaj[1]="BB";
        puantaj[2]="CC";
        puantaj[3]="DD";
        puantaj[4]="FF";

        System.out.println("\nHarf Karşılığı Notunuzu Görmek için Puan Giriniz: ");
int i = input.nextInt();
    if (i <= 35){
        System.out.println(puantaj[4]);
    }else if(i > 35 && i <= 55){
        System.out.println(puantaj[3]);
    }else if(i > 55 && i<=70){
        System.out.println(puantaj[2]);
    }else if(i >= 70 && i <= 84){
        System.out.println(puantaj[1]);
    }else
        System.out.println(puantaj[0]);
    }
}
