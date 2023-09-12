import java.util.*;

class MyException extends Exception
{
    public static void main(String args[]) 
    {
        try{
                int a=10/5;
                System.out.println(a);
           }
        catch(Exception e)
        {
            System.out.println("Divide by 0");
        }
    }
}