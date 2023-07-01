package Interfaces;

public interface ISell {

    String isSold();  //could be a Boolean, maybe.

    double calculateMarkup();//each class that implements this interface must calculate the profit margin of the item.

}
