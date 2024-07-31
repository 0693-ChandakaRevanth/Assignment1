public class Rectangle {
    double length;
    double breadth;
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public double area(double l,double b){
        return l*b;
    }
    public double perimeter(double l,double b){
        return 2*(l+b);
    }
}