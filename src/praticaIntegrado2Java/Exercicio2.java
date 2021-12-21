package praticaIntegrado2Java;

public class Exercicio2 {

	public static void main(String[] args) {
		
		double x = 1.13;
		double y = 18.4;
		
	    int ano =3;
	    int i = 1;
	    System.out.println("empresa Y - Valor da Empresa : 18,4m");
	    while(i < ano) {
	    
	      x = 1.13*1.48*i/0.10;
	      y = 18.4*3.2*i/0.10;
	    	
	       
	        System.out.println("------------------------------------------------------------------");
	    	System.out.println("Empresa X  - " + " 202"+ i + " -  Valor da empresa - "+"" + x + "m");
	    	
	    	
	    	i++;
	    	
	    }
		

	}

}
