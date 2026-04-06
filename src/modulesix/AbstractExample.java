/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulesix;
import java.util.*;

/**
 *
 * @author ZQIN
 */
public class AbstractExample {

    public static void main(String[] args) {
      //  Figure f1 = new Figure (4, 5); //illegal

        Rectangle r1 = new Rectangle(5, 6);
        Triangle t1 = new Triangle(2, 3);

        System.out.println(r1.area());
        System.out.println(t1.area());

        ArrayList<Figure> flist = new ArrayList<>();
        flist.add(new Rectangle(5, 6));
        flist.add(new Triangle(2, 3));

        for (Figure f : flist) {
            System.out.println(f.area());
        }
    }

}
