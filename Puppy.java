//Constructor
public class Puppy {
    //contructor 
    Puppy(String name){
System.out.println("Puppy's name is :"+ name);
    }

    void puppy(String color){
        System.out.println("The color of Kuta is" + color);
    }
    void puppy(int price, String secondColor){
        System.out.println("The Price of Kuta is:"+ price);
        System.out.println("The Second of Kuta is:"+ secondColor);
}
    public static void main(String[] args) {
       Puppy mypuppy = new Puppy("Kuta");
       mypuppy.puppy("White");
       mypuppy.puppy(10000, "Black");
    }
}
//String is not primitive data type
