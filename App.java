import java.util.Scanner;


// 추후 학습 내용이 더해지면 연산자, num1, num2 입력을 제대로 처리할 것
// 지금은 연산자, num1, num2가 제대로 입력된다고 가정하며
// num1과 num2는 int가 아니면 그냥 프로그램이 터지도록 처리.


public class App
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("--------------------");
            System.out.println("새로운 연산을 시작합니다");

            System.out.println("연산자를 입력해 주세요.(+, -, *, /)");
            String op = sc.nextLine();

            System.out.println("num1을 입력해주세요");
            String tmp1 = sc.nextLine();
            int num1 = Integer.parseUnsignedInt(tmp1);

            System.out.println("num2를 입력해주세요");
            String tmp2 = sc.nextLine();
            int num2 = Integer.parseUnsignedInt(tmp2);

            switch (op)
            {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        break;
                    }
                    System.out.println(num1 / num2);
                    break;
                default:
                    System.out.println("비정상적인 연산자를 입력했습니다.");
                    break;
            }

            System.out.println("연산 종료 실행? (exit를 입력하면 종료. 그 외의 경우 반복)");
            String exit = sc.nextLine();
            if(exit.equals("exit"))
            {
                System.out.println("종료합니다.");
                break;
            }
        }

        sc.close();

    }
}
