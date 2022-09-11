package orderBook;

import java.util.Map;

public class Book<Side> {
    private Side side;
    private Map<Price, PriceLevel> limitMap;
}

