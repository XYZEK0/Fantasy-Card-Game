package CardTypes;

public abstract class Spell extends Card
{
    public void action()
    {

    }
    public Spell(int manaCost, String name)
    {
        super(manaCost,name);
    }


    public void present()
    {
        System.out.println("Card: " + this.getName());
        System.out.println("Mana cost: " + this.getManaCost());

        System.out.println();
    }
}
