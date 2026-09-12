import java.util.Scanner;
public class largestof3{
    public static void main(String[] args){
        Scanner x=new Scanner (System.in);
        int a=x.nextInt();
       int  b=x.nextInt();
        int c=x.nextInt();
        if(a>b&&b>c){
            System.out.print(a);
        }
        else if(b>a&&b>c){
            System.out.print(b);
        }
        else{
            System.out.print(c);
        }
    }
}