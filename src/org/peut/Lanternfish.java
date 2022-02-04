package org.peut;

import java.util.ArrayList;


public class Lanternfish
{
    static long[]  school = new long[9];
    static long    schoolSize = 0;

    public Lanternfish(  int [] initDays ) {
        for ( int i : initDays){
            school[ i ]++;
            schoolSize++;
        }
    }

    void ageSchool(){
         long spawnNumber = 0;

         for ( int i = 0 ; i < school.length -1 ; ++i ){
             if ( i == 0 ){
                 spawnNumber = school[i];
                 school[i]   = 0;
             }
             school[i] = school[ i + 1 ];
             if ( i == 6 ){
                 school[i] += spawnNumber;
             }
         }
         school[8]   = spawnNumber;
         schoolSize += spawnNumber;
    }

    void showSchool(){
        System.out.printf(" total : %16d - ", schoolSize );


        for ( long dayCount :  school) {
            System.out.printf( " %16d ", dayCount );
        }

        System.out.println();
    }


}
