package tarea2poligonos;

public class Pentagono {
    //construir un pentagono con base en radio y angulo a comenzar 
    private Point p1; //declaracion, construccion, inicializacion
    private Point p2;
    private Point p3;
    private Point p4;
    private Point p5;
    private Line l1;
    private Line l2;
    private Line l3;
    private Line l4;
    private Line l5;
    //constructores
    public Pentagono(){
        this.p1 = new Point(0.0,0.0);
        this.p2 = new Point(0.0,0.0);
        this.p3 = new Point(0.0,0.0);
        this.p4 = new Point(0.0,0.0);
        this.p5 = new Point(0.0,0.0);
        crearLineas();
    }
    public Pentagono(Point p1, Point p2, Point p3, Point p4, Point p5){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.p5 = p5;
        crearLineas();
    }
    public Pentagono(Double radio){
        //Origen por default
        Double a=0.0;//a es el angulo
        p1.setX(radio * Math.cos(a));
        p1.setY(radio * Math.sin(a));
        a+=72;
                
        p2.setX(radio * Math.cos(a));
        p2.setY(radio * Math.sin(a));
        a+=72;
        
        p3.setX(radio * Math.cos(a));
        p3.setY(radio * Math.sin(a));
        a+=72;
        
        p4.setX(radio * Math.cos(a));
        p4.setY(radio * Math.sin(a));
        a+=72;
        
        p5.setX(radio * Math.cos(a));
        p5.setY(radio * Math.sin(a));
        
        crearLineas();
    }
    
    public Pentagono(Double radio, Double a){
        p1.setX(radio * Math.cos(a));
        p1.setY(radio * Math.sin(a));
        a+=72;
                
        p2.setX(radio * Math.cos(a));
        p2.setY(radio * Math.sin(a));
        a+=72;
        
        p3.setX(radio * Math.cos(a));
        p3.setY(radio * Math.sin(a));
        a+=72;
        
        p4.setX(radio * Math.cos(a));
        p4.setY(radio * Math.sin(a));
        a+=72;
        
        p5.setX(radio * Math.cos(a));
        p5.setY(radio * Math.sin(a));        
        
        crearLineas();
    }
    private void crearLineas(){
        l1 = new Line(this.p1,this.p2);
        l2 = new Line(this.p2,this.p3);
        l3 = new Line(this.p3,this.p4);
        l4 = new Line(this.p4,this.p5);
        l5 = new Line(this.p5,this.p1);
    }
    public Point getP1(){
        return p1;
    }
    public Point getP2(){
        return p2;
    }
    public Point getP3(){
        return p3;
    }
    public Point getP4(){
        return p4;
    }public Point getP5(){
        return p5;
    }
    
}
