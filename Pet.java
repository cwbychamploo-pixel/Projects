public class Pet
{
    private String name;
    private String type;
    private int age;

    public Pet()
    {
        setName("Pet Name");
        setType("Animal");
        setAge(1);
    }

    public Pet(String petType, String petName, int petAge)
    {
        setType(petType);
        setName(petName);
        setAge(petAge);
    }

    public void setName(String petName)
    {
        name = petName;
    }

    public String getName()
    {
        return name;
    }

    public void setType(String petType)
    {
        type = petType;
    }

    public String getType()
    {
        return type;
    }

    public void setAge(int petAge)
    {
        age = petAge;
    }

    public int getAge()
    {
        return age;
    }

    public String speak()
    {
        if (type.equalsIgnoreCase("dog"))
        {
            return "Woof";
        }
        else if (type.equalsIgnoreCase("cat"))
        {
            return "Meow";
        }
        else
        {
            return "Yowl";
        }
    }

    public String toString()
    {
        String info = "Pet information:\n";
        info += "Type: " + type + "\n";
        info += "Name: " + name + "\n";
        info += "Sound: " + speak() + "\n";
        info += "Age: " + age;

        return info;
    }
}