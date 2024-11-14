package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    // constructor
    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;

        if(healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
        this.weapon = weapon;
    }

    //healthRemaining method
    public int healthRemaining() {
        return healthPercentage;
    }

    //loseHealth subtracts the dmg from our hp
    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if(healthPercentage < 0) {
            healthPercentage = 0;
            System.out.println(name + " player has been knocked out of game");
        }
    }
    //restoreHealth add health potion our hp
    public void restoreHealth(int healthPotion) {
        healthPercentage += healthPotion;
        if(healthPercentage > 100) {
            healthPercentage = 100;
        }
    }
    //get set method for name,weapon
    public String getName() {
        return name;
    }
    public Weapon getWeapon() {
        return weapon;
    }



}
