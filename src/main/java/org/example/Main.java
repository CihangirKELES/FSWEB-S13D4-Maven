package org.example;

public class Main {
    public static void main(String[] args) {

        //point
        Point first = new Point(5,2);
        Point second = new Point(4,1);

        System.out.println("distance(0,0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2,2) = " + first.distance(2, 2));

        //player
        Player player = new Player("John", 100, Weapon.SWORD);
        player.restoreHealth(30);
        System.out.println(player.getName() + " health after restoring 30: " + player.healthRemaining());
        Player player2 = new Player("Jack", 60, Weapon.BOW);
        Player player3 = new Player("Rose", 80, Weapon.AXE);
        Player player4 = new Player("Dan", 90, Weapon.DAGGER);
        Player player5 = new Player("Istari", 65, Weapon.STAFF);

    }
}