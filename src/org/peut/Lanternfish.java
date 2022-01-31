package org.peut;

import java.util.ArrayList;


public class Lanternfish
{
    static ArrayList<Lanternfish> school = new ArrayList<Lanternfish>();
    private int daysUntilSpawn;


    public Lanternfish() {
        setDaysUntilSpawn(8);
        school.add(this);
    }

    public Lanternfish(int leftDays) {
        setDaysUntilSpawn(leftDays);
        school.add(this);
    }

    private int ageOneDay(){
        --daysUntilSpawn;
        if ( daysUntilSpawn < 0 ){
            setDaysUntilSpawn(6);
            return 1;
        }
        return 0;
    }

    void ageSchool(){
        int addCount=0;
        for ( Lanternfish l : school){
            addCount += l.ageOneDay();
        }
        for ( int i = 0; i < addCount; ++i ){
            new Lanternfish(8);
        }
    }

    void showSchool(){
        System.out.printf(" - total : %d - ", school.size() );
        for ( int i = 0; i < school.size(); ++i){
            if ( i != 0 )System.out.print( "," );
            System.out.print( school.get(i).getDaysUntilSpawn() );
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
