package Session2_3;
@FunctionalInterface
interface Abhi{
    public void m(int a, int b, int c);
}

public class C {
    public static void main(String[] args) {

        {
            Abhi abhi = (a, b, c) -> {
                int i = a + b + c;
            };
        }
    }
}
