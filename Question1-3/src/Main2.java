import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        int max = 0;//最多被使用
        int temp = 0;//下标
        int time = 0;//使用次数

        FileUtil fileUtil = new FileUtil();

        Student[] student = null;

        List<Student> list1 = new ArrayList<>();

        try {

            student = fileUtil.parseStudents("students.txt");

            for (Student s1:student) {
                list1.add(s1);
            }

            List<Integer> list2 = new ArrayList<>();

            for (int i = 0; i < list1.size(); i++) {
                list2.add(i,0);

            }

            for (int i = 0; i < list1.size(); i++) {

                for (int j = 0; j < list1.size(); j++) {

                    if ( list1.get(i).getName().equals ( list1.get(j).getName() ) ){

                        int t = list2.get(i);
                        list2.set(i,t+1);
                    }
                }
            }

            for(int i=0;i<list1.size();i++){
                if(list2.get(i)>max){

                    max = list2.get(i);

                    temp = i;//找出下标

                }
            }

            time = list2.get(temp);

            time = time-1;//减去本身

            System.out.println("使用次数最多的名字是："+list1.get(temp).getName());

            System.out.println("使用次数为："+time);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
