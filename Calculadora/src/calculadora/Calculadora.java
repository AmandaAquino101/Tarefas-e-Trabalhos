
package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    
    public static void main(String[] args) {
        String resp = JOptionPane.showInputDialog( "Qual operação deseja realizar? (Adição/Subtração/Multiplicação/Divisão)" );
        
        if((resp).equals("Adição")){
            String n1 = JOptionPane.showInputDialog( "Digite um dos números que participará da operação" );
            String n2 = JOptionPane.showInputDialog( "Digite o segundo número que participará da operação" );
            
            int nmr1 = Integer.parseInt(n1);
            int nmr2 = Integer.parseInt(n2);
            
            int soma = nmr1+nmr2;
            
            JOptionPane.showMessageDialog(null, "A soma dos dois números é " +soma);
        }else{
            if((resp).equals("Subtração")){
                String n1 = JOptionPane.showInputDialog( "Digite um dos números que participará da operação" );
                String n2 = JOptionPane.showInputDialog( "Digite o segundo número que participará da operação" );
            
                int nmr1 = Integer.parseInt(n1);
                int nmr2 = Integer.parseInt(n2);
                
                int sub = nmr1 - nmr2;
                
                JOptionPane.showMessageDialog(null, "A subtração dos dois números é " +sub);
               
            }else{
                if((resp).equals("Multiplicação")){
                    String n1 = JOptionPane.showInputDialog( "Digite um dos números que participará da operação" );
                    String n2 = JOptionPane.showInputDialog( "Digite o segundo número que participará da operação" );
            
                    int nmr1 = Integer.parseInt(n1);
                    int nmr2 = Integer.parseInt(n2);
            
                    int mult = nmr1*nmr2;
                    
                    JOptionPane.showMessageDialog(null, "A multiplicação dos dois números é " +mult);
                }else{
                    if((resp).equals("Divisão")){
                        String n1 = JOptionPane.showInputDialog( "Digite um dos números que participará da operação" );
                        String n2 = JOptionPane.showInputDialog( "Digite o segundo número que participará da operação" );
            
                        int nmr1 = Integer.parseInt(n1);
                        int nmr2 = Integer.parseInt(n2);
                        
                        int divi = nmr1/nmr2;
                        
                        JOptionPane.showMessageDialog(null, "A divisão dos dois números é " +divi);
                    }
                }
            }
        }
        
        
        
        
    }
    
}
