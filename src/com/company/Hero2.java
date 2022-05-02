package com.company;

public class Hero2 extends Hero1{
    private int defense;
    private int speed;

    public Hero2(int health, int damage, Heroes heroes, int defense, int speed) {
        super(health, damage, heroes);
        this.defense = defense;
        this.speed = speed;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public Hero2(int health, int damage, Heroes heroes){
        super(health, damage, heroes);
    }
    @Override
    public String getInfo(){
        return super.getInfo();
    }
    public int awm(int damage, int speed){
        return damage;
    }
    public final int awm(int speed){
        return speed;
    }
}
