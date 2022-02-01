import java.util.Objects;

public class Card{

    private final String SUIT;
    private final String RANG;


    public Card(String TYPE, String RANG) {
        this.SUIT = TYPE;
        this.RANG = RANG;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return SUIT.equals(card.SUIT) && RANG.equals(card.RANG);
    }

    @Override
    public int hashCode() {
        return Objects.hash(SUIT, RANG);
    }

    @Override
    public String toString() {
        return String.format("%s of %ss", RANG, SUIT);
    }
}
