import java.util.Scanner;
public class onlyeven{
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        onlyeven(n);
    }
    static void  onlyeven(int n){
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.print(i);
            }
            
        }
    }
}