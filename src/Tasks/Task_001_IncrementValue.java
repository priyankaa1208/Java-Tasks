package Tasks;

public class Task_001_IncrementValue {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
    }
}
