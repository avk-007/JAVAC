package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//agter removing  implements Comparablestill workss
class Student2{
    int age;
    String name;

    public Student2(int age,String name) {
        this.age = age;
        this.name=name;
    }

    //generate
    public String toString() {
        return "Student2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
public class COmparable {
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
        Comparator<Student2> comparator=new Comparator<Student2>() {
            public int compare(Student2 i,Student2 j) {
                if (i.age>j.age)
                    return 1;
                else
                    return -1;
            }
        };*/

        //in lambda exoression way

        //requirement sort on their age
        // Comparator<Student2> comparator=new Comparator<Student2>() {
        //public int compare(Student2 i,Student2 j) {
             /*   if (i.age>j.age)
                    return 1;
                else
                    return -1;*/
        //lambda expression in one line
        Comparator<Student2> comparator=(i,j)->i.age>j.age?1:-1;

//List<Integer> studs=new ArrayList<>();
        List<Student2> studs=new ArrayList<>();
//with dummy Student2s
        studs.add(new Student2(21,"sumit"));
        studs.add(new Student2(61,"anjali"));
        studs.add(new Student2(79,"suraj"));
        studs.add(new Student2(99,"subha"));


        //second way
//Available from collections.sort
        Collections.sort(studs,comparator);
        //enhanced for loop
        for (Student2 s : studs){
            System.out.println(s);
        }

    }
}

