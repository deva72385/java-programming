import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b=x.nextInt();
        factorial(a);
    }
    static void factorial(int a){
       int fact=1;
       for(int i=1;i<=a;i++){
        fact=fact*i;
       }
    
       System.out.print(fact);
    }
    
}