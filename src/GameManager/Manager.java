package GameManager;

import CardTypes.*;
import CreaturesClasses.*;
import GUI.GUI;
import SpellsClasses.BoardFreeze;
import SpellsClasses.FireBall;
import java.util.Random;
import java.util.Vector;


public class Manager
{
    private static final int startCardsAmount = 3;
    private ComputerPlayer compPlayer;
    private HumanPlayer humanPlayer;
    private Vector<Card> allCardsInGame;

    public Manager()
    {
        new GUI();
        newGame();
       // turn();
    }


    public void newGame()
    {
        compPlayer = new ComputerPlayer(10,30,1,4);
        humanPlayer = new HumanPlayer(10,30,1,4);

        initializeAllCardsInGame();

        this.allCardsInGame = shuffleDeck(this.allCardsInGame);
        initializePlayerDecks();

        initializePlayerHands(compPlayer);
        initializePlayerHands(humanPlayer);

        displayInfo();

    }

    public void initializePlayerDecks()
    {

        for(int i=0; i<this.allCardsInGame.size(); i+=2)
        {
            compPlayer.getDrawPile().add(this.allCardsInGame.get(i));

            if(i+1 < this.allCardsInGame.size())
            humanPlayer.getDrawPile().add(this.allCardsInGame.get(i+1));

        }

    }

    public void displayInfo()
    {
        System.out.println("Computer deck: ");
        for(Card card: compPlayer.getDrawPile())
        {

            card.present();
        }
        System.out.println("Computer hand: ");
        for(Card card: compPlayer.getHand())
        {
            card.present();
        }

        System.out.println();

        System.out.println("Human deck: ");
        for(Card card: humanPlayer.getDrawPile())
        {
            card.present();
        }
        System.out.println("Human hand: ");
        for(Card card: humanPlayer.getHand())
        {
            card.present();
        }
    }

    public void initializePlayerHands(Player player)
    {
        for(int i=0; i<startCardsAmount; i++)
        {
            player.getHand().add(player.getDrawPile().peek());
            player.getDrawPile().poll();
        }
    }

    public void drawCards(Player player)
    {
        for(int i=0; i<player.getDrawAmount(); i++)
        {
            player.getHand().add(player.getDrawPile().peek());
            player.getDrawPile().poll();
        }

    }

    public void initializeAllCardsInGame()
    {
        allCardsInGame = new Vector<>();

        allCardsInGame.add(new Troll());


        for (int i = 0; i < 2; i++)
        {
            allCardsInGame.add(new BoardFreeze());
            allCardsInGame.add(new Elemental());
            allCardsInGame.add(new FireBall());
            allCardsInGame.add(new Vampire());

        }
        for (int i = 0; i < 3; i++)
        {
            allCardsInGame.add(new Orc());
            allCardsInGame.add(new Paladin());
        }
    }

    public void turn()
    {

    }

    public Vector<Card> shuffleDeck(Vector<Card> deck)
    {
        Vector<Card> shuffledDeck = new Vector<>();

        Random rand = new Random();

        while(!deck.isEmpty())
        {
            int number = rand.nextInt(deck.size());
            shuffledDeck.add(deck.get(number));
            deck.remove(number);
        }
        return shuffledDeck;
    }

    //<editor-fold desc="Getters and Setters>


    public ComputerPlayer getCompPlayer()
    {
        return compPlayer;
    }

    public void setCompPlayer(ComputerPlayer compPlayer)
    {
        this.compPlayer = compPlayer;
    }

    public HumanPlayer getHumanPlayer()
    {
        return humanPlayer;
    }

    public void setHumanPlayer(HumanPlayer humanPlayer)
    {
        this.humanPlayer = humanPlayer;
    }

    public Vector<Card> getAllCardsInGame()
    {
        return allCardsInGame;
    }

    public void setAllCardsInGame(Vector<Card> allCardsInGame)
    {
        this.allCardsInGame = allCardsInGame;
    }

    //</editor-fold>
}
