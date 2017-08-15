/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulos;

/**
 *
 * @author 17100518
 */
public class Circulo {

    private double radius;
    private double area;

    public Circulo(double radius) {
        this.radius = radius;

    }

    public double calcArea() {
        this.area = Math.PI * radius * radius;
        return area;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "radius=" + radius + ", area=" + area ;
    }

    
}
