package Main;
import Interfaces.ISell;
import java.util.ArrayList;

public class Shop{

    private final ArrayList<ISell> stock = new ArrayList<>();
    //no constructor is needed. Starting with an empty stock array.
    public void addStock(ISell sellable){stock.add(sellable);}

    public void removeStock(ISell sellable) {
        stock.remove(sellable);
    }

    public double getProfit() {
        double profit = 0;
        for (ISell sellable : stock) {
            double subProfit = sellable.calculateMarkup();
            profit += subProfit;
     }
        return profit;

    }
    public int getStockSize() {return stock.size();}


}
