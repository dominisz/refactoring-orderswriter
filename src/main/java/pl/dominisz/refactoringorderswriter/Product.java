package pl.dominisz.refactoringorderswriter;

import java.math.BigDecimal;
import java.util.Currency;

public class Product {
    private String code;
    private int color; //TODO zamienić na Color
    private int size; //TODO zamienić na Size
    private BigDecimal price;
    private Currency currency;

    public Product(String code, int color, int size, BigDecimal price, Currency currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public int getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }
}
