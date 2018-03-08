/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Color;
import tarea2poligonos.Pentagono;

/**
 *
 * @author Karen Velasco
 */
public class Pantalla extends Frame{
    //para el pentagono
    Pentagono p;
    public Pantalla( Pentagono p) {
        this.p = p;
        this.setSize(1000,1000 );
        this.setVisible( true );
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawLine(p.getP1().getX(), p.getP1().getY(), p.getP2().getX(), p.getP2().getY());
        g.drawLine(p.getP2().getX(), p.getP2().getY(), p.getP3().getX(), p.getP3().getY());
        g.drawLine(p.getP3().getX(), p.getP3().getY(), p.getP4().getX(), p.getP4().getY());
        g.drawLine(p.getP4().getX(), p.getP4().getY(), p.getP5().getX(), p.getP5().getY());
        g.drawLine(p.getP5().getX(), p.getP5().getY(), p.getP1().getX(), p.getP1().getY());
    }

    
}
