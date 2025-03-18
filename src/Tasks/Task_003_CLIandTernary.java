package Tasks;

public class Task_003_CLIandTernary {
    public static void main(String[] args) {

int num1= Integer.parseInt(args[0]);
int num2 = Integer.parseInt(args[1]);
String result = (num1>num2)?"Your first integer is greater":" your second integer is greater";
        System.out.println(result);




    }
}
