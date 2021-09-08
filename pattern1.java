import java.util.Scanner;
public class Numbers{
    public static void main(String[] args){
        int i,j,num;
        Scanner input=new Scanner(System.in);
        num=input.nextInt();
        for(i=1;i<=num;i++){
            for(j=1;j<=i;j++){ 
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
