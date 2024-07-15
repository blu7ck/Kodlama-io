package sub9;

import sub9.model.Ghostfreak;
import sub9.model.Wildvine;
import sub9.controller.Omnitrix;
import sub9.model.WayBig;

public class Benjamin {
        public static void main(String[] args) {
            Omnitrix wildvine = new Wildvine();
            Omnitrix wayBig = new WayBig();
            Omnitrix ghostfreak = new Ghostfreak();

            wildvine.specs();
            wayBig.specs();
            ghostfreak.specs();

            //Specs değiştirmek için set metodu kullanabiliriz
            System.out.println("\nSet ile değiştirilmiş değerler: ");
            ghostfreak.setName("john wick'in kalemi");
            ghostfreak.setPower(999999);
            ghostfreak.setMotto("cyka!");
            ghostfreak.specs();
        }
    }