/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aacalc;

import java.util.ArrayList;

/**
 *
 * @author laptop
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //enemy == defenders
        //friendly == attackers
        //
        //atacking
        boolean isAtacking = true;
        //Number Of Friendly Units
        int friendlyInfantry = 5;
        int friendlyArtillery = 3;
        int friendlyMechenizedInfantry = 4;
        int friendlyTanks = 3;
        int friendlyFighters = 2;
        int friendlyTacticalBombers = 2;
        int friendlyStrategicBombers = 0;
        int friendlyBattleships = 0;
        int friendlyHurtBattleships = 0;
        int friendlyAircraftCarriers = 0;
        int friendlyCruisers = 0;
        int friendlyDestroyers = 0;
        int friendlySubmarines = 0;
        int friendlyTransports = 0;
        //Number Of Enemy Units
        int enemyInfantry = 6;
        int enemyArtillery = 2;
        int enemyMechenizedInfantry = 0;
        int enemyTanks = 2;
        int enemyFighters = 1;
        int enemyTacticalBombers = 0;
        int enemyStrategicBombers = 0;
        int enemyBattleships = 0;
        int enemyHurtBattleships = 0;
        int enemyAircraftCarriers = 0;
        int enemyCruisers = 0;
        int enemyDestroyers = 0;
        int enemySubmarines = 0;
        int enemyTransports = 0;
        //Units
        ArrayList<Unit> friendlyUnits = new ArrayList<Unit>();
        ArrayList<Unit> enemyUnits = new ArrayList<Unit>();
        //calculating units
        for (int i = 0; i < friendlyBattleships; i++) {
            friendlyUnits.add(new Unit("Battleship", 0, 4, 4));
        }
        for (int i = 0; i < friendlyTransports; i++) {
            friendlyUnits.add(new Unit("Transport", 7, 0, 0));
        }
        for (int i = 0; i < friendlyAircraftCarriers; i++) {
            friendlyUnits.add(new Unit("AircraftCarrier", 0, 0, 2));
        }
        for (int i = 0; i < friendlyInfantry; i++) {
            friendlyUnits.add(new Unit("Infantry", 3, 1, 2));
        }
        for (int i = 0; i < friendlyMechenizedInfantry; i++) {
            friendlyUnits.add(new Unit("MechenizedInfantry", 4, 1, 2));
        }
        for (int i = 0; i < friendlyArtillery; i++) {
            friendlyUnits.add(new Unit("Artillery", 4, 2, 2));
        }
        for (int i = 0; i < friendlySubmarines; i++) {
            friendlyUnits.add(new Unit("Submarine", 6, 2, 1));
        }
        for (int i = 0; i < friendlyDestroyers; i++) {
            friendlyUnits.add(new Unit("Destroyer", 8, 2, 2));
        }
        for (int i = 0; i < friendlyTanks; i++) {
            friendlyUnits.add(new Unit("Tank", 6, 3, 3));
        }
        for (int i = 0; i < friendlyFighters; i++) {
            friendlyUnits.add(new Unit("Fighter", 10, 3, 4));
        }
        for (int i = 0; i < friendlyTacticalBombers; i++) {
            friendlyUnits.add(new Unit("TacticalBomber", 11, 3, 3));
        }
        for (int i = 0; i < friendlyCruisers; i++) {
            friendlyUnits.add(new Unit("Cruiser", 12, 3, 3));
        }
        for (int i = 0; i < friendlyStrategicBombers; i++) {
            friendlyUnits.add(new Unit("StrategicBomber", 12, 4, 1));
        }
        for (int i = 0; i < friendlyHurtBattleships; i++) {
            friendlyUnits.add(new Unit("HurtBattleship", 20, 4, 4));
        }
        //

        for (int i = 0; i < enemyBattleships; i++) {
            enemyUnits.add(new Unit("Battleship", 0, 4, 4));
        }
        for (int i = 0; i < enemyTransports; i++) {
            enemyUnits.add(new Unit("Transport", 7, 0, 0));
        }
        for (int i = 0; i < enemyAircraftCarriers; i++) {
            enemyUnits.add(new Unit("AircraftCarrier", 0, 0, 2));
        }
        for (int i = 0; i < enemyInfantry; i++) {
            enemyUnits.add(new Unit("Infantry", 3, 1, 2));
        }
        for (int i = 0; i < enemyMechenizedInfantry; i++) {
            enemyUnits.add(new Unit("MechenizedInfantry", 4, 1, 2));
        }
        for (int i = 0; i < enemyArtillery; i++) {
            enemyUnits.add(new Unit("Artillery", 4, 2, 2));
        }
        for (int i = 0; i < enemySubmarines; i++) {
            enemyUnits.add(new Unit("Submarine", 6, 2, 1));
        }
        for (int i = 0; i < enemyDestroyers; i++) {
            enemyUnits.add(new Unit("Destroyer", 8, 2, 2));
        }
        for (int i = 0; i < enemyTanks; i++) {
            enemyUnits.add(new Unit("Tank", 6, 3, 3));
        }
        for (int i = 0; i < enemyFighters; i++) {
            enemyUnits.add(new Unit("Fighter", 10, 3, 4));
        }
        for (int i = 0; i < enemyTacticalBombers; i++) {
            enemyUnits.add(new Unit("TacticalBomber", 11, 3, 3));
        }
        for (int i = 0; i < enemyCruisers; i++) {
            enemyUnits.add(new Unit("Cruiser", 12, 3, 3));
        }
        for (int i = 0; i < enemyStrategicBombers; i++) {
            enemyUnits.add(new Unit("StrategicBomber", 12, 4, 1));
        }
        for (int i = 0; i < enemyHurtBattleships; i++) {
            enemyUnits.add(new Unit("HurtBattleship", 20, 4, 4));
        }
        //calulate lossesint friendlyCost = 0;
        int friendlyCost = 0;
        int enemyCost = 0;
        ArrayList<Unit> fu = (ArrayList<Unit>) friendlyUnits.clone();
        ArrayList<Unit> eu = (ArrayList<Unit>) enemyUnits.clone();
        int enemyWins = 0;
        int friendlyWins = 0;
        for (int j = 0; j < 10000; j++) {
            //System.out.print("\nStarting round: " + j + "\n\n");
            friendlyUnits = (ArrayList<Unit>) fu.clone();
            enemyUnits = (ArrayList<Unit>) eu.clone();
            while (friendlyUnits.size() > 0 && enemyUnits.size() > 0) {

                if (isAtacking) {
                    int att = 0;
                    for (int i = 0; i < friendlyUnits.size(); i++) {
                        //System.out.print("Friendly ");
                        att += friendlyUnits.get(i).getAttack();
                        //System.out.println();
                    }
                    int def = 0;
                    for (int i = 0; i < enemyUnits.size(); i++) {
                        //System.out.print("Enemy ");
                        def += enemyUnits.get(i).getDefence();
                        //System.out.println();
                    }
                    for (int i = 0; i < def && friendlyUnits.size() > 0; i++) {
                        friendlyCost += friendlyUnits.get(0).getValue();
                        //System.out.print("Friendly ");
                        Unit u = friendlyUnits.get(0).destroy();
                        if (u != null) {
                            friendlyUnits.add(u);
                        }
                        //System.out.println();
                        friendlyUnits.remove(0);
                    }
                    for (int i = 0; i < att && enemyUnits.size() > 0; i++) {
                        enemyCost += enemyUnits.get(0).getValue();
                        //System.out.print("Enemy ");
                        Unit u = enemyUnits.get(0).destroy();
                        if (u != null) {
                            enemyUnits.add(u);
                        }
                        //System.out.println();
                        enemyUnits.remove(0);
                    }
                } else {
                    int att = 0;
                    for (int i = 0; i < enemyUnits.size(); i++) {
                        //System.out.print("Enemy ");
                        att += enemyUnits.get(i).getAttack();
                        //System.out.println();
                    }
                    int def = 0;
                    for (int i = 0; i < friendlyUnits.size(); i++) {
                        //System.out.print("Friendly ");
                        def += friendlyUnits.get(i).getDefence();
                        //System.out.println();
                    }
                    for (int i = 0; i < def && enemyUnits.size() > 0; i++) {
                        enemyCost += enemyUnits.get(0).getValue();
                        //System.out.print("Enemy ");
                        Unit u = enemyUnits.get(0).destroy();
                        if (u != null) {
                            enemyUnits.add(u);
                        }
                        //System.out.println();
                        enemyUnits.remove(0);
                    }
                    for (int i = 0; i < att && friendlyUnits.size() > 0; i++) {
                        friendlyCost += friendlyUnits.get(0).getValue();
                        //System.out.print("Friendly ");
                        Unit u = friendlyUnits.get(0).destroy();
                        if (u != null) {
                            friendlyUnits.add(u);
                        }
                        //System.out.println();
                        friendlyUnits.remove(0);
                    }
                }
            }
            if (friendlyUnits.isEmpty()) {
                enemyWins++;
            } else if (enemyUnits.isEmpty()) {
                friendlyWins++;
            }
        }
        System.out.println("enemyWinChance: "
                + (((double) (enemyWins)) / 100) + "%");
        System.out.println("friendlyWinChance: "
                + (((double) (friendlyWins)) / 100) + "%");
        System.out.println("enemyCost: "
                + (((double) (enemyCost)) / 10000));
        System.out.println("friendlyCost: "
                + (((double) (friendlyCost)) / 10000));
        System.out.println("ratio: "
                + (((double) (enemyCost))
                / ((double) (friendlyCost))));
    }
}
