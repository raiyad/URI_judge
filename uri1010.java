import java.io.IOException;
import java.util.Scanner;
 

public class Main {
 
    public static void main(String[] args) throws IOException {
    
      Scanner sc=new Scanner (System.in);
       int a,b,d,e; 
       double c,f,total;
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextDouble();
       d=sc.nextInt();
       e=sc.nextInt();
       f=sc.nextDouble();
       total=(b*c)+(e*f);
       System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
       
 
    }
 
}