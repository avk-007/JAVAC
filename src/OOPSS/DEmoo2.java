package OOPSS;

class ComputeRr {

    public void playMusic(){
        System.out.println("play music");
    }
    public boolean returnBook(){
        System.out.println ("book");
        return false;
    }
    public String getMeaPen(int cost){
        if (cost>=10) {
            return "pen";
        }
            return "nothing";
     }
}
public class DEmoo2 {
    public static void main(String[] args) {
        ComputeRr computeRr=    new ComputeRr();
        computeRr.playMusic();
        String meaPen = computeRr.getMeaPen(2000 );
        System.out.println(meaPen);
    }
}
