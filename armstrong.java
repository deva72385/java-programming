import java.util.Scanner;
public class armstrong{
    public static void  main(String[] args){
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        armstrong(a);
    }
    static void armstrong(int a){
        int temp1=a;
        int digitcount=0;
        while(temp1>0){
            digitcount++;
        temp1=temp1/10;
        }
        int temp2=a;
       
        int totalsum=0;
        while(temp2>0){
        int lastdigit=temp2%10;
        int pow=1;
        for(int i=1;i<=digitcount;i++){
        pow=pow*lastdigit;

        }totalsum=totalsum+pow;
        temp2=temp2/10;
    }
        if(totalsum==a){
            System.out.print("Armstrong number");
        }
        else{
            System.out.print("Not Armstrong");
        }
    }
}