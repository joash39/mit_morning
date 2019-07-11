package introduction;

public class Assignment {
    public static void main(String[] args) {
        int a = 100;

        for (int b = 1;b <= a;b++ ){
            if (b%3 == 0 && b%5 == 0){
                System.out.println("Fizz buzz");
            }else if (b%3 == 0){
                System.out.println("Fizz");
            }else if (b%5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(b);
            }
        }



    }

}
