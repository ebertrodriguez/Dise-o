import javax.swing.JOptionPane;


public class Juego {


    public static void main(String[] args) {

        Players player = new Players();
        player.leerjugador();

        
        tablero tab = new tablero();
        tab.leertablero();
        int tablero = tab.tablero;

        int finjuego = 0;
        int player1 = player.player1;
        int player2 = player.player2;
        String p1 = player.p1;
        String p2 = player.p2;
        int inicio = tab.inicio;
        int turno=0;
        
        while (finjuego != tab.fin) {
            if (turno <= 1) {
            	turno = 2;
                //int dados = 1;
                int dado = dado();
                JOptionPane.showMessageDialog(null, p1 + "\nEl numero del dado es: " +dado);

                if (player1 < tablero) {
                	player1 = player1 + dado;
                    JOptionPane.showMessageDialog(null, p1 + " esta en la posicion: " +player1);
                    if (tab.celdasN.contains(player1)) {
                        JOptionPane.showMessageDialog(null, p1 + " esta en una pocicion especial");
                        int restar = (int) (Math.random() * 10 + 1);
                        player1 = player1 - restar;
                        if (player1 < inicio) {
                        	player1 = inicio;
                        }
                        JOptionPane.showMessageDialog(null, p1 + " retrocede " + restar + " pociciones");
                        JOptionPane.showMessageDialog(null, p1 + " esta en la posicion: " +player1);
                    }
                    if (tab.celdasP.contains(player1)) {
                        JOptionPane.showMessageDialog(null, p1 + " esta en una pocicion especial");
                        int sumar = (int) (Math.random() * 10 + 1);
                        player1 = player1 + sumar;
                        JOptionPane.showMessageDialog(null, p1 + " avanza " + sumar + " pociciones adicionales");
                        JOptionPane.showMessageDialog(null, p1 + " esta en la posicion: " +player1);
                    }
                    if (player1 >= tablero) {
                        finjuego = tab.fin;
                        JOptionPane.showMessageDialog(null, p1 + " WINNER!!!: \n" + player1 +" puntos totales\n" + p2 + " " + player2 + " puntos totales");
                    }
                }
                

            } else {

                //int dados;
                int dado = dado();
                turno = 1;
                
                JOptionPane.showMessageDialog(null, p2 + "\nEl numero del dado es: " +dado);

                if (player2 < tablero) {
                	player2 = player2 + dado;
                    JOptionPane.showMessageDialog(null, p2 + " esta en la posicion: " +player2);
                    if (tab.celdasN.contains(player2)) {
                        JOptionPane.showMessageDialog(null, p2 + " esta en una pocicion especial");
                        int restar = (int) (Math.random() * 10 + 1);
                        player2 = player2 - restar;
                        if (player2 < inicio) {
                        	player2 = inicio;
                        }
                        JOptionPane.showMessageDialog(null, p2 + " retrocede " + restar + " pociciones");
                        JOptionPane.showMessageDialog(null, p2 + " esta en la posicion: " +player2);
                    }
                    if (tab.celdasP.contains(player2)) {
                        JOptionPane.showMessageDialog(null, p2 + " esta en una pocicion especial");
                        int sumar = (int) (Math.random() * 10 + 1);
                        player2 = player2 + sumar;
                        JOptionPane.showMessageDialog(null, p2 + " avanza " + sumar + " pociciones adicionales");
                        JOptionPane.showMessageDialog(null, p2 + " esta en la posicion: " +player2);
                    }
                    if (player2 >= tablero) {
                        finjuego = tab.fin;
                        JOptionPane.showMessageDialog(null, p2 + " WINNER!!!: \n" + player2 +" puntos totales\n" + p1 + " " + player1 + " puntos totales");
                    }
                }
            }
        }
    }
    public static int dado() {
        int r = (int) (Math.random() * 6 + 1);       
        return r;
    }

}
