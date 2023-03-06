package funcoes;

public class Fibonacci {
	private int numero;

	public Fibonacci(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}

	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public boolean getFibonacci() {
		int num1 = 1, num2 = 0;
		 for(int i = 0; i < numero + 1; i++){
	            num1 = num1 + num2;
	            num2 = num1 - num2;
	            if(num1 == numero || numero == 0) {
	            	System.out.println(numero + " pertence a sequencia de Fibonacci");
	            	return true;
	            }
	        }
		 System.out.println(numero + " nao pertence a sequencia de Fibonacci");
		 return false;
	}


}
