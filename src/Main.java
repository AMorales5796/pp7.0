public class Main
{
    public static void main (String args)
    {
        final int NUM_FLIPS = 100;
        int heads = 0, tails = 0;

        MonetaryCoin penny = new MonetaryCoin(1);
        MonetaryCoin nickel = new MonetaryCoin(2);
        MonetaryCoin dime = new MonetaryCoin(10);
        MonetaryCoin quarter = new MonetaryCoin(25);

        for(int count = 1; count <= NUM_FLIPS)
        {
            penny.flip();
        }
        System.out.println();

    }//end of method
}//end of class main
