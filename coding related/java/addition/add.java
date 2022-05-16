// package addition;
import java.util.*;
public class add{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int numbers[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
            sum+=numbers[i];
        }
        System.out.println(sum);
    }
}