package Cards;

public abstract class Card
{
    protected int manaCost;
    protected String name;

    public void action()
    {

    }

    public void present()
    {

    }

    //<editor-fold desc="Getters and Setters">
    public int getManaCost()
    {
        return manaCost;
    }

    public void setManaCost(int manaCost)
    {
        this.manaCost = manaCost;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    //</editor-fold>
}
