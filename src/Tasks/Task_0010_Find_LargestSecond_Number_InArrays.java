package Tasks;

public class Task_0010_Find_LargestSecond_Number_InArrays {
    public static void main(String[] args) {
        //Find Second Largest Number in an Array in java without any function
        int[] numbers = {23,15,45,68,99,48,65};
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i] > numbers[j]) {
                    System.out.println(numbers[i] + " is greater than " + numbers[j]);
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }

        }

        System.out.println("Second Largest number is " + numbers[numbers.length-2]);

    }
}
