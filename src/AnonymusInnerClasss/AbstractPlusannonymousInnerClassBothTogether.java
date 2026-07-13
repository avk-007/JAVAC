package AnonymusInnerClasss;

abstract class ABc
{
  public abstract void show();
  public abstract void config();

}

public class AbstractPlusannonymousInnerClassBothTogether {

    public static void main(String[] args) {

        ABc abc=new ABc()
        {
            public void show(){
                System.out.println("i want to print void show ");
            }

            @Override
            public void config() {
                System.out.println("i want to print void config");
            }
        };
        abc.show();
        abc.config();

    }
}
