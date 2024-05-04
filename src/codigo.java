
import javax.swing.*;

public class codigo {

    private int cod;
    private String nomArt;

    public codigo() {
        cod=0;
        nomArt="";
    }
    public void PedirDatos(){
       nomArt=JOptionPane.showInputDialog("Ingrese Nombre articulo");
       cod=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Codigo"));
    }
    
}
