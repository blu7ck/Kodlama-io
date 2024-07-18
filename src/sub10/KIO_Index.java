package sub10;

import sub10.model.KIO;
import sub10.repository.KIO_Database;
import sub10.repository.PostgresQL;
import sub10.service.SLog;

public class KIO_Index {
    public static void main(String...args){

        KIO_Database database = new PostgresQL();
        SLog logService = new SLog();

        KIO kio = new KIO("React", "Kategori Adı", "Eğitmen Adı", 100, database, logService);
        kio.add();
//        try {
//            kio.add();
//        } catch (IllegalArgumentException e) {
//            System.err.println("Hata: " + e.getMessage());
//        }
        KIO kio0 = new KIO("Javascript", "Kategori Adı 2", "Eğitmen Adı", 11, database, logService);
        kio0.add();
//
//        try {
//            kio.add();
//        } catch (IllegalArgumentException e){
//            System.err.println("Hata: " + e.getMessage());
//        }


        KIO kio1 = new KIO("Java", "Programlama", "Ali Veli", 100, database, logService);
        kio1.add();


        KIO kio2 = new KIO("Python", "Programlama", "Hasan Hüseyin", 150, database, logService);
        kio2.add();

        KIO kio3 = new KIO("Java","Programlama","Nilüfer",200,database,logService);
        kio3.add();

        System.out.println("\nTüm Loglar:");
        for (String log : logService.getLogs()) {
            System.out.println(log);
        }
 }
}
