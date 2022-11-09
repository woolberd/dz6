public class Weapon  {
    private String Type;
    private String Name;

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public Weapon(String type, String name) {
        this.Type = type;
        this.Name = name;
    }
}
