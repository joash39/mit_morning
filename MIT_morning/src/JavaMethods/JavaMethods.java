package JavaMethods;

public class JavaMethods {
//        Methods of java
//        Methods are blocks of code that does something specific
//        These methods  can only work/run when they are called
//        why methods: To re-use code
//        syntax;
//        A method must be declared inside a class
//        it's defined by name of method followed by ()
//        e.g of an inbuilt method is System.out.println();
    
        static void printName(String name){
            System.out.println("Java is awesome!!!");
            System.out.println("I am called" + name);
        }
        static void addition(int num1, int num2){//this method takes one parameter(num1)
            int sum = num1 + num2;
            System.out.println(sum);
        }

        static void subtraction(int a, int b){
            int diff = a - b;
            System.out.println(diff);
        }
//Assignment: create a method that gets the difference between two numbers
//    printName: name of method
//    static: The method belongs to the JavaMethods Class
//

//    Returning a value
//    Use void in a method when it's not going to return a value
//    if you want your method o return a value use
//    primitive data types such as int, char
//    INSTEAD of void and use "return" keyword inside the method

    static int multiply(int num1, int num2){
            int results = num1 * num2;
            if (results > 100){
                return results;
            }else {
                return results + 100;
            }
    }


    public static void main(String[] args) {
        printName("Joash Kibet");
        addition(100,200);
        subtraction(200,100);
        int ans = multiply(1000,1000);
        System.out.println(ans);
        System.out.println(multiply(52,25));
    }





    }
