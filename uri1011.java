import java.io.IOException;
 
import java. util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner sc= new Scanner (System.in);
         double pi,R,VOLUME;
         pi=3.14159;
         R=sc.nextDouble();
         VOLUME=(4.0/3)*pi*R*R*R;
         System.out.printf("VOLUME = %.3f\n",VOLUME);
         
    }
 
}

