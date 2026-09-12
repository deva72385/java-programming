import java.util.Scanner;
public class hrstomin{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int hrs=a/60;
        int min=a%60;
        System.out.print(hrs+"hrs"+min+"nins");
    }
}