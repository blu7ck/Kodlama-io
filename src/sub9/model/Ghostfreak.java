package sub9.model;

import sub9.controller.Omnitrix;

public class Ghostfreak extends Omnitrix {
    public Ghostfreak() {
        super("Ghostfreak", 1111, "But you know what they say- possession is nine-tenths of the law!");
    }
    public void specs(){
        System.out.println("\n");
        System.out.println("Name: " + getName());
        System.out.println("Power: " + getPower());
        System.out.println("Herhangi bir Text: " + getMotto());
    }
}
