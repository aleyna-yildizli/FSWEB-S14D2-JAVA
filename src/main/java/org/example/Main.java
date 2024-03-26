package org.example;

import org.example.model.enums.LampType;

import org.example.model.*;

import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        // Ceiling objesi oluşturma
        Ceiling ceiling = new Ceiling(10, PaintColor.WHITE);
        ceiling.create();

        // Bed objesi oluşturma
        Bed bed = new Bed("double", 2, 2, 2, 2);
        System.out.println(bed.toString());

        // Lamp objesi oluşturma
        Lamp lamp = new Lamp(LampType.NORMAL, true, 4);
        lamp.turnOn();

        // Wardrobe objesi oluşturma
        Wardrobe wardrobe = new Wardrobe(100, 200, 50.5);

        // Carpet objesi oluşturma
        Carpet carpet = new Carpet(200, 300, PaintColor.GREEN);

        // Wall objeleri oluşturma
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("West");
        Wall wall4 = new Wall("East");
        Wall[] walss = {wall1, wall2, wall3, wall4};

        // Bedroom objesi oluşturma
        Bedroom bedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4, ceiling, lamp, bed, wardrobe, carpet);


        System.out.println(bedroom);
        bedroom.createBedroom();



    }
}
