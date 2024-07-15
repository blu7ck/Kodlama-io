package sub8.engineers;

import sub8.interfaces.Engineers;
import sub8.interfaces.Specs;

public class EngineersAbstract implements Engineers, Specs {

    public EngineersAbstract(String engineer) {
    }

    @Override
    public void xengineer() { System.out.println("Xencineer");
        parent();
        blogger();
        instrumentPlayer();

    }

    @Override
    public void yengineer() { System.out.println("Yencineer");
        javaStudent();
        instrumentPlayer();
    }

    @Override
    public void zengineer() { System.out.println("Zencineer");
        blogger();
        parent();
        teamFan();

    }
    public void blogger(){ System.out.println(" Blog Yazarı");    }
    public void parent(){
        System.out.println(" Kız Babası");
    }
    public void teamFan(){
        System.out.println(" Takım Tutuyor");
    }
    public void instrumentPlayer(){
        System.out.println(" Enstruman Çalıyor");
    }
    public void javaStudent(){
        System.out.println(" Yazılım Öğreniyor");
    }
}