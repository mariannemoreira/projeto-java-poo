package projetoYoutube;

public class Video implements AcoesVideo {
	private String titulo;
	private float avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(float avaliacao) {
		
		int nova;
		nova = (int) ((this.avaliacao + avaliacao)/this.views);
		this.avaliacao = nova;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getCurtidadas() {
		return curtidas;
	}
	public void setCurtidadas(int curtidadas) {
		this.curtidas = curtidadas;
	}
	public boolean isReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	@Override
	public void play() {
		this.reproduzindo = true;
		
	}
	@Override
	public void pause() {
		
		this.reproduzindo = false;
	}
	@Override
	public void like() {
		this.curtidas++;
		
	}
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
				
	}
	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}
	
	
	
	
}
