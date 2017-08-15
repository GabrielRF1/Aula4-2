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
public class Geometry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c = new Circulo(4);
        c.calcArea();
        Cilindro cil = new Cilindro(7, 5);
        cil.calcArea();
        cil.calcVolume();
        Esfera es = new Esfera(7);
        es.calcArea();
        es.calcVolume();
        
        System.out.println(c.toString()+"\n\n\n"+
                cil.toString()+"\n\n\n"+
                es.toString()+"\n\n\n");

    }

}
