

public class JavaStrings {
    public static void main(String[] args) {
//        Strings are used to store text, enclosed in double quotes
//        Before you create a string variable define the type of data it will store.
//        syntax type nameofvariable = value''
//        A string in Java is actually an object, which contain methods
//        that can perform certain operations on strings.
//        For example, the length of a string can be found with the length() method:
        String firstname = "Developer";
        System.out.println(firstname);

//      variablname.method()
        System.out.println(firstname.length());
//        Assignment :
//        Find out how to convert a string to lower and uppercase in java
//        Findout how to concatenate in java

//        Special characters: Escaping characters using a back slash
        System.out.println("The trainer said: \"where is your assignment!\"");
        System.out.println("I am a FrontEnd Developer\nJava Developer\nphp Developer");
        System.out.println("I am a FrontEnd Developer\tJava Developer\tphp Developer");
        System.out.println("I am a FrontEnd Developer\n \tJava Developer\n \tphp Developer");

    }
}
