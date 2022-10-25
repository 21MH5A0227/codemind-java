import java.util.Scanner;
class L{ 
    public static void main(String args[]){ 
        Scanner s=new Scanner(System.in); 
        double n=s.nextDouble(); 
        double r=0.0; 
        r=((n*9)/5)+32; 
        System.out.printf("%.2f",r); 
    }
}