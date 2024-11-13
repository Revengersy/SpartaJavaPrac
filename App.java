import java.util.Scanner;


public class App
{
    enum Operation { PLUS, MINUS, MULTIPLY, DIVIDE }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("연산자를 입력해 주세요.");
        sc.nextLine();




        switch ()
        // input흐름 제어
        // output GUI
        //
//
//
    }

    public static boolean isValidOperation(String input)
    {
        try{
            Operation.valueOf(input.toUpperCase());
            return true;
        }
        catch (IllegalArgumentException e){
            return false;
        }
    }
}
