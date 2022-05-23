package Task1;

public class Parent extends Grandparent {
    public static String surname = "Koval";

    static {
        System.out.println("Parent static block");
    }

    {
        System.out.println("Parent non-static block");

    }

    public int age=42;
    public String name = "Evgen";

    public Parent ()
    {
        System.out.println("Parent :  public static String = " + car);
        System.out.println("Parent :  public static String = " + surname);
        System.out.println("Parent :  public String = " + name);
        System.out.println("Parent :  public int = " + age);


    }
}
