package CreaturesClasses;

import CardTypes.Creature;

public class Orc extends Creature
{
    public Orc()
    {
       super(6,"Orc",7,6);
    }

    public void action()
    {
        System.out.println("Topory!!!");
    }

    public void present()
    {
        super.present();
    }
}
