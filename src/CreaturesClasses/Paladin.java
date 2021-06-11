package CreaturesClasses;

import CardTypes.Creature;

public class Paladin extends Creature
{
    public Paladin()
    {
        super(7,"Paladin",6,7);

    }
    public void action()
    {
        System.out.println("Paladin does smth");
    }

    public void present()
    {
        super.present();
    }
}
