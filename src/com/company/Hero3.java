package com.company;

public final class Hero3 extends Hero2{
    private String attackType;
    private int attack;
    private int attackDamage;

    public Hero3(int health, int damage, Heroes heroes) {
        super(health, damage, heroes);
    }
    @Override
    public String getInfo(){
        return super.getInfo();
    }
    @Override
    public int awm(int damage, int speed){
        return super.awm(damage, speed);
    }
}
