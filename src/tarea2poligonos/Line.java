package tarea2poligonos;

public class Line {
    private Point p1;
    private Point p2;
    
    public Line(){
        p1.setX(0.0);
        p1.setY(0.0);
    }
    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    public Line(Double x1, Double y1, Double x2, Double y2){
        p1.setX(x1);
        p1.setY(y1);
        p2.setX(x2);
        p2.setY(y2);
    }
    public Point getP1(){
        return p1;
    }
    public Point getP2(){
        return p2;
    }
    public Double getDistance(){//calcula la distancia entre dos puntos, o la longitud de un segmento 
        double r;
        r = Math.pow((p1.getX()-p2.getX()),2) + Math.pow((p1.getY()-p2.getY()),2);
        return Math.sqrt(r);
    }    
}
