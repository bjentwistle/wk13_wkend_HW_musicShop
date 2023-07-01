package Interfaces;

public interface ISell {
//Alternatively, could be implemented as methods in a base class that sits above Instrument and Peripheral
//but the brief specifically asks for ISell to be used.
    String isSold();  //could be a Boolean, maybe.

    double calculateMarkup();//each class that implements this interface must calculate the profit margin of the item.

}
