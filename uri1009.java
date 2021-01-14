import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
      Scanner sc= new Scanner (System.in);
      String s;
      double a,b,TOTAL;
      s=sc.nextLine();
      a=sc.nextDouble();
      b=sc.nextDouble();
      TOTAL=a+(15*b)/100;
      System.out.printf("TOTAL = R$ %.2f\n",TOTAL);
 
    }
 
}