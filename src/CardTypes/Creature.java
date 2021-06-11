package CardTypes;

public abstract class Creature extends Card
{

    protected Card target;
    protected int strength;
    protected int health;

    public Creature(int manaCost, String name,int strength, int health)
    {
        super(manaCost,name);
        this.strength = strength;
        this.health = health;
    }

    public void action()
    {

    }
    public void present()
    {
        System.out.println("Card: " + this.getName());
        System.out.println("HP: " + this.getHealth());
        System.out.println("Strength: " + this.getStrength());
        System.out.println("Mana cost: " + this.getManaCost());

        System.out.println();
    }

    //<editor-fold desc="Getters and Setters">
    public int getStrength()
    {
        return strength;
    }

    public void setStrength(int strength)
    {
        this.strength = strength;
    }

    public int getHealth()
    {
        return health;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }
    //</editor-fold>
}
