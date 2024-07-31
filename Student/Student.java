package Assingment_01.Program01.src;

public class Student {
        String[] str=new String[4];
        Student(String studentId,String name,String age,String grade){
            str[0]=studentId;
            str[1]=name;
            str[2]=age;
            str[3]=grade;
        }
        public String[] get_details(){
            return str;
        }
        public void display_details(String[] q){
            System.out.println("StudentID: "+q[0]);
            System.out.println("Name: "+q[1]);
            System.out.println("Age: "+q[2]);
            System.out.println("Grade: "+q[3]);
            System.out.println();System.out.println();
        }
}