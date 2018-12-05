import java.util.InputMismatchException;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {

        int i,j;
        int m,n,t;

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
            for (n = m+1;n < i ; n++){
                if (a[n]>a[m]){
                    t=a[n];
                    a[n]=a[m];
                    a[m]=t;
                }
            }
        }

        for (m = 0;m < i; m++){
            System.out.print(a[m]);
        }
    }
}
