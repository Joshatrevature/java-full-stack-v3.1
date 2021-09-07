interface Hello{
    public String greeting();
}

interface Welcome{
    public String greeting(String name);
}

interface Calculation{
    public int addNumber(int a, int b);
}

interface Say{
    public void sayHello(String name);
}

interface MultipleStatement{
    String print(String message);
}

public class Demo9 {
    public static void main(String[] args) {

        // without parameter
        Hello hello = () -> {
            return "Welcome Guest";
        };

        // with single parameter
        System.out.println(hello.greeting());

        Welcome welcome = (name) -> {
            return "Welcome "+ name;
        };

        System.out.println(welcome.greeting("Paul"));

        // with multiple parameters
        Calculation calculation = (a, b) -> {
            return a + b;
        };

        System.out.println(calculation.addNumber(20, 30));

        // without return
        Say say = (name) -> {
            System.out.println("Hello "+ name);
        };

        say.sayHello("Watson");

        MultipleStatement multipleStatement = (message) -> {
            String str1 = "Statement 1, ";
            String str2 = "Statement 2, ";
            String str3 = "Statement 3";
            return str1 + str2 + str3;
        };
        System.out.println(multipleStatement.print("hello"));
    }
}

