package Task1;

public class Grandparent {
    public static String car = "Lada sedan";

    static {
        System.out.println("Grandparent static block");
    }

    {
        System.out.println("Grandparent non-static block");

    }

    public int age=82;
    public String name = "Evgen";

    public Grandparent ()
    {
        System.out.println("Grandparent :  public static String = " + car);
        System.out.println("Grandparent :  public String = " + name);
        System.out.println("Grandparent :  public int = " + age);


    }

}
