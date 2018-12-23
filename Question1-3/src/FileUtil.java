
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {

    public static Student[] parseStudents(String filePath) throws IOException {

        Student[] stus = new Student[18826];

        File file = new File(filePath);
        BufferedReader reader = new BufferedReader(
                new FileReader(file)
        );

        int i = 0;
        String line;
        while ((line = reader.readLine()) != null) {
            String[] info = line.split(",");
            Student student = new Student(info[0], info[1]);
            stus[i++]=student;
        }
        return stus;
    }

}