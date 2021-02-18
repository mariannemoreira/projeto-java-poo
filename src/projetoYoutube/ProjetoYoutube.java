package projetoYoutube;
public class ProjetoYoutube {
	public static void main(String[] args) {
		
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 2 de Java");
		v[2] = new Video("Aula 3 de PHP");
		
		Gafanhoto g = new Gafanhoto("João", 35, "M", "joao");
		
		System.out.println(v[0].toString());
		System.out.println(g.toString());
		
		Visualizacao vis [] = new Visualizacao[2];
		vis[0] = new Visualizacao(g, v[1]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(g, v[2]);
		vis[1].avaliar(87.0f);
		System.out.println(vis[1].toString());
		
		
	}
}
