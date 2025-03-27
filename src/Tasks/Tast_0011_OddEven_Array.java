package Tasks;

public class Tast_0011_OddEven_Array {
    public static void main(String[] args) {
        int[] num = {2,5,7,8,4,3,7,6};
        for(int i : num)
        {
            if(i%2==0)
            {
                System.out.println( i + " is Even numbers");
            }else{
                System.out.println( i + " is odd numbers");
            }
        }
    }
}
