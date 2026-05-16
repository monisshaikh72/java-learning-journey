//Single level inheritance-- parents and child class only
/*multi level inheritance-- parent class to child class and child class also have 
parents class ex- shape to triangle and triangle to equilateral triangle*/
/* Heirarchiel inheritance-- Parent class have 2 or more than different child
classes ex- class shape extends to 1> class triangle & 2> class circle */
/*Hybrid inheritance-- different child and also child have different classes there
ex- shape to triangle, triangle extends to equittriangle and circle is different
class */

class shape{
    public void area(){
    System.out.println("Display area");
    }
}
class triangle extends shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class equilateral  extends triangle{
    public void area(int l, int h ){
        System.out.println(1/2*l*h);

    }
}
class cicle extends shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}



public class inheritance {
    public static void main(String args[]){
        
    }
    
}
