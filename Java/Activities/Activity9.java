package Activities;

import java.util.ArrayList;

public class Activity9 {

    public  static void main(String[] args){
        ArrayList<String> myList = new ArrayList<>(5);
        addData(myList);

    }

    public static void addData(ArrayList<String> input){
        System.out.println("Test Inside");

        input.add("Tara");
        input.add("Pranee");
        input.add("Vishnu");
        input.add("Amru");
        input.add("Rashmi");



        for(int i=0;i<input.size();i++){
            System.out.println(input.get(i).toString());
        }
        System.out.println("Third element in array is: "+input.get(3));
        System.out.println("searching for name Amru");
        for(int i=0;i<input.size();i++) {
            if(input.get(i).contains("Amru")){
                System.out.println("Name found "+ input.get(i));
            }

        }
        System.out.println("Size of array before removing element "+input.size());
        input.remove(3);
        System.out.println("Size of array after removing element "+input.size());
    }
}
