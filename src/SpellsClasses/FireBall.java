package SpellsClasses;

import CardTypes.Spell;

public class FireBall extends Spell
{
    public FireBall()
    {
        super(6,"Fireball");

    }

    public void action()
    {
        System.out.println("FireBall thrown");
    }

    public void present()
    {
        super.present();
    }
}
