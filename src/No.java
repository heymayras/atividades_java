
public class No {
	
	private Integer dados;
	private No proximo;
	
	public No() {
		this.dados = null;
		this.proximo = null;
	}

	public Integer getDados() {
		return dados;
	}

	public void setDados(int dados) {
		this.dados = dados;
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	
	
}
