package Arrays;

public class Student {
    //instance varaiable belongs to class not to a method
    int rollno;
    String name;
    int marks;

    public static void main(String[] args) {
/*        int nums[]=new int[4];
        nums[0]=4;
        nums[1]=3;
        nums[2]=7;
        nums[3]=2;
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }*/
//print all students info
        Student student1=new Student();
        student1.marks=20;
        student1.rollno=1;
        student1.name="abhishek";

        Student student2=new Student();
        student2.marks=28;
        student2.rollno=2;
        student2.name="abhi";

        Student student3=new Student();
        student3.marks=33;
        student3.rollno=3;
        student3.name="sumit";

        //array of students with students
        //create array student assign to a array
        Student students[]=new Student[3];
        students[0]=student1;
        students[1]=student2;
        students[2]=student3;

/*        for (int i=0;i<students.length;i++){
         *//* //String  concatenation  students[i].marks + " : "
                               + students[i].rollno + " : "
                                + students[i].name *//*
            System.out.println
                    (
                      students[i].marks + " : "
                    + students[i].rollno + " : "
                    + students[i].name
                    );
        }*/

        //for enhanced loop other way Use Student not int

        for (Student studs : students ){
            System.out.println(studs.marks+" "
            +studs.name+" " + studs.rollno);
        }
    }
}
