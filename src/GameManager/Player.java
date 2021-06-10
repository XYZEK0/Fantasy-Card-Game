package GameManager;

import Cards.Card;

import java.util.Vector;

public abstract class Player
{
    protected Vector<Card> discardPile;
    protected Vector<Card> drawPile;
    protected Vector<Card> hand;
    protected int manaAmount;
    protected int HP;

    public Player()
    {
        System.out.println("Default player Constructor");
    }

    public void action()
    {
        ;
    }

    //<editor-fold desc="Getters and Setters">

    public int getHP()
    {
        return HP;
    }

    public void setHP(int playerHP)
    {
        this.HP = playerHP;
    }

    public Vector<Card> getDiscardPile()
    {
        return discardPile;
    }

    public void setDiscardPile(Vector<Card> discardPile)
    {
        this.discardPile = discardPile;
    }

    public Vector<Card> getDrawPile()
    {
        return drawPile;
    }

    public void setDrawPile(Vector<Card> drawPile)
    {
        this.drawPile = drawPile;
    }

    public Vector<Card> getHand()
    {
        return hand;
    }

    public void setHand(Vector<Card> hand)
    {
        this.hand = hand;
    }

    public int getManaAmount()
    {
        return manaAmount;
    }

    public void setManaAmount(int manaAmount)
    {
        this.manaAmount = manaAmount;
    }
    //</editor-fold>
}
