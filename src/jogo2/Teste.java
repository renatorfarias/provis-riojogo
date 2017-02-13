package testeParaRenato;

import java.util.Random;

public class Teste {
	public static void main(String[]args){
		/*Exemplo de código:*/
		int j = 0;
		int valorDoDado = 0;
		int Tabuleiro[][] = {{1, 2, 3, 4 , 5}, {5, 4, 3, 2, 1}};
		Jogador Player1 = new Jogador();
		Random rd = new Random();
		valorDoDado = rd.nextInt(4);
		System.out.println(valorDoDado);
		Player1.posicaoAntigaDoJogador = Player1.posicaoNovaDoJogador;
		Player1.posicaoNovaDoJogador = valorDoDado; //Ou, pode colocar direto Player1.posicaoNovaDoJogador = rd.nextInt(); Foi só para ficar mais didático
		System.out.println(Player1.X); //Printando o valor inicial de X, antes da nova atribuição
		System.out.println(Player1.Y); //Printando o valor inicial de Y, antes da nova atribuição
		Player1.setX(getLeituraDaPosicaoX(Player1.posicaoNovaDoJogador, Tabuleiro)); //Atribuindo ao valor de X do (objeto) Player1 o novo valor, de acordo com a posição nova do jogador
		Player1.setY(getLeituraDaPosicaoY(Player1.posicaoNovaDoJogador, Tabuleiro)); //Atribuindo ao valor de Y do (objeto) Player1 o novo valor, de acordo com a posição nova do jogador
		//getLeituraDaPosicaoX() vai retornar um valor Inteiro que é a própria coordenada armazenada na matriz
		//Esse Inteiro de retorno vai se tornar o argmunento para a função SetX();
		//Da mesma forma como ocorre pro Y
		System.out.println(Player1.X); //Depois de atribuir o novo valor de X (após a chamada do valor na matriz)
		System.out.println(Player1.Y); //Depois de atribuir o novo valor de Y (após a chamada do valor na matriz)
	}

	static int getLeituraDaPosicaoX(int posicaoNovaDoJogador, int tabuleiro[][]){ //Não entendi o porquê do static. O eclipse que mandou botar
		return tabuleiro[0][posicaoNovaDoJogador - 1]; //Ele retorna o valor da matriz na Linha 0 e Coluna (de número:) posicaoAntigaDoJogador
		//posicaoAntigaDoJogador
		//posicaoNovaDoJogador == posicaoAntigaDoJogador  + valorDoDado
		//tabuleiro[][] é a matriz que armazena as coordenadas

	}

	static int getLeituraDaPosicaoY(int posicaoNovaDoJogador, int tabuleiro[][]){ //Argumentos: posiçãoNovaDoJogador (que é equivalente ao número da coluna da matriz) e tabuleiro[][] que é a própria matriz de coordenadas
		return tabuleiro[1][posicaoNovaDoJogador - 1]; //Ele retorna o valor da matriz na Linha 1 e Coluna (de número:) posicaoAntigaDoJogador
	}
}

class Jogador{
	int posicaoAntigaDoJogador = 0;
	int posicaoNovaDoJogador = 0;
	int X = 0;
	int Y = 0;
	
	void setX(int X){ //Argumento X: que vai re-setar o novo valor de X para o Objeto Player1 (no caso do exemplo porque vão ter outros Objetos/Jogadores)
		this.X = X; //O X do Objeto recebe o Argumento
	}
		
	void setY(int Y){ //Argumento Y: que vai re-setar o novo valor de Y para o Objeto Player1 (no caso do exemplo porque vão ter outros Objetos/Jogadores)
		this.Y = Y; // O Y do Objeto recebe o Argumento
	}
}





/*
 * Os métodos são:
  
    static int getLeituraDaPosicaoX(int posicaoNovaDoJogador, int tabuleiro[][]){ //para pegar o valor da Matriz
		return tabuleiro[0][posicaoNovaDoJogador - 1]; 
	}

	static int getLeituraDaPosicaoY(int posicaoNovaDoJogador, int tabuleiro[][]){ //para pegar o valor da Matriz
		return tabuleiro[1][posicaoNovaDoJogador - 1]; 
	}
	
	void setX(int X){ //para setar o novo valor da coordenada 
		this.X = X;
	}
		
	void setY(int Y){ //para setar o novo valor da coordenada
		this.Y = Y;
	}
*/

