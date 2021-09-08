import java.util.Scanner;
public class Numbers{
    public static void main(String[] args){
        int i,j,k,num;
        Scanner input=new Scanner(System.in);
        num=input.nextInt();
        for(i=1;i<=num;i++){
            for (k=num-i;k>0;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){ 
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
