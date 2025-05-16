/*
Rules
1- We need to have an private constructor
2- We need to have a static private attribute
3- We need to have a public static method with return the instance
 */

public class DatabaseConector{

    private static DatabaseConector databaseConector;

    private DatabaseConector(){
        System.out.println("Creación del objeto");
    }

    public static DatabaseConector getInstance(){
        if(databaseConector == null){
            databaseConector = new DatabaseConector();
        }
        return databaseConector;
    }
}

/*
Al tener un constructor privado, solo podemos llamar la palabra new dentro de la clase
Importante de recordar, cuando tenemos un atributo privado solo esta disponible dentro de la clase
 */