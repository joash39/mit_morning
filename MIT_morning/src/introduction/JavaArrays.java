package introduction;

public class JavaArrays {
    public static void main(String[] args) {
//        state the type, square brackets and the variable:
        String[] cars ;// empty array
        String [] languages = {"HTML", "Php", "java"};
        int[] numbers;
        int[] myNumbers = {1, 2, 3, 4, 5};
//        Accessing items
//        language[0]
        System.out.println(languages[0]);
//        change an item in an array
          languages[2] = "ruby";
        System.out.println(languages[2]);

        System.out.println(languages.length);


        for (String language : languages){
            System.out.println(language);
        }

        for (int a = 0; a < languages.length;a++){
            System.out.println(languages[a]);
        }

























    }
}
