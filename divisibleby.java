import java.util.Scanner;
public class divisibleby{
    public static void  main(String[] args){
        Scanner x=new Scanner(System.in);
        int num=x.nextInt();
        if(num%5==0&&num%11==0){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}