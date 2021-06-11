package GameManager;

public class ComputerPlayer extends Player
{

    public ComputerPlayer(int manaAmount, int HP, int drawAmount, int manaGain)
    {
       // System.out.println("CompPlayer Constructor!");
        super(manaAmount,HP,drawAmount,manaGain);
        this.name = "Computer";
    }

    public void action()
    {

    }
}
