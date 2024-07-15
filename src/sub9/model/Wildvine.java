package sub9.model;

import sub9.controller.Omnitrix;

public class Wildvine extends Omnitrix {

        public Wildvine() {
            super("Wildvine", 3750, "Special Ability: Grow Vines and Explode!");
        }

        @Override
        public void specs() {
            System.out.println("\n");
            System.out.println("Name: " + getName());
            System.out.println("Power: " + getPower());
            System.out.println("Herhangi bir Text: " + getMotto());
        }
    }
