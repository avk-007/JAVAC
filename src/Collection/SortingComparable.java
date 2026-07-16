package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student1 implements Comparable<Student>{
    int age;
    String name;

    public Student1(int age,String name) {
        this.age = age;
        this.name=name;
    }

//generate
    public String toString() {
        return "Student1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student that) {
        if (this.age>that.age)
            return 1;
        else
            return -1;
    }
}
public class SortingComparable {
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
/*//requirement sort on their age
        Comparator<Student1> comparator=new Comparator<Student1>() {
            public int compare(Student1 i,Student1 j) {
                if (i.age>j.age)
                    return 1;
                else
                    return -1;
            }
        };*/

        //in lambda exoression way

        //requirement sort on their age
       // Comparator<Student1> comparator=new Comparator<Student1>() {
            //public int compare(Student1 i,Student1 j) {
             /*   if (i.age>j.age)
                    return 1;
                else
                    return -1;*/
        //lambda expression in one line
        Comparator<Student1> comparator=(i,j)->i.age>j.age?1:-1;

//List<Integer> studs=new ArrayList<>();
List<Student1> studs=new ArrayList<>();
//with dummy Student1s
        studs.add(new Student1(21,"sumit"));
        studs.add(new Student1(61,"anjali"));
        studs.add(new Student1(79,"suraj"));
        studs.add(new Student1(99,"subha"));


    //second way
//Available from collections.sort
   Collections.sort(studs,comparator);
        //enhanced for loop
        for (Student1 s : studs){
            System.out.println(s);
        }

    }
}

//requirement sort on their age