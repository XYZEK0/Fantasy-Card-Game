package Cards;

public abstract class Creature extends Card
{


    protected int strength;
    protected int health;


    public void action()
    {

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
