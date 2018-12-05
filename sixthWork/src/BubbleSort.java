import java.util.InputMismatchException;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        int i,j;
        int m,n,t;
        int flag;


        System.out.printf("请输入你要输入的数字个数:");
        Scanner scanner=new Scanner(System.in);
        i = scanner.nextInt();

        int[] a=new int[i];

        try {
            System.out.println("请输入数字:");
            for (j = 0;j < i; j++){
                a[j]=scanner.nextInt();
            }
        }catch (InputMismatchException e){
            System.out.println("请以空格为间隔输入正确的数字");
        }


        for(m = 0;m < i ; m++){
            flag=0;
            for (n = 0;n < i-m-1 ; n++){
                if (a[n]>a[n+1]){
                    t=a[n];
                    a[n]=a[n+1];
                    a[n+1]=t;
                }else {
                    flag++;
                    System.out.println(flag);
                }
            }
            if (flag == i-m-1){
                break;
            }
        }

        for (m = 0;m < i; m++){
            System.out.print(a[m]);
        }
    }
}
