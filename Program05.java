import java.util.Scanner;
public class Program05 {
    public static boolean isleap(int n) {
        if (n%4==0){
            if (n%100==0){
                return n%400==0;
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 4 digit number: ");
        int n=sc.nextInt();
        boolean b=isleap(n);
        System.out.println(b);
    }
}
