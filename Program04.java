import java.util.*;
public class Program04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double head =0;
        double trail = 0;
        System.out.println("enter the value to flip the coin");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++) {
            double a= Math.random();
            if(a<0.5){
                trail++;
            }
            else{
                head++;
            }
        }
        System.out.println("The percentage of head is "+(head/n)*100);
        System.out.println("the probability of trail is "+(trail/n)*100);
    }
}
