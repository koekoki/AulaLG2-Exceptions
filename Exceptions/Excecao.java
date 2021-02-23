package Exceptions;
// problematica 1: a execução é interrompida//
public class Excecao {

	public static void main(String[] args) {
		//try: monitoramento de erros
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da exception ");
			
			vetor[4] = 1;
			System.out.println("Este texto não será impresso");
		}
		//tratamento do erro
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exceção ao acessar índice do vetor que não existe");
		} 
		
		System.out.println("Este texto será impresso após a exception");

	}

}
