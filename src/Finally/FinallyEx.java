package Finally;
public class FinallyEx{
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program ended.");
    }
}
/*
Important Rules of finally
The finally block can be used with try and catch, or with try alone.
It normally executes whether an exception occurs or not.
It normally executes even if a return statement is encountered in try or catch.
It is commonly used for resource cleanup.
It may not execute if the JVM terminates abruptly, such as through System.exit() or a process crash.
Avoid returning from finally, because it can override a return value or suppress an exception.
Difference Between final, finally, and finalize()

1. final

Prevents changing a variable, overriding a method, or extending a class.

2. finally

Executes cleanup code after try/catch in normal control flow.

3. finalize()

An obsolete object-cleanup method that is deprecated and should not be used.
Interview Tip

Remember that finally is mainly used for cleanup and normally executes whether an exception is thrown or not. For modern Java resource management, try-with-resources is often preferred for resources such as files and streams.
 */