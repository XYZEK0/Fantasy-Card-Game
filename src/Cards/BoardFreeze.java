package Cards;

public class BoardFreeze extends Spell
{
    public BoardFreeze()
    {
        this.setManaCost(4);
    }

    public void action()
    {
        System.out.println("Board is frozen");
    }
}
