package Cards;

public class BoardFreeze extends Spell
{
    public BoardFreeze()
    {
        this.setName("Board freeze");
        this.setManaCost(4);
    }

    public void action()
    {
        System.out.println("Board is frozen");
    }

    public void present()
    {
        System.out.println("Card: " + this.getName());
        System.out.println("Mana cost: " + this.getManaCost());
    }
}
