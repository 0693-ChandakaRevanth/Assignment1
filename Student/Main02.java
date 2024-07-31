package Assingment_01.Program01.src;
public class Main02 {
    public static void main(String[] args) {
        Student obj1=new Student("01","Revanth","22","B");
        Student obj2=new Student("02","Harsha","22","A");
        Student obj3=new Student("03","Gopi","22","A");
        Student obj4=new Student("04","Nihanth","22","C");
        String[] a1 = obj1.get_details();
        String[] a2 = obj2.get_details();
        String[] a3 = obj3.get_details();
        String[] a4 = obj4.get_details();
        obj1.display_details(a1);
        obj2.display_details(a2);
        obj3.display_details(a3);
        obj4.display_details(a4);
    }
}