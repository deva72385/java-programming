import java.util.Scanner;
public class grade{
    public static void main(String[] args){
        Scanner x= new Scanner(System.in);
        int a=x.nextInt();
        if(a>=90&&a<=100){
            System.out.print("Grade A");
        }
        else if(a>=80&&a<90){
            System.out.print("Grade B");
        }
        else if(a>=70&&a<80){
            System.out.print("Grade c");
        }
        else if(a>=60&&a<70){
            System.out.print("Grade D");
        }
        else{
            System.out.print("Fail");
        }
    }
}