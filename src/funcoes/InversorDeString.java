package funcoes;

public class InversorDeString {

	private String frase;
	
	public InversorDeString(String frase) {
		this.frase = frase;
	}
	
	public String inverte() {
		String fraseInvertida =  ""; 
		for(int i = frase.length() -1; i > 0; i--) {
			 char ch = frase.charAt(i);
			 fraseInvertida += ch;
		 }
		return fraseInvertida;
	}
	
}
