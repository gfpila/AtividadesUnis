package interfaces;
import javax.swing.JOptionPane;

public class decidir implements decisao {
    
    public String resultado;
    public int valor;
    public boolean valido = false;
    public void decidir() {
         while (valido == false) {
            try {
                String nota = JOptionPane.showInputDialog(null, "Nota Final:");
                valor = Integer.parseInt(nota);
            } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um valor númerico.");
            continue;
            }
            if (valor > 100 || valor < 0) {
                JOptionPane.showMessageDialog(null, "Digite entre 0 e 100.");
                continue;
            }
            valido = true;
            if (valor >= 85) {
                resultado = excelente();   
                JOptionPane.showMessageDialog(null, resultado);
            } else if (valor >= 60 && valor < 85)
            {
                resultado = satisfatorio();
                JOptionPane.showMessageDialog(null, resultado);
            } else {
                resultado = reprovado();
                JOptionPane.showMessageDialog(null, resultado);   
           }
        }   
    }
}
