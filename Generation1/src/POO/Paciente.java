package POO;

import javax.swing.JOptionPane;

public class Paciente {
     
	    //PRIMEIRA ATIVIDADE COM ORIENTAÇÃO AO OBJETO
	    //DECLARAÇÃO DOS ATRIBUTOS DO PACIENTE DE UM HOSPITAL
	
		private String fichaAtendimento;
	    private String nomeDoPaciente;
	    private int idadeDoPaciente;
	    private double temperaturaPaciente;
	    private String profissionalMedico;
	    
	    //CONSTRUTOR
	    
	    public Paciente () {
	    	
	    	this.fichaAtendimento = fichaAtendimento;
	    	this.nomeDoPaciente = nomeDoPaciente;
	    	this.idadeDoPaciente = idadeDoPaciente;
	    	this.temperaturaPaciente = temperaturaPaciente;
	    }

	    //MÉTODOS GETTER(ACESSAR OS DADOS DO OBJETO) E SETTER(MODIFICAR OS DADOS DO OBJETO)
	    
	    public String getFichaAtendimento() {
			return fichaAtendimento;
		}

		public void setFichaAtendimento(String fichaAtendimento) {
			this.fichaAtendimento = fichaAtendimento;
		}
		
		public String getNomeDoPaciente() {
			return nomeDoPaciente;
		}

		public void setNomeDoPaciente(String nomeDoPaciente) {
			this.nomeDoPaciente = nomeDoPaciente;
		}

		public int getIdadeDoPaciente() {
			return idadeDoPaciente;
		}

		public void setIdadeDoPaciente(int idadeDoPaciente) {
			this.idadeDoPaciente = idadeDoPaciente;
		}

		public double getTemperaturaPaciente() {
			return temperaturaPaciente;
		}

		public void setTemperaturaPaciente(double temperaturaPaciente) {
			this.temperaturaPaciente = temperaturaPaciente;
		}
		
		
		//
	    
	    public String getProfissionalMedico() {
	    	if(this.idadeDoPaciente < 14) {
	    		JOptionPane.showMessageDialog(null,"Profissional: Pediatra");
	    	}else if(this.idadeDoPaciente >13 && this.idadeDoPaciente <60) {
	    		JOptionPane.showMessageDialog(null,"Profissional: Clínico Geral");
	    	}else if(this.idadeDoPaciente >59){
	    		JOptionPane.showMessageDialog(null,"Profissional: Geriatra");
	    	} return profissionalMedico;
	    }
	   
	}
