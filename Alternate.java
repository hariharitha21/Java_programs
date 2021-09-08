import java.util.Scanner;
public class Numbers{
    public static void main(String[] args){
        int i,num;
        Scanner input=new Scanner(System.in);
        num=input.nextInt();
        for(i=1;i<num;i=i+2){
            System.out.println(i);
        }
    }
}
