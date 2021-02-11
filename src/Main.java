import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> mediumTemps = new ArrayList<Integer>();
        // Num of temperature days is back to 14
        for (int i = 0; i<14;i++){
            mediumTemps.add(getRandomNumber(-60,60));
        }
        System.out.println(mediumTemps);
        System.out.println("Average: "+calcAvq(mediumTemps));
        System.out.println("Max value: "+calcMax(mediumTemps));

    }

    public static int calcMax(ArrayList<Integer> passedArrayList){
        //Creating a local copy of the ArrayList
        ArrayList<Integer> localArrayList = new ArrayList<Integer>(passedArrayList);
        int theBiggestInt = Integer.MIN_VALUE;
        for(int i:localArrayList){
            if(i > theBiggestInt){
                theBiggestInt = i;
            }
        }
        return theBiggestInt;
    }

    public static double calcAvq(ArrayList<Integer> passedArrayList){

        //In previous versions I accidentally edit the main ArrayList.
        //That interfere with other methods
        //Now I am creating a local copy in order to remove this side effect
        //However I still need to pass it inside the method
        //Even considering that I can edit ArrayList that is in the main without return
        //I would like to hear your explanation

        ArrayList<Integer> localArrayList = new ArrayList<Integer>(passedArrayList);
        int sumOfValues = 0;
        double average = 0;

        //Removing unwanted values
        for (int i = 0; i < localArrayList.size(); i++){
            if(localArrayList.get(i) > 50){
                localArrayList.remove(i);
            }else if(localArrayList.get(i) < -50){
                localArrayList.remove(i);
            }
        }

        //finding the sum of all values in the array
        for(int itemOfArray:localArrayList){
            sumOfValues += itemOfArray;
        }

        average = sumOfValues/localArrayList.size();

        return average;
    }

    //Just to make getting random nums intuitive
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
