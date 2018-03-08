/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2poligonos;

import View.Pantalla;

/**
 *
 * @author Karen Velasco
 */
public class PanelDibujo {
    public static void main( String[] args ) {
        Integer [] x = {400, 500, 600, 100,200};
        Integer [] y = {100,400,500,400,100};
        Point p1 = new Point(x[0], y[0]);
        Point p2 = new Point(x[1], y[1]);
        Point p3 = new Point(x[2], y[2]);
        Point p4 = new Point(x[3], y[3]);
        Point p5 = new Point(x[4], y[4]);
        Pentagono penta = new Pentagono(p1,p2,p3,p4,p5);
        Pantalla p = new Pantalla(penta);
    }
}
