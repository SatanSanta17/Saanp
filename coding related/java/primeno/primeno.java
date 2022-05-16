// import java.util.*;
public class primeno{
    public static void main(String[] args) {
        int count=0;
        int n=100;
        System.out.println(1);
        System.out.println(2);
        boolean isPrime=true;
        for(int i=3;i<=n;i++){
            isPrime=true;
            int j=2;
            for(j=2;j*j<=i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){ System.out.println(i);
                count++;}
        }
        System.out.println("total prime numbers are: "+count);
    }
}