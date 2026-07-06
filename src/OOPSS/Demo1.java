package OOPSS;
//class7
class Computer{
    //method
    //what type of access for method
    //void nothing returns in it
   public  void playmusic(){
       System.out.println("music playing");
    }

    //int cost paramaters
    //its not void so type will be String
    public String getMeAPen(int cost){
       if (cost>=10)
       return "pen";
       else
        return "nothing";
    }
}
public class Demo1 {
    public static void main(String[] args) {

        Computer computer=new Computer();
        computer.playmusic();
        String meAPen = computer.getMeAPen(50);
        System.out.println(meAPen);
    }
}
