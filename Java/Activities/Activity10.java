package Activities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Activity10 {

    public  static void main(String[] args){
        HashSet<String> hs=new HashSet<>();
        hs.add("Mango");
        hs.add("Pineapple");
        hs.add("Apple");
        hs.add("Grapes");
        hs.add("Banana");
        hs.add("Orange");
        System.out.println(hs.size());
        System.out.println("Set before removal: "+hs);
        if(hs.remove("Apple")){
            System.out.println("Apple removed from set");
        }else{
            System.out.println("Apple not removed from set");
        }
        //for (int i=0;i<hs.size();i++){

      //  }
        if(hs.contains("Mango")){
            System.out.println("Mango present");
        }else{
            System.out.println("Mango not present");
        }
        System.out.println(hs);
    }
}
