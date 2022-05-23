package Task1;

public class Child extends Parent{
    public static String patronymic = "Evgenievich";

    public String name = "Dima";
    public int age=18;

    static {
        System.out.println("Child static block");
    }

    {
        System.out.println("Child non-static block");

    }

    public Child() {
        System.out.println("Child :  public static String = " + car);
        System.out.println("Child :  public static String = " + surname);
        System.out.println("Child :  public static String = " + patronymic);
        System.out.println("Child :  public String = " + name);
        System.out.println("Child :  public int = " + age);
    }
}
