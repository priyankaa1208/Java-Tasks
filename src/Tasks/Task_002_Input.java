package Tasks;

public class Task_002_Input {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //String name = scan.next();
      // int age = scan.nextInt();
     // double salary = scan.nextDouble();
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
