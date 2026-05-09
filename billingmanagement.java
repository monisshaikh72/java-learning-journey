import java.util.*;
public class billingmanagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bread = 40;
        int toast = 100;
        int butter = 120;
        int khari = 80;

        
        System.out.println("Welcome to apna bakery");
         System.out.println("----------------------------------------------------");
          System.out.println(" bread = price 40");
           System.out.println(" toast = price 100 /kg");
            System.out.println(" butter = price 120 /kg");
             System.out.println(" Khari = price 80 /kg");
             

              System.out.println("Please Select the item number");
              String choice = sc.nextLine().toLowerCase();

               System.out.println("please enter the quantity");
               int quantity = sc.nextInt();

               int total = 0;

               switch(choice){

                case "bread" :
                    total = bread * quantity;
                     System.out.println("You selected Bread");
                     break;

                     case "toast" :
                        total = toast * quantity;
                         System.out.println("You selected Toast");
                         break;

                         case "butter" :
                            total = butter * quantity;
                             System.out.println("You selected Butter");
                             break;

                             case "khari" :
                                total = khari * quantity;
                                 System.out.println("You selected Khari");
                                 break;

                                 default :
                                  System.out.println("you selected wrong please select given");
                                  

               }

               if(total > 0){
                 
                  System.out.println("Your Total Bill : "    + total);
                  System.out.println("---------------------------------------------------");
                   System.out.println();
                 System.out.println("Thanks for visite");
                }

               sc.close();


               }


    }
    

