package _02_01.before;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

        List shapes = new ArrayList();
        shapes.add("Circle");
        System.out.println(shapes.get(0)); 
        String circle =(String) shapes.get(0);

    }

}
