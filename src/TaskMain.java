import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TaskMain {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
        students.add(new Student("101","A","iut","res","1234"));
        students.add(new Student("102","B","iut","non res","123454"));
        students.add(new Student("103","C","iut","res","1234625"));

        List<Course> courses=new ArrayList<>();
        courses.add(new Course("cse101","oop","3","theory","1"));
        courses.add(new Course("cse102","oop","1.5","lab","1"));

        String filePath="Student.txt";
        writeStudentsToFile(students, filePath);

        String filePath1="Course.txt";
        writeCoursesToFile(courses,filePath1);

    }

    static void writeStudentsToFile(List<Student>students,String filePath){
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(filePath))) {

            for(Student student: students){
                writer.write(student.getId() + "," + student.getName() + "," + student.getAddress() + "," + student.getResidenceStatus()+ "," + student.getMobile());
                writer.newLine();
            }
            System.out.println("Data has been written");
        }
        catch (IOException e){
            System.out.println("error occurred"+ e.getMessage());
        }
    }

    static void writeCoursesToFile(List<Course>courses,String filePath1){
        try(BufferedWriter writer=new BufferedWriter(new FileWriter(filePath1))) {

            for(Course course: courses){
                writer.write(course.getCode() + "," + course.getCourseName() + "," + course.getCourseType() + "," + course.getCourseCredit()+ "," + course.getSemester());
                writer.newLine();
            }
            System.out.println("Data has been written");
        }
        catch (IOException e){
            System.out.println("error occurred"+ e.getMessage());
        }
    }

}

