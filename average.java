import java.util.Scanner;
public class average{
    public static void main(String[]args){
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b=x.nextInt();
        int c=x.nextInt();
        float avg = a+b+c/3;
        System.out.print(avg);

    }
}