class heros{
    String name;
    int health;
    int power;

    public void printInfo(){
        System.out.println("Name of character: " + this.name);
        System.out.println("Helath of character: " + this.health);
        System.out.println("Power of character: " + this.power);
        


    }
}
public class gamechar {
    public static void main(String args[]){
        heros h1 = new heros();
        h1.name = "Knight authur";
        h1.health= 90;
        h1.power = 45;
        h1.printInfo();

        heros h2 = new heros();
        h2.name = "Mage Zelda";
        h2.health= 80;
        h2.power = 70;
        h2.printInfo();


        



    }
    
}
