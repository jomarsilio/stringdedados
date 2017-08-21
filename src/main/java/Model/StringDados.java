package Model;

import static Model.StringDados.BaseDadosConsulta.C;
import static Model.StringDados.BooleanText.NAO;
import static Model.StringDados.BooleanText.SIM;
import static Model.StringDados.Modalidade.FI;
import static Model.StringDados.Pessoa.FISICA;

public class StringDados {

	/**
	 * Preencher com B49C
	 */
	private final String protocolo = "B49C";
	
	/**
	 * Preencher com o código da estação chamadora no cliente (identificação de terminal ou computador).
	 * Obs.: Quando for utilizada a porta de comunicação Host-Host, preencher com “brancos”.
	 */
	private final String estacao = "";
	
	/**
	 * Informar o número do CPF (com 11 dígitos).
	 */
	private String documento;
	
	/**
	 * Informar F = pessoa física, J = pessoa jurídica;
	 */
	private Pessoa pessoa = FISICA;
	
	/**
	 * Informar base de dados para consulta: C = Base compartilhada I = Base da própria empresa (base individual) 
	 */
	private BaseDadosConsulta baseDadosConsulta = C;
	
	/**
	 * Informar a modalidade de consulta.
	 * Ex: CH = Cheque, FI = Financiamento
	 */
	private Modalidade modalidade = FI;
	
	/**
	 * Informar valor da consulta (inteiros)
	 */
	private final Integer valorConsulta = 0;
	
	/**
	 * Informar centro de custo Obs. 1: Como é opcional, informar brancos se não for usar esse dado.
	 * Obs. 2: No caso de distribuidores, é obrigatório informar o CNPJ consultante alinhado à esquerda.
	 */
	private final String centroCusto = "";
	
	/**
	 * Informar se deseja receber campos codificados? (S/N)
	 */
	final BooleanText codificado = NAO;
	
	/**
	 * Indicar a quantidade de registros por transmissão de dados que deseja receber.
	 */
	private final Integer quantidadeRegistros = 99;
	
	/**
	 * Informar se deseja diálogo de comunicação. (S/N) Obs. 1: Quando a resposta à pergunta for N, o 
	 * sistema enviará até 31 registros (recebidos e consultados) além do protocolo, 
	 * e encerrará a consulta ao CPF solicitado. Obs. 2: Quando a resposta for S, o sistema vai devolver 
	 * o protocolo a cada consulta, informando FIM na seqüência 12 se todos os dados do CPF consultado foram enviados,
	 *  e COM se houver mais dados sobre o CPF. O código ERR significa que houve erro e, nesse caso, 
	 *  o sistema devolve o protocolo e o registro T999 com códigos e mensagens de erro.
	 */
	final BooleanText conversa = SIM;
	
	/**
	 * Usar as funções: INI, CON, ENC, ERR,TMD, FIM conforme Nota do Protocolo Obs.: A instituição participante deve
	 * enviar INI para iniciar uma nova consulta de CPF, CON se quiser receber mais dados de um CPF e ENC para comunicar 
	 * que está encerrando a consulta ao CPF e não deseja receber mais dados. As demais funções foram explicadas na
	 * seqüência anterior.
	 */
	private final String funcao = "INI";

	/**
	 * Informar o tipo de consulta, conforme tabela de opções de uso do layout
	 */
	final Character tipoConsulta = 'A';
	
	/**
	 * Atualiza dados enviados? (S/N)
	 */
	final BooleanText atualizaDados = NAO;
	
	/**
	 * Quantidade de cheques seqüenciais
	 */
	private final Integer quantidadeCheques = 0;
	
	/**
	 * Deseja receber endereços e telefones alternativos? (S/N/P) Obs.: Na opção P são enviadas as informações 
	 * priorizadas.
	 */
	final BooleanText receberEnderecosTelefonesAlternativos = NAO;
	
	/**
	 * 
	 */
	private final Character receberTelefone9Digitos = '0';
	
	/**
	 * Número da conta-corrente (para solicitar consulta com cheque)
	 */
	private final Integer contaCorrente = 0;
	
	/**
	 * Dígito da conta-corrente (para solicitar consulta com cheque)
	 */
	private final Integer digitoContaCorrente = 0;
	
	/**
	 * Número da agência da conta-corrente (para solicitar consulta com cheque)
	 */
	private final Integer agenciaCorrente = 0;
	
	/**
	 * Quer alerta se possuir negativos? (S/N)
	 */
	final BooleanText alerta = SIM;

	/**
	 * Informar logon de acesso
	 */
	private final String logon = "";
	
	/**
	 * Forma de recebimento dos dados para: Credit Bureau: 1- String de dados (default), 2- Relatório formato texto,
	 * 5 - String de dados + Relatório Obs.: Nos retornos em formato relatório não são válidas as opções
	 * de parametrizações de consulta.
	 */
	final Character formatoResposta = '1';

	/**
	 * Período de visualização de compromissos a partir da data do contrato. 1 = 12 meses; 2 = 24 meses; 3 = 36 meses;
	 * (seguir seqüência até 8); 9 = todos
	 */
	final Character periodoVisualizacaoCompromissos = ' ';
	
	/**
	 * Período de visualização de endereços. 1 = 12 meses; 2 = 24 meses; 3 = 36 meses; (seguir seqüência até 8); 
	 * 9 = todos
	 */
	final Character periodoVisualizacaoEnderecos = ' ';

	public StringDados() {
	}

	public enum Pessoa{
		FISICA, JURIDICA
	}
	
	public enum BaseDadosConsulta{
		C, I
	}
	
	public enum Modalidade{
		FI, CH
	}

	public enum BooleanText{
		SIM, NAO
	}

	public String getProtocolo() {
		return protocolo;
	}

	public String getEstacao() {
		return estacao;
	}

	public String getDocumento() {
		return documento;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public BaseDadosConsulta getBaseDadosConsulta() {
		return baseDadosConsulta;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public Integer getValorConsulta() {
		return valorConsulta;
	}

	public String getCentroCusto() {
		return centroCusto;
	}

	public BooleanText getCodificado() {
		return codificado;
	}

	public Integer getQuantidadeRegistros() {
		return quantidadeRegistros;
	}

	public BooleanText getConversa() {
		return conversa;
	}

	public String getFuncao() {
		return funcao;
	}

	public Character getTipoConsulta() {
		return tipoConsulta;
	}

	public BooleanText getAtualizaDados() {
		return atualizaDados;
	}

	public Integer getQuantidadeCheques() {
		return quantidadeCheques;
	}

	public BooleanText getReceberEnderecosTelefonesAlternativos() {
		return receberEnderecosTelefonesAlternativos;
	}

	public Character getReceberTelefone9Digitos() {
		return receberTelefone9Digitos;
	}

	public Integer getContaCorrente() {
		return contaCorrente;
	}

	public Integer getDigitoContaCorrente() {
		return digitoContaCorrente;
	}

	public Integer getAgenciaCorrente() {
		return agenciaCorrente;
	}

	public BooleanText getAlerta() {
		return alerta;
	}

	public String getLogon() {
		return logon;
	}

	public Character getFormatoResposta() {
		return formatoResposta;
	}

	public Character getPeriodoVisualizacaoCompromissos() {
		return periodoVisualizacaoCompromissos;
	}

	public Character getPeriodoVisualizacaoEnderecos() {
		return periodoVisualizacaoEnderecos;
	}
	
}
