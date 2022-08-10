package TenPositiveNumber;

import java.util.Scanner;

public class TenPositiveNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] numbers=new int[10];
        int i=0;
        int sum=0;
        while (i<numbers.length){
            try{
                System.out.println("Enter The "+(i+1)+" no Number: ");
                numbers[i]=input.nextInt();
                checkNagativeNumber(numbers[i]);
                sum+=numbers[i];
            }catch (TestNagativNumber e){
                System.out.println(e.getMessage());
            }
            i++;
        }
        System.out.println("The Sum is: "+sum);
    }
    static void checkNagativeNumber(int number) throws TestNagativNumber{

            if(number<0){
                throw new TestNagativNumber("Input Positive Number.");

            }else {
                System.out.println("Okay!");
            }

    }
}
