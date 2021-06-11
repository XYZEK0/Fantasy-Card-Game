package CreaturesClasses;

import CardTypes.Creature;

public class Vampire extends Creature
{
    public Vampire()
    {
        super(5,"Vampire",5,4);
    }

    public void action()
    {
        System.out.println("*Sucks your blood*");
    }

    public void present()
    {
        super.present();
    }
}
