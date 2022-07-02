package structural.adapter.adptee.stock;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.time.LocalDate;

public class XmlStockService implements StockService {
    @Override
    public String getStockData() {
        StringWriter stringWriter = null;

        StockData stockData = new StockData("SampleCompany", 143.20, LocalDate.of(2022,7,2));
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(StockData.class);
            Marshaller jaxMaxMarshaller = jaxbContext.createMarshaller();
            //jaxMaxMarshaller.setProperty();
            stringWriter = new StringWriter();
            jaxMaxMarshaller.marshal(stockData, stringWriter);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return stringWriter.toString();
    }
}
