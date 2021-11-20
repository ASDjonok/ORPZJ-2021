package lab6;

public abstract class RailwayCarriage {
    private int luggageQuantity;

    public RailwayCarriage(int luggageQuantity) {
        this.luggageQuantity = luggageQuantity;
    }

    public int getLuggageQuantity() {
        return luggageQuantity;
    }
}
