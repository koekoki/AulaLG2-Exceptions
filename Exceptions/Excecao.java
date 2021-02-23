package Exceptions;
// problematica 1: a execu��o � interrompida//
public class Excecao {

	public static void main(String[] args) {
		//try: monitoramento de erros
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da exception ");
			
			vetor[4] = 1;
			System.out.println("Este texto n�o ser� impresso");
		}
		//tratamento do erro
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exce��o ao acessar �ndice do vetor que n�o existe");
		} 
		
		System.out.println("Este texto ser� impresso ap�s a exception");

	}

}
