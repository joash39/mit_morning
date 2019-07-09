package introduction;

public class JavaException {
    public static void main(String[] args) {
//        try- define a block of code that you want to test
//        catch- define a block of code to execute if there is an error in the try block
//        DRY
       try {
           int [] numbers = {4,3,2,1};
           System.out.println(numbers[4]);
       }catch (Exception e){
           System.out.println("Something went wrong: "+ e);
       }finally {
           System.out.println("I will run if theres an error or not");
       }























    }
}
