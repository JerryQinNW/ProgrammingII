/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulesix;

/**
 *
 * @author ZQIN
 */
public abstract class Figure {

    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    public abstract double area();
    
    public String dimension(){
        return "Dimension: " + dim1 +" " +dim2;
    }

}
