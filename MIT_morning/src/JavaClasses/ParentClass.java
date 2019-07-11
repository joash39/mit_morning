package JavaClasses;
//An attribute is a variable inside a class


public class ParentClass {
    String sirname = "kimathi";
    String color = "black";
    int hands = 2;
    int legs = 2;
    float height = 5.7f;
    int age = 18;

//    static method

    static void fighter(){
        System.out.println("10 blows");
    }

//    public method

    public void fighter2(){
        System.out.println("10 BLOWS");
    }
    public void PrintAge(int age){
        System.out.println("I am " + age + " years old");
    }


    //    Accessing attributes

public static void main(String[] args) {
    //    Accessing attributes

    ParentClass Kimathijr = new ParentClass();
    ParentClass Mary = new ParentClass();

    System.out.println(Kimathijr.sirname);

//    modifying attributes
//    To access an attribute or method in an object use a dot(.) Dot notation

    Kimathijr.sirname = "Njoroge";
    Mary.color = "Brown";
    System.out.println(Kimathijr.sirname);
    System.out.println(Mary.color);
    Mary.fighter2();
    Kimathijr.PrintAge(12);








}
}

