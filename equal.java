import java.util.Scanner;
public class equal{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int num1=x.nextInt();
        int num2=x.nextInt();
        if(num1==num2){
            System.out.print("Equal");
        }
        else{
            System.out.print("Not Equal");
        }
    }
}