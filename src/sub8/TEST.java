package sub8;

import sub8.engineers.EngineersAbstract;

public class TEST {
    public static void main(String...args){
        System.out.println();



        EngineersAbstract xe = new EngineersAbstract("Mühendis 1");
        xe.xengineer();
        System.out.println();

        EngineersAbstract ye = new EngineersAbstract("Mühendis 2");
        ye.yengineer();
        System.out.println();

        EngineersAbstract ze = new EngineersAbstract("Mühendis 3");
        ze.zengineer();

    }
}

