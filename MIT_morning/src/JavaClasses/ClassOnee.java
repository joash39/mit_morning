package JavaClasses;

public class ClassOnee {
    static void methodOne(){
        System.out.println("hello world!!");
    }
    public void methodTwo(){
        System.out.println("HELLO WORLD!!");
    }

    static String methodThree(){
        return "I am Static Method that returns a string";
    }

    public String methodFour(){// only accessible in an object
        return "I am a public method that returns a string";
    }


    public static void main(String[] args) {
        methodOne();//static

        System.out.println(methodThree());//option one
        String res = methodThree();//option two

        ClassOnee objectOne = new ClassOnee();
        objectOne.methodTwo();//public
        objectOne.methodFour();//public
    }
}
