/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2poligonos;

public class Point {
    //variables del punto
    private Integer x;
    private Integer y;
    //constructores
    public Point(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }
    public void setX(Integer x){
        this.x = x;
    }
    public Integer getX(){
        return x;
    }
    public void setY(Integer y){
        this.y = y;
    }
    public Integer getY(){
        return y;
    }
    
}
