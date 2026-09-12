import java.util.Scanner;
public class posneg{
    public static void main(String[] args){
    Scanner x=new Scanner(System.in);
    int n1=x.nextInt();
    if(n1%2==0){
        System.out.print("Even");
    }
    else{
        System.out.print("Odd");
    }

}
}