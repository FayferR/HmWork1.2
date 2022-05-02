package com.company;

public class Hero1 {
    private int health;
    private int damage;
    private Heroes heroes;

    public Hero1(int health, int damage, Heroes heroes) {
        this.health = health;
        this.damage = damage;
        this.heroes = heroes;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public Heroes getHeroes() {
        return heroes;
    }

    public String getInfo() {
        return "Health: " + health +
                "\nDamage: " + damage +
                "\nHeroes: " + heroes;
    }
}
