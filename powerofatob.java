import java.util.Scanner;
public class powerofatob{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b=x.nextInt();
        powerofatob(a,b);
    }
    static void powerofatob(int a,int b){
        int result=1;
        for(int i=0;i<b;i++){
            result=result*a;
        }
        System.out.print(result);

    }
    
}