package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student{
    int age;
    String name;

    public Student(int age,String name) {
        this.age = age;
        this.name=name;
    }


//generate
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
public class SortingCompator {

    public static void main(String[] args) {
/*//with own logic we are using comparator
        Comparator<Integer> comparator=new Comparator<Integer>() {
            public int compare(Integer i,Integer j) {
                if (i%10>j%10)
                return 1;
                else
                    return -1;
            }
        };*/
//requirement sort on their age
        Comparator<Student> comparator=new Comparator<Student>() {
            public int compare(Student i,Student j) {
                if (i.age>j.age)
                    return 1;
                else
                    return -1;
            }
        };

//List<Integer> studs=new ArrayList<>();
List<Student> studs=new ArrayList<>();
//with dummy students
        studs.add(new Student(21,"sumit"));
        studs.add(new Student(61,"anjali"));
        studs.add(new Student(79,"suraj"));
        studs.add(new Student(99,"subha"));


    //second way
//Available from collections.sort
  //   Collections.sort(studs);
        //enhanced for loop
        for (Student s : studs){
            System.out.println(studs);
        }

    }
}

//requirement sort on their age