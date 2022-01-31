package org.peut;


// https://adventofcode.com/2021/day/6

public class Main {

    static Lanternfish initLanternfish(){
        int[] spawnDays = {3,4,3,1,2};
        Lanternfish l = null;

        for ( int i = 0; i < spawnDays.length ; ++i ){
            l = new Lanternfish( spawnDays[i] );
        }
        return l;
    }

    public static void main(String[] args) {

        Lanternfish l = initLanternfish();

        for( int days = 0; days < 81; ++days ){
            System.out.printf("day %2d", days);
            l.showSchool();
            l.ageSchool();
        }

    }
}
