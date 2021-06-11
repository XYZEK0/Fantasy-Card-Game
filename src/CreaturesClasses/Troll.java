package CreaturesClasses;

import CardTypes.Creature;

public class Troll extends Creature
{
    public Troll()
    {
        super(9,"Troll",8,9);

    }

    public void action()
    {
        System.out.println("le Problem?");
    }

    public void present()
    {
        super.present();
    }
}
