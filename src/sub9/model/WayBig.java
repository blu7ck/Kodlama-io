package sub9.model;

import sub9.controller.Omnitrix;

public class WayBig extends Omnitrix {
    public WayBig(){
        super("Way Big", 9000, "Special Ability: Can Shoot a Powerful Cosmic Ray!");
    }
    @Override
    public void specs(){
        System.out.println("\n");
        System.out.println("Name: " + getName());
        System.out.println("Power: " + getPower());
        System.out.println("Herhangi bir Text: " + getMotto());
    }
}
