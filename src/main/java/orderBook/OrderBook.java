package orderBook;

import java.util.Map;

public class OrderBook {
    private Book<Side> buyBook;
    private Book<Side> sellBook;
    private PriceLevel bestBid;
    private PriceLevel bestOffer;
    private Map<OrderId, Order> orderMap;
}



