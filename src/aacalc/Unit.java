package aacalc;

import java.util.Random;

public class Unit {

    private String type;
    private int cost;
    private int attack;
    private int defence;
    private static long entropy = 0;

    public Unit(String type, int cost, int attack, int defence) {
        this.type = type;
        this.cost = cost;
        this.attack = attack;
        this.defence = defence;
    }

    public Unit destroy() {
        Unit u = null;//to be returned
        //System.out.print(type + " Destroyed");
        if (type.matches("Battleship")) {
            u = new Unit("HurtBattleship", 20, 4, 4);
            //System.out.println("hb");
        }
        if (type.matches("AircraftCarrier")) {
            u = new Unit("HurtAircraftCarrier", 16, 0, 2);
        }
        return u;
    }

    public int getValue() {
        return cost;
    }

    public int getAttack() {
        int a = 0;//to be returned
        int r = rollDie();
        //System.out.print(type + " rolled a " + (r+1));
        if (r < attack) {
            a++;
        }
        return a;
    }

    public int getDefence() {
        int a = 0;//to be returned
        int r = rollDie();
        //System.out.print(type + " rolled a " + (r+1));
        if (r < defence) {
            a++;
        }
        return a;
    }

    private static int rollDie() {
        entropy += (long) (Math.floor(Math.random() * 101));
        return (int) (entropy % 6);
    }
}
