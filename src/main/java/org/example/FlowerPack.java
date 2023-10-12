package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class FlowerPack {
    private Flower flower;
    private int flowers_quantity;

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.flowers_quantity = amount;
    }

    public double getPrice() {
        // Calculate the total price of the flower pack
        return flower.getPrice() * flowers_quantity;
    }
}

