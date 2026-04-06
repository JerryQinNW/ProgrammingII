/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulesix;

/**
 *
 * @author ZQIN
 */
public class Triangle extends Figure {

    Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double area() {
        System.out.println("Inside area of Triangle");
        return dim1 * dim2 / 2;
    }

}
