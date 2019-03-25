import javax.swing.JFrame;
import javax.swing.JButton;

public class Weather extends JFrame {

//    public String weatherURL = "http://api.openweathermap.org/data/2.5/weather?q=Wroc%C5%82aw&mode=xml&APPID=b98d901cc8d2e7d3c14c7e071e309871";

    public Weather(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        setLayout(null);
        setTitle("Pogodynka");

        JButton BtnToCheck = new JButton("Check");
        BtnToCheck.setBounds(0,0,200,100);


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

}
