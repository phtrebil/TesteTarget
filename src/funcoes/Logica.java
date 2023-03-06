package funcoes;

public class Logica {
	
	int[] numeros;
	
	public Logica(int[] numeros) {
		this.numeros = numeros;
	}
	
	public int logicaA() {
		return numeros[numeros.length - 1] + 2;
	}
	
	public int logicaB() {
		return numeros[numeros.length - 1]*2;
	}
	
	public int logicaC() {
		int somador = -1;
		 for(int i = 0; i < numeros.length; i++) {
			somador+=2;
		}
		 return numeros[numeros.length - 1]+somador;
	}
	
	public int logicaD() {			
		 
		int raiz = (int) Math.sqrt(numeros[numeros.length -1]);
		int proximonumero = raiz + 2;
		return proximonumero*=proximonumero;
	}
	
	public int logicaE() {
		return numeros[numeros.length - 1] + numeros[numeros.length - 2];
	}
	
	public String logicaF() {
		return "Duzentos o proximo número que inicia com a letra D";
	}
	

}
