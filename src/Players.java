
import javax.swing.JOptionPane;

public class Players {

    public int player1=1;
    public int player2=1;
    public String p1;
    public String p2;
    

       public void leerjugador() {
        
    	p1 = JOptionPane.showInputDialog("Digite el nombre del primer jugador");
    	p2 = JOptionPane.showInputDialog("Digite el nombre del segundo jugador");  
    }
}
