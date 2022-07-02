package structural.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import structural.adapter.adptee.stock.StockService;
import structural.adapter.adptee.stock.XmlStockService;
import structural.adapter.adpter.JsonStockServiceAdapter;

public class AdapterTest {

    @Test
    public void shouldReturnJSON() {
        StockService xmlStockService = new XmlStockService();
        StockService jsonStockService = new JsonStockServiceAdapter(xmlStockService);
        DataAnalyzer dataAnalyzer = new DataAnalyzer();
        String json = dataAnalyzer.analyzeData(jsonStockService.getStockData());
        String expectedJson ="{\"stockData\":{\"price\":143.2,\"readDate\":\"\",\"name\":\"SampleCompany\"}}";
        Assertions.assertEquals(expectedJson, json);
    }


}
