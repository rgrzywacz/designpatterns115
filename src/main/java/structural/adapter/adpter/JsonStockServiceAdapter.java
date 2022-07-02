package structural.adapter.adpter;

import org.json.XML;
import structural.adapter.adptee.stock.StockService;

public class JsonStockServiceAdapter implements StockService {

    private StockService xmlStockService;

    public JsonStockServiceAdapter(StockService xmlStockService) {
        this.xmlStockService = xmlStockService;
    }

    @Override
    public String getStockData() {
        String stockData = xmlStockService.getStockData();
        /*
        <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
        <stockData>
           <name>SampleCompany</name>
           <price>143.2</price>
           <readDate/>
        </stockData>
         */
        return XML.toJSONObject(stockData).toString();
    }
}
