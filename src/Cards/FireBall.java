package Cards;

public class FireBall extends Spell
{
    public FireBall()
    {
        this.setManaCost(6);
    }

    public void action()
    {
        System.out.println("FireBall thrown");
    }
}
