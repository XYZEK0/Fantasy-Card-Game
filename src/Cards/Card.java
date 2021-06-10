package Cards;

public abstract class Card
{



    protected int manaCost;


    public void action()
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
    //</editor-fold>
}
