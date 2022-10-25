
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        // first compare total areas
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        if ((this.pricePerSquare * this.squares) > (compared.pricePerSquare * compared.squares)) {
            return (this.pricePerSquare * this.squares) - (compared.pricePerSquare * compared.squares);
        }
        return (compared.pricePerSquare * compared.squares) - (this.pricePerSquare * this.squares);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.pricePerSquare * this.squares > compared.pricePerSquare * compared.squares) {
            return true;
        }
        return false;
    }

}
