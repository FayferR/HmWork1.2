package com.company;

import javax.swing.*;

import static com.company.Heroes.BERSERK;

public class Main {

    public static void main(String[] args) {
	Hero2 Doctor = new Hero2(100,5,Heroes.DOCTOR);
	Hero3 Magic = new Hero3(200,25,Heroes.MAGIC);
	Hero3 Berserk = new Hero3(120,23, BERSERK);
        System.out.println("Doctor: " + Doctor.getInfo() + "\nMagic: " + Magic.getInfo()
                + "\nBerserk: " + Berserk.getInfo());
    }
}
