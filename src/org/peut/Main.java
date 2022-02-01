package org.peut;


// https://adventofcode.com/2021/day/6

public class Main {

    public static void main(String[] args) {

        Lanternfish l = new Lanternfish( new int[] {3,4,3,1,2} );

        for( int days = 0; days < 81; ++days ){
            System.out.printf("day %2d", days);
            l.showSchool();
            l.ageSchool();
        }

    }
}
