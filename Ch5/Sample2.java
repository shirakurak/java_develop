package Ch5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sample2 {
  public static void main(String[] args) {

    List<Student> studentList = new ArrayList<>();
    studentList.add(new Student("Murata", 100));
    studentList.add(new Student("Okada", 70));
    studentList.add(new Student("Tanimoto", 80));

    System.out.println(studentList);
    
    // Java 7以前でのソート
    Collections.sort(studentList, new Comparator<Student>() {
      @Override
      public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getScore(), student2.getScore());
      }
    });
    
    System.out.println(studentList);
  }
} 
