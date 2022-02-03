package org.peut;

import java.util.ArrayList;


public class Lanternfish
{
    static long[]  school = new long[9];
    static long   totalFish;

    public Lanternfish(  int [] initDays ) {
        for ( int i : initDays){
            school[ initDays[i] ]++;
        }
    }

    void ageSchool(){
         for ( int i = 1 ; i < school.length - 2 ; --i ){


         }

    }

    void showSchool(){
        System.out.printf(" - total : %4d - ", school.size() );

        if ( school.size() < 80 ) {
            for (int i = 0; i < school.size(); ++i) {
                if (i != 0) System.out.print(",");
                System.out.print(school.get(i).getDaysUntilSpawn());
            }
        }
        System.out.printf("%n");
    }

    public int getDaysUntilSpawn() {
        return daysUntilSpawn;
    }

    public void setDaysUntilSpawn(int daysUntilSpawn) {
        this.daysUntilSpawn = daysUntilSpawn;
    }
}
