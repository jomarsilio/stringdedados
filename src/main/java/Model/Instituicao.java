package Model;

public class Instituicao {

	private String url = "www.linkdeconexao.com.br";
	private String usuario = "usuario";
	private String senha = "senha";
	
	/**
	 * @param url site para conexao com o serasa
	 * @param usuario
	 * @param senha
	 */
	public Instituicao(String url, 
						String usuario, 
						String senha) {
		this.url = url;
		this.usuario = usuario;
		this.senha = senha;
	}
	
	
	public Instituicao() {
	}

	public String getUrl() {
		return url;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getSenha() {
		return senha;
	}

}
