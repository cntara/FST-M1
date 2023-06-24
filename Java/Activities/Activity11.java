package Activities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Activity11 {

    public  static void main(String[] args){
        Map<Integer,String> hm = new HashMap<Integer,String>(5);
        hm.put(1,"blue");
        hm.put(2,"orange");
        hm.put(3,"Navy");
        hm.put(4,"Green");
        hm.put(5,"yellow");
        System.out.println("before size "+hm.size());
        if(hm.remove(1,"blue")){
            System.out.println("Blue color removed");
        }else{
            System.out.println("Blue color not removed");
        }
        if(hm.containsValue("Green")){
            System.out.println("Found green");
        }
        System.out.println("After size "+hm.size());
    }

}
