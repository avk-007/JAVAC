package MethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Student{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class ConstrcutorReference {

    public static void main(String[] args) {
        List<String> names= Arrays.asList("navin","kumar","bharti","bihari");

        List<Student> students=new ArrayList<>();
/*        //enhanced for loop
        for (String name : names){
            students.add(new Student(name));
        }
        System.out.println(students);*/

/*        //with stream Api
        students=names.stream()
        .map(name->new Student(name))
                .toList();
        System.out.println(students);*/

        //shortcut with ConstrcutorReference

        students=names.stream()
                .map(Student::new)
                .toList();
        System.out.println(students);
    }
}
