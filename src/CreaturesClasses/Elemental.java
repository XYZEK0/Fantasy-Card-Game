package CreaturesClasses;

import CardTypes.Creature;

public class Elemental extends Creature
{
    public Elemental()
    {
        super(6,"Elemental",6,5);

    }

    public void action()
    {
        System.out.println("elemental does smth");
    }

    public void present()
    {
        super.present();
    }
}
