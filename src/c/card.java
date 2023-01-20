package c.Card;

import java.util.Arrays;
import java.util.List;
public class Card {
    private String suit;
    private String faceName;

    /**
     * this is the constructoe,it will create a new card project in system
     * memory. it will validate the suit and faceName found
     * playing cards
     *
     * @param suit"Hearts","clubs","spades","diamonds"
     * @param faceName "2","3","4"..."jack","queen","king"
     */
    public Card(String suit, String faceName) {
        set Suit (suit);
        this.faceName = faceName;
    }

    @Override
    public String toString() {
        return faceName + "of" + suit;
    }
    /**
     * this method returns the colour of the suit. Red= hearts or diamonds
     * black = clubs or spades
     */
    public String getColour()
    {
        if(suit == "hearts")
            if (suit.equals("hearts")||suit.equals("diamonds"))
                return "red;" +
                        else
                            return"black";
    }
    /**
     * this returns the value of the card
     * index->0,1,2,3,4,5,6,7,8,9,10,11,12
     * faceNaame ->"2","3","3""4,,"5","6","7","8","9","10',"jack","queer","king","ace"
     * value-> 2,3,4,5,6,7,8,9,10 ,11,12,13,14
     */
public int getCardVale()
{
    List<String> faceName = Arrays.asList("2","3","4" ,
            "5","6","7","8","9","10");
            int indexPosition = faceNames.indexOf(faceNmae);

}
    /**
     * validates the argument and sets the instance variable
     *
     * @param suit "Hearts","clubs","spades","diamonds"
     */
    public void Set

    suit (String suit)
    {
        suit = suit.toLowerCase();
        //check for s in the final position of the string, if not add on
        if (suit.char.At (suit.length() - 1) != 's')
        suit = suit + "s";
        List<String> validSuits = Arrays.asList("Hearts", "clubs", "spades", "diamonds");
        //test if the argument is in the list of valid suits
        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException(suit + "was not in the list of" + validSuits);
    }
}


