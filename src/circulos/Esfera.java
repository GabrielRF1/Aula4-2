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
public class Esfera extends Circulo{
 private double volume;

    public Esfera(double radius) {
        super(radius);   
    }
    
    public double calcVolume(){
    volume = 4/3*super.calcArea()*super.getRadius() ;
    return volume;
    }
 
    public double calcArea(){
        super.setArea(4*super.calcArea());
        return super.getArea();
    }

    @Override
    public String toString() {
        return super.toString()+" " + "volume=" + volume;
    }


}
