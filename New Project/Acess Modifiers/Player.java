

public class Player {
    private String name;
    protected int shirtNumber;
    String position;
    public String nationality;


    public Player(String name, int shirtNumber, String position, String nationality) {
        this.name = name;
        this.shirtNumber = shirtNumber;
        this.position = position;
        this.nationality = nationality;
    }

    
    public String getName() {
        return name;
    }

    
    private void showinfo() {
        System.out.println( name);
    }

    
    public void showP_Info() {
        showinfo();
    }

    
    public void show() {
        System.out.println("Player: " + name + ", Shirt No: " + shirtNumber +
        ", Position: " + position + ", Nationality: " + nationality);
    }
}
