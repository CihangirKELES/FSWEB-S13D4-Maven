package org.example;

public enum Weapon {
    SWORD(35, 1.1),
    AXE(30, 0.9),
    BOW(20, 1.3),
    DAGGER(32, 1.5),
    STAFF(15, 0.5);

    private final int damage;
    private final double attackSpeed;

    // Constructor
    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    // Getter metodları
    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
    }
