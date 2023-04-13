/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.AreaCalculavel;
import Model.Circulo;
import Model.Quadrado;
import Model.Retangulo;

/**
 *
 * @author 13304611690
 */
public class Main {
    public static void main(String[] args) {
        AreaCalculavel a = new Retangulo(3, 2);
        System.out.println(a.calculaArea());
        
        a = new Quadrado(5);
        System.out.println(a.calculaArea());
        
        a = new Circulo(2.5);
        System.out.println(a.calculaArea());
    }
}
