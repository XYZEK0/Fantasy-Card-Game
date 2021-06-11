package SpellsClasses;

import CardTypes.Spell;

public class BoardFreeze extends Spell
{
    public BoardFreeze()
    {
        super(4, "Board Freeze");
    }

    public void action()
    {
        System.out.println("Board is frozen");
    }

    public void present()
    {
        super.present();
    }
}
