package sub9.controller;

import sub9.service.Alien;

public abstract class Omnitrix implements Alien {

    private String name;
    private int power;
    private String motto;

    public Omnitrix(String name, int power, String motto) {
        this.name = name;
        this.power = power;
        this.motto = motto;
    }

    @Override
    public void specs() {

    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
