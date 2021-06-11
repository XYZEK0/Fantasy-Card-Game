package GameManager;

import CardTypes.Card;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Vector;

public abstract class Player
{
    protected Vector<Card> discardPile;
    protected Queue<Card> drawPile;
    protected Vector<Card> hand;

    protected boolean isAlive;

    protected String name;

    protected int maxHealthAmount;
    protected int maxManaAmount;
    protected int manaAmount;
    protected int HP;
    protected int drawAmount;
    protected int manaGain;
    protected int armor;

    public Player(int manaAmount, int HP, int drawAmount, int manaGain)
    {
        this.discardPile = new Vector<>();
        this.drawPile = new ArrayDeque<>();
        this.hand = new Vector<>();

        this.manaAmount = manaAmount;
        this.maxHealthAmount = 30;
        this.maxManaAmount = 10;
        this.HP = HP;
        this.drawAmount = drawAmount;
        this.manaGain = manaGain;
        this.armor = 0;

        //System.out.println("Default player Constructor");
    }

    public void printPlayerStatus()
    {
        System.out.println(this.name + " status: ");
        System.out.println("Health: " + this.HP + "/" + this.maxHealthAmount);
        System.out.println("Mana: " + this.manaAmount + "/" + this.maxManaAmount);
        System.out.println("Armor: " + this.armor);

    }

    public void action()
    {
        ;
    }

    //<editor-fold desc="Getters and Setters">

    public int getMaxHealthAmount()
    {
        return maxHealthAmount;
    }

    public void setMaxHealthAmount(int maxHealthAmount)
    {
        this.maxHealthAmount = maxHealthAmount;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean isAlive()
    {
        return isAlive;
    }

    public void setAlive(boolean alive)
    {
        isAlive = alive;
    }

    public int getMaxManaAmount()
    {
        return maxManaAmount;
    }

    public void setMaxManaAmount(int maxManaAmount)
    {
        this.maxManaAmount = maxManaAmount;
    }

    public int getDrawAmount()
    {
        return drawAmount;
    }

    public void setDrawAmount(int drawAmount)
    {
        this.drawAmount = drawAmount;
    }

    public int getManaGain()
    {
        return manaGain;
    }

    public void setManaGain(int manaGain)
    {
        this.manaGain = manaGain;
    }

    public int getArmor()
    {
        return armor;
    }

    public void setArmor(int armor)
    {
        this.armor = armor;
    }

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

    public Queue<Card> getDrawPile()
    {
        return drawPile;
    }

    public void setDrawPile(Queue<Card> drawPile)
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
