
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ing. Sebastian Rodas Colimba
 */
public class Principalburbuja {

    public static void main(String args[]) {
        int n, i, j, burbuja;
        n = Integer.parseInt(JOptionPane.showInputDialog("ingrese tamaño del arreglo"));
        JTextArea area = new JTextArea(20, 20);
        JScrollPane barra = new JScrollPane(area);
        int[] vec = new int[n];

        for (i = 0; i < n; i++)
        {
            vec[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la posicion" + (i + 1)));
        }

        for (j = 0; j < n; j++)
        {
            for (i = 0; i < n - 1; i++)
            {
                if (vec[i] > vec[i+1] )
                {
                    burbuja = vec[i];
                    vec[i] = vec[i + 1];
                    vec[i + 1] = burbuja;
                }
            }
        }
        for (i = 0; i < n; i++)
        {
            area.append("[" + vec[i] + "]");
        }
        JOptionPane.showMessageDialog(null, barra);
    }

}
