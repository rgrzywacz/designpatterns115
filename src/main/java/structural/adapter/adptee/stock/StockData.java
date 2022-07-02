package structural.adapter.adptee.stock;

import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;

@XmlRootElement
public class StockData {
    private String name;
    private double price;
    private LocalDate readDate;

    public StockData() {
    }

    public StockData(String name, double price, LocalDate readDate) {
        this.name = name;
        this.price = price;
        this.readDate = readDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getReadDate() {
        return readDate;
    }

    public void setReadDate(LocalDate readDate) {
        this.readDate = readDate;
    }
}
