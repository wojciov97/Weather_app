package weatherapp;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Weather extends JFrame {
    class MyHandler extends DefaultHandler {
        DataEntry entry;

        public MyHandler(DataEntry newentry) {
            this.entry = newentry;
        }


        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if(qName.equals("city"))
            entry.setCity(attributes.getValue("name"));
        System.out.println(entry.getCity());
        if(qName.equals("temperature"))
            entry.setTemperature(Float.parseFloat(attributes.getValue("value")));
        if(qName.equals("pressure"))
            entry.setPressure(Float.parseFloat(attributes.getValue("value")));
        }
    }
    private String weatherURL = "http://api.openweathermap.org/data/2.5/weather?q=Warszawa%C5%82aw&mode=xml&APPID=b98d901cc8d2e7d3c14c7e071e309871";

    private DataEntry entries = new DataEntry();


    public Weather(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        setLayout(null);
        setTitle("Pogodynka");

        JButton BtnToCheck = new JButton("Check");
        BtnToCheck.setBounds(0,0,200,100);
        BtnToCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DataEntry entry = getDatafromUrl();

            }
        });

        add(BtnToCheck);
        JButton BtnToLoad = new JButton("Load");
        BtnToLoad.setBounds(200,0,200,100);
        add(BtnToLoad);
        JButton BtnToDelete = new JButton("Delete");
        BtnToDelete.setBounds(400,0,200,100);
        add(BtnToDelete);
    }


    public static void main(String[] args) {
        Weather okno = new Weather();
        okno.setVisible(true);
    }

    private DataEntry getDatafromUrl(){
        DataEntry newentry = new DataEntry();
        SAXParser parser = null;
        try {
            parser = SAXParserFactory.newInstance().newSAXParser();
            parser.parse(weatherURL, new MyHandler(newentry));
            }
        catch (Exception e) {
            newentry.setCity("Error");
        }
    return newentry;
    }


}
