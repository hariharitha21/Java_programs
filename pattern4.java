import java.util.Scanner;
public class Numbers{
    public static void main(String[] args){
        int i,j,l,k,num,n;
        Scanner input=new Scanner(System.in);
        num=input.nextInt();
        for(i=1;i<=num;i++){
            for (k=num-i;k>0;k--){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){ 
                System.out.print(j);
            }
            for(l=j-2,n=65+l-1;l>0;l--,n--){ 
                System.out.print((char)n);
            }
            System.out.println();
        }
    }
}
