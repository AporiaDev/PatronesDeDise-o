//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
The Singleton design pattern is a type of creational pattern that
ensures a class has only one instance and provides global access to that instance
 */

public class Main {
    public static void main(String[] args) {
        DatabaseConector databaseConector = DatabaseConector.getInstance();
        System.out.println(databaseConector);

    }
}