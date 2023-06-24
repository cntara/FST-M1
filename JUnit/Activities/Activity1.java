package Activities;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {

    static ArrayList<String> list;
    @BeforeEach
    public void setup(){
        list=new ArrayList<String>();
        list.add("Alpha");
        list.add("Beta");

    }
    @Test
    void insertTest(){
        assertEquals(2,list.size(),"Wrong Size");
        list.add("Gama");
        assertEquals(3, list.size(),"Wrong size");
        assertEquals("Alpha",list.get(0),"Wrong element");
        assertEquals("Beta",list.get(1),"Wrong element");
        assertEquals("Gama",list.get(2),"Wrong element");
    }
@Test
    void replaceTest(){
    list.set(1, "Gama");
    assertEquals(2,list.size(),"Wrong Size");
    assertEquals("Beta",list.get(1),"Wrong element");
    assertEquals("Gama",list.get(2),"Wrong element");
    }

}
