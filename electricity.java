import java.util.Scanner;
public class electricity{
    public static void main(String [] args){
          Scanner x=new Scanner(System.in);
          int unit=x.nextInt();
          double bill;
          if(unit<100){
               bill=unit*1.5;
               System.out.print(bill);
          }
          else if(unit>=100&&unit<=200){
            bill =(100*1.5)+(unit-100)*2.5;
            System.out.print(bill);

          }
          else{
            bill=(100*1.5)+(100*2.5)+(unit-200)*4;
            System.out.print(bill);
          }
    }
}