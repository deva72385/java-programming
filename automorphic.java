import java.util.Scanner;
public class automorphic{
    public static void  main(String[] args){
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        automorphic(a);
    }
    static void automorphic(int a){
        int square=a*a;
        int temp=a;
        int divisor=1;
        while (temp>0){
            divisor=divisor*10;
            temp=temp/10;
        }
        if(square%divisor==a){
            System.out.print("Automorphic");
        }
        else{
            System.out.print("Not Automorphic");
        }
    }
}