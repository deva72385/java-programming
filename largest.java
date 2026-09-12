import java.util.Scanner;
public class largest{
    public static void main(String[] args){
    Scanner x=new Scanner(System.in);
    int n1=x.nextInt();
    int n2=x.nextInt();
    if(n1>n2){
        System.out.print(n1);
    }
    else{
        System.out.print(n2);
    }
    }

}