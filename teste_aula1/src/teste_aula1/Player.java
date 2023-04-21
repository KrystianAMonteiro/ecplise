package teste_aula1;


//atributos de classes--
//public = variavel publica para utilizar em outras classes
//private = varial fica privado apenas pra essa classe, nao podendo puxar para outro.

public class Player {
	public int vida = 10;
	public String nome = "krystian";
	
	public void perderVida() {
		vida--;
	}
	public void ganharVida() {
		vida++;
	}
	
	
	

}
