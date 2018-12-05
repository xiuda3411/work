import java.util.List;
import java.util.Scanner;

    /**
     * 有序数组v
     * high为上界
     * low为下界
     * mid为中值
     * n为要找的数
     * p用来判断是否找到该数
     */
public class BinarySearch {
    static int p=0;
    public static void main(String[] args) {

        int[] v = {1,2,5,6,7,8,10,15,20,21,22,24,26,29,30,50,70};
        int high,low,mid,n;



        low=0;

        high=v.length-1;

        System.out.print("请输入所要查找的数字：");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        while (low < high){

            mid = (low+high)/2;

            if (n > v[mid]){
                low=mid+1;
            }

            if (n < v[mid]){
                high=mid-1;
            }

            if (n == v[mid]){
                System.out.println("该数位于数组v的第"+(mid+1)+"个");
                p++;
                break;
            }
        }

        if (p == 0){
            System.out.println("查无此数");
        }
    }
}
