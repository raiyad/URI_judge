import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        double A,B,MEDIA;
        Scanner sc= new Scanner (System.in);
        A=sc.nextDouble();
        B=sc.nextDouble();
        MEDIA=(A*3.5+B*7.5)/(3.5+7.5);
        System.out.printf("MEDIA = %.5f\n",MEDIA);
    }
    
}