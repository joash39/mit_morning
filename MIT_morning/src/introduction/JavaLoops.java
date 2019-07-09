package introduction;

public class JavaLoops {
    public static void main(String[] args) {
//        Syntax:
//        while (condition){
//            code to execute
//        }

        int x = 0;
        while (x < 10){
            System.out.println(x);
            x++;

            if (x == 5){
                System.out.println(x);
                System.out.println("Hello world!!!");
                break;

            }

            int s = 0;
            while (s < 10){
                if (s == 5) {
                    s++;
                    continue;
                }

                    System.out.println("Hello world!!!");


                }
        }

//        syntax:
//        for (statement 1, statement 2, statement 3){
//            code to execute
//        statement 1 is executed once before the execution of the code block
//        statement 2 defines the condition  for executing the code block
//        statement 3 is executed everytime the condition (statement 2)is true
//        }

        for (int i = 0; i < 10 ; i++){
            System.out.println(i);

        }


//        syntax: foreach loop
//        used to loop through an array
//        String [] arrayname
//        for (type variable: arrayname){
//            code to execute
//        }

        String [] cars = {"BMW", "NYAYO"};
        for (String c : cars){
            System.out.println(c);
        }









    }
}
