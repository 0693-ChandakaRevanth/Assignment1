import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Rectangle obj=new Rectangle();
        System.out.println("Enter Length:" );
        obj.length=sc.nextDouble();
        System.out.println("Enter Breadth:" );
        obj.breadth=sc.nextDouble();
        double length1=obj.getLength();
        double breadth1=obj.getBreadth();
        System.out.println(obj.area(length1,breadth1));
        System.out.println(obj.perimeter(length1,breadth1));
    }
}