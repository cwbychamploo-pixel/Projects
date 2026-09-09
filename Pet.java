public class Pet
{
    private String name;

    public Pet()
    {
        setName("Max");
    }

    public void setName(String petName)
    {
        name = petName;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return "Pet information:\nName: " + name;
    }

    public static void main(String[] args)
    {
        Pet pet1 = new Pet();
        System.out.println(pet1.toString());

        Pet pet2 = new Pet();
        pet2.setName("Luna");
        System.out.println(pet2.toString());
    }
}