package ArrayIndexing;

import java.util.Scanner;

public class ArrayIndexing {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] arrays = new int[100];
        int i=0;
        try{
            while(i<100){
                int randomNumber=(int)(Math.random()*10000);
                arrays[i]=randomNumber;
                i++;
            }
            System.out.println("Enter The Index Number: ");
            int number=input.nextInt();
            System.out.println(arrays[number]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }

}
