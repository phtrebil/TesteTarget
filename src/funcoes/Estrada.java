package funcoes;

public class Estrada {
	
	float carroA;
	float carroB;
	float distancia;
	
	public Estrada(float carroA, float carroB, float distancia) {
		this.carroA = carroA;
		this.carroB = carroB;
		this.distancia = distancia;
	}
	
	//Transforma o número decimal em minutos
	private float decimalEmMinutos (float decimal) {
		return 60*decimal;
	}
	
	//o carro que não tive tag irá demorar mais para passar no pedágio utilizado o conversor decimal em horas https://www.calcularfolhadeponto.com.br/m/conversao-hora-decimal.html
	public float pedagio() {
		float pedagio = (float) (distancia/carroB + 0.08);
		return  carroB = distancia/pedagio;
	}
	
	
	//Calcula o tempo que o carroA e carroB demoram para se encontrar quando viajam em sentidos opostos (soma-se as velocidades e divide-se pelo tempo)
	public String pontoDeEncontro() {
		float resultado = distancia/(carroA + carroB);
		float distanciaDeFranca = distancia - carroB * resultado;
		float distanciaDeRibeirap = distancia - carroA * resultado;
		String resposta = "os carros se encontraram em aproximadamente " 
		+ Math.round(decimalEmMinutos(resultado)) 
		+  " minutos" + " o carro estara a " 
		+ distanciaDeRibeirap + " km"
		+ " e o caminhao estara a " 
		+ distanciaDeFranca 
		+ " de distancia do seu destino";
		return resposta;
	}
	

}
