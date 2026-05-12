import java.util.*;
public class arrayasavg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int [size];
        double sum =0;

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt(); 

        }
        for(int i=0; i<numbers.length; i++){
            sum = sum + numbers[i];


        }
        double average = sum / size;

        System.out.println("---------Result---------");
        System.out.println("the sum of numbers is : " +sum);
        System.out.println("The Average of numbers is : " + average);

        sc.close();


    }

    
}
