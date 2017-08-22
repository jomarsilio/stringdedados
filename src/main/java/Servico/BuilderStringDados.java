package Servico;

import static java.lang.String.format;

import org.apache.log4j.Logger;

import Model.Instituicao;
import Model.StringDados;

public class BuilderStringDados {
	
	final static Logger logger = Logger.getLogger(BuilderStringDados.class);
	final StringBuilder builder = new StringBuilder();
	final Instituicao instituicao = new Instituicao();
	final StringDados stringDados = new StringDados();
	
	/**
	 * Classe que chama o limpar cpf e o builder da string de dados
	 * @param documento
	 * @return stringDados
	 */
	public String gerarStringDados(final String documento){
		final String documentoLimpo = prepararDocumento(documento);
		final String stringDados = build(documentoLimpo);
		logger.info("String de dados gerada com sucesso!");
		return stringDados;
	}
	
	/**
	 * Classe que recebe e trata o documento deixando apenas os números
	 * @param documento
	 * @return documento limpo
	 */
	public String prepararDocumento(final String documento){
		final String documentoLimpo = documento.replaceAll("[^0-9]+", "");
		logger.info("Preparando o documento: "+documento+" para: "+documentoLimpo);
	    return documentoLimpo;
	}

	/**
	 * Classe que gera a String de Dados
	 * @param documento
	 * @return stringDados
	 */
	public String build(final String documento){
		
		logger.info("Fazendo o build da string de dados para o CPF: "+documento);
		
		builder.append(instituicao.getUrl())
				.append("?p=")
				.append(instituicao.getUsuario())
				.append(instituicao.getSenha())
				.append("        ")
				.append(stringDados.getProtocolo()) 
				.append(format("%-6s", stringDados.getEstacao())) 
				.append(format("0000%s", documento)) 
				.append(stringDados.getPessoa()) 
				.append(format("%-6s", stringDados.getBaseDadosConsulta())) 
				.append(stringDados.getModalidade())
				.append(format("%07d", stringDados.getValorConsulta())) 
				.append(format("%-12s", stringDados.getCentroCusto())) 
				.append(stringDados.getCodificado()) 
				.append(stringDados.getQuantidadeRegistros())
				.append(stringDados.getConversa()) 
				.append(stringDados.getFuncao()) 
				.append(stringDados.getTipoConsulta())
				.append(stringDados.getAtualizaDados()) 
				.append("                                          ")
				.append(format("%02d", stringDados.getQuantidadeCheques())) 
				.append(stringDados.getReceberEnderecosTelefonesAlternativos()) 
				.append("        ") 
				.append(stringDados.getReceberTelefone9Digitos())
				.append(format("%09d", stringDados.getContaCorrente())) 
				.append(format("%01d", stringDados.getDigitoContaCorrente())) 
				.append(format("%04d", stringDados.getAgenciaCorrente())) 
				.append(stringDados.getAlerta()) 
				.append(format("%-8s", stringDados.getLogon())) 
				.append(" ")
				.append(stringDados.getFormatoResposta())
				.append(stringDados.getPeriodoVisualizacaoCompromissos()) 
				.append(stringDados.getPeriodoVisualizacaoEnderecos())
				.append("                                                                                                                                                                                                                                                                 ") //Inicia=144 Bytes:48 Campos out
				.append("P002CSBA                                                                                                           ")
				.append("P006SSSSS  99SSSSSSSS SSSSN")
				.append("                                                                                        ")
				.append("T999");
		
		return builder.toString();
	}
}
