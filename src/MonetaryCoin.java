public class MonetaryCoin extends Coin
{
    private int value;
    public String output;

    public MonetaryCoin(int value)
    {
        this.value = value;
    }


    public String toString()
    {
        output = "";
        output += value;
        return output;
    }
}
