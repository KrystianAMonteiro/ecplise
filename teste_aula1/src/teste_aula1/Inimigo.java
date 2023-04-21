package teste_aula1;

public class Inimigo {
	public int vida = 100;
	public String inimigoTipo = "tipo1";
	public int ataqueDano = 10;
	
	public Inimigo(int vida) {
		this.vida = vida;
	}
	
	public void tomarDano() {
		vida--;
	}
	
	public int getVida() {
		return vida;
	}
	
	
}
