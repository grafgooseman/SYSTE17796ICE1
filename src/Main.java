//In the main method, create an array of 14 temps collected in one week, and pass the array to a method calcAvg.
//        In the calcAvg, create a loop to iterate through the array and calculate the average, the method should check
//        for temps > 50 or < -50, so they are not included in the calculation. Finally, calcAvg returns the average value
//        to the main method where it is printed out.


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> mediumTemps = new ArrayList<Integer>();
        //here I am editing code and instead 14 temperature days there will be 28
        for (int i = 0; i<28;i++){
            mediumTemps.add(getRandomNumber(-60,60));
        }
        System.out.println("Avarage: "+calcAvq(mediumTemps));

    }

    public static double calcAvq(ArrayList<Integer> arrayToAvq){
        int sumOfValues = 0;
        double avarage = 0;
        //Removing unwanted values
        for (int i = 0; i < arrayToAvq.size(); i++){
            if(arrayToAvq.get(i) > 50){
                arrayToAvq.remove(i);
            }else if(arrayToAvq.get(i) < -50){
                arrayToAvq.remove(i);
            }
        }

        for(int itemOfArray:arrayToAvq){
            sumOfValues += itemOfArray;
        }

        avarage = sumOfValues/arrayToAvq.size();

        return avarage;
    }

    //Just to make getting random nums intuitive
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
