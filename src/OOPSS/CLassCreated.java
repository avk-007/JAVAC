package OOPSS;
//int cost paramaters
//its not void so type will be String

class Calculator{
    //method
    //what type of access for method
    //void nothing returns in it
    //int return int
    public int addNo(int a,int b){
        int result=a+b;
        return result ;
    }
}
public class CLassCreated {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        int i = calculator.addNo(1, 3);
        System.out.println(i);
    }
}