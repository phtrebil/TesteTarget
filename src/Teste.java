import funcoes.Estrada;
import funcoes.Fibonacci;
import funcoes.InversorDeString;
import funcoes.Logica;

public class Teste {

	public static void main(String[] args) {
		
		String espaco = "_____________________________________________________________";
		
		//Questão 1
		int INDICE = 13, SOMA =0;
		for(int K= 0; K<INDICE; K++) {
			SOMA+=K;
		}
		
		System.out.println(SOMA);
		
		System.out.println(espaco);
		
		//Questão 2
		
		int pertence = 0;
		int naopertence = 33;
		
		Fibonacci fibonaci = new Fibonacci(pertence);
		Fibonacci fibonaci2 = new Fibonacci(naopertence);
		
		fibonaci.getFibonacci();
		fibonaci2.getFibonacci();
		
		System.out.println(espaco);

		
		//Questão 3a
		
		int[] a = {1,3,5,7};
		
		Logica logicaA = new Logica(a);
		System.out.println(logicaA.logicaA());
		
		System.out.println(espaco);

	
		//Questão 3b
		
		int[] b = {2,4,8,16,32,64};
		
		Logica logicaB = new Logica(b);
		System.out.println(logicaB.logicaB());
		
		System.out.println(espaco);

		
		//Questão 3c
		
		int[] c = {0,1,4,9,16,25,36};
		
		Logica logicaC = new Logica(c);
		System.out.println(logicaC.logicaC());
		
		System.out.println(espaco);

		
		//Questão 4d
		
		int[] d = {4,16,36,64};		
		
		Logica logicaD = new Logica(d);
		System.out.println(logicaD.logicaD());
		
		System.out.println(espaco);

		
		//Questão 3e
		
		int[] e = {1,1,2,3,5,8};		
		
		Logica logicaE = new Logica(e);
		System.out.println(logicaE.logicaE());		
		
		System.out.println(espaco);

		
		//Questão 3f
		
		int[] f = {2,10, 12, 16, 17, 18, 19};		
		
		Logica logicaF = new Logica(f);
		System.out.println(logicaF.logicaF());
		
		System.out.println(espaco);

		//Questão 4
		
		Estrada caso1 = new Estrada (110, 80, 100);
		
		//sem pedágio
		System.out.println(caso1.pontoDeEncontro());
		
		//primeiro pedágio
		caso1.pedagio();		
		
		System.out.println(caso1.pontoDeEncontro());
		
		//segundo pedágio
		caso1.pedagio();
		
		System.out.println(caso1.pontoDeEncontro());
		
		System.out.println(espaco);
		
		
		//Questão 5
		
		String fraseAserInvertida = "O rato roeu a roupa do rei de roma";
		
		InversorDeString st = new InversorDeString(fraseAserInvertida);
		System.out.println(st.inverte());
		

		}
	
	

	}
	
	


