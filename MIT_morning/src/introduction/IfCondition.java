package introduction;

public class IfCondition {
    public static void main(String[] args) {
        int a = 10, b = 5;
//        syntax:if(condition){
//        code to execute
//        }
        if (a > b) {
            System.out.println("a is greater than b");
        }

//        syntax: if (condition){
//            code to execute
//        }else {
//            code to execute if the 1st condition is false
//        }

        if (a < b) {
//        runs if the condition is true
            System.out.println("a is greater than b");
        } else {
            // runs if the condition is false
            System.out.println("a is greater than b");
        }

//        syntax: if (condition){
//            code to execute
//        }else if {
//            code to execute if the 1st condition is false and you want to check a second or more conditions
//        }else{
//            code to execute if the 1st condition is false
//        }

        if (a < b) {
//        runs if the condition is true
            System.out.println("a is less than b");
        } else if (b < a) {
            // runs if the condition is false
            System.out.println("b is less than a");
        } else {
            System.out.println("Run if the above conditions are all false");
        }
    }
}


