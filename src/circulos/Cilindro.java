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
public class Cilindro extends Circulo {

    private double h;
    private double volume;

    public Cilindro(double h, double radius) {
        super(radius);
        this.h = h;

    }

    public double calcArea() {
        super.setArea(2 * super.calcArea() + (2 * Math.PI * super.getRadius() * h));
        return super.getArea();
    }

    public double calcVolume() {
        volume = super.calcArea() * h;
        return volume;
    }

    @Override
    public String toString() {
        return super.toString()+" " + "h=" + h + ", volume=" + volume;
    }
    
    
}
