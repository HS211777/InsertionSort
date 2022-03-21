package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static ArrayList<Integer> array = new ArrayList<>();

    public static void main(String[] args) {
        createArray();
        System.out.println(array);
        boolean valid = false;
        while (!valid){
            for (int i = 0; i < array.size()-1; i++){
                int count = 0;
                boolean end = false;
                while (count <= i && !end){
                    if (array.get(count) > array.get(i+1)){
                        int temp = array.get(count);
                        array.set(count, array.get(i+1));
                        array.set(i+1,temp);
                        //System.out.println(array);
                        end = true;
                    }
                    count++;
                }
            }
            valid = true;
            for (int i = 0; i < array.size()-2; i++){
                if (array.get(i) > array.get(i+1)){
                    valid = false;
                }
            }
        }

        System.out.println(array);
    }

    public static int randInt(){
        Random rand = new Random();
        return rand.nextInt(10)+1;
    }

    public static void createArray(){
        for (int i = 0; i < 10; i++){
            array.add(randInt());
        }
    }
}
