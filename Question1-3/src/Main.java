import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入学生学号：");

        String SearchStuid = scanner.nextLine();

        FileUtil fileUtil = new FileUtil();

        Student[] student =  fileUtil.parseStudents("students.txt");

        boolean flag = false;

        for (Student s:student) {

            if (s.getStuid().equals(SearchStuid)){

                System.out.println("学号："+s.getStuid());

                System.out.println("姓名："+s.getName());

                flag = true;
            }
        }

        if (flag){
            System.out.println("学生已找到");
        }else {
            System.out.println("该学生不存在");
        }

    }
}


