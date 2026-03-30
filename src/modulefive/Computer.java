/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulefive;

/**
 *
 * @author ZQIN
 */
public class Computer {
    //Instance Variables
    private String os;
    private int size;
    private String brand;
    
    public Computer()
    {
        this("", 0, "");
    }
    
    public Computer(String os, int size, String brand)
    {
        this.os = os;
        this.size = size;
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString()
    {
        return "OS: " + os + " Brand: " + brand + " Size: " + size;
    }
    
    //equals Method - two Computer Objects are considered equal if they
    //have the same brand
    @Override
    public boolean equals(Object o){
    if(o instanceof Computer)
        return this.brand.equals(((Computer)o).brand);
    return false;
    }
    
}
