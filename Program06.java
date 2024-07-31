import java.util.Scanner;
public class Program06 {
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
        System.out.print("Enter a number between 0 and 31: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(isleap((int)Math.pow((int)2,(int)i)));
        }
    }
}
