package POO;

import javax.swing.JOptionPane;

public class ControlePaciente {

	public static void main(String[] args) {
		
        Paciente paciente1;
        
      //INSTANCIA  
        
        paciente1 = new Paciente();
        
      //CADASTRAR OS DADOS - SET
        
        paciente1.setFichaAtendimento(JOptionPane.showInputDialog("Digite o número da ficha do paciente: "));
        paciente1.setNomeDoPaciente(JOptionPane.showInputDialog("Digite o nome do paciente: "));
        paciente1.setIdadeDoPaciente(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do paciente: ")));
        paciente1.setTemperaturaPaciente(Double.parseDouble(JOptionPane.showInputDialog("Resultado da medição dos graus do paciente: ")));
        
      //EXIBIR OS DADOS - GET
        
      JOptionPane.showMessageDialog(null,"Número de atendimento: "+paciente1.getFichaAtendimento());  
      JOptionPane.showMessageDialog(null,"Nome do paciente: "+paciente1.getNomeDoPaciente());
      JOptionPane.showMessageDialog(null,"Idade do paciente: "+paciente1.getIdadeDoPaciente());
      JOptionPane.showMessageDialog(null,"Temperatura do paciente: "+paciente1.getTemperaturaPaciente());
       
      paciente1.getProfissionalMedico();
      
        
	}

}