package weatherapp;




import jdk.nashorn.internal.parser.JSONParser;
import org.json.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class Weather extends JFrame {
   private static String wurl = "http://api.openweathermap.org/data/2.5/weather?q=Warszawa&mode=json&APPID=b98d901cc8d2e7d3c14c7e071e309871";








    public Weather() throws IOException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        setLayout(null);
        setTitle("Pogodynka");
        JButton BtnToCheck = new JButton("Check");
        BtnToCheck.setBounds(0,0,200,100);
        BtnToCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("CHECK DATA");
            }
        });

        add(BtnToCheck);
        JButton BtnToLoad = new JButton("Load");
        BtnToLoad.setBounds(200,0,200,100);
        BtnToLoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("LOAD DATA");
            }
        });
        add(BtnToLoad);
        JButton BtnToDelete = new JButton("Delete");
        BtnToDelete.setBounds(400,0,200,100);
        BtnToDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("DELETE DATA");
            }
        });
        add(BtnToDelete);
    }


    public static void main(String[] args) throws IOException {
        Weather okno = new Weather();
        okno.setVisible(true);


        //URL url = new URL("https://api.exchangeratesapi.io/latest");
       // URLConnection conect = url.openConnection();

//        JSONObject
        //JSONParser parser = new JSONParser()



    }
}
