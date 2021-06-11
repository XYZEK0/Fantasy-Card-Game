package GameManager;

public class HumanPlayer extends Player
{
    public HumanPlayer(int manaAmount, int HP, int drawAmount, int manaGain)
    {
      //  System.out.println("HumanPlayer Constructor!");
        super(manaAmount,HP,drawAmount,manaGain);
        this.name = "Player";


    }

    public void action()
    {

    }
}
