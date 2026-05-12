import java.util.Scanner;

public class arrays3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String name[] = new String[size];

        for(int i=0; i<size; i++){
            name[i] = sc.next();
        }
        String x = sc.next();

        for(int i=0; i<name.length; i++){
            if(name[i].equals(x)){

            System.out.println("Name found at: " +i);


            }
        }

 
        sc.close();

    }
    
}
