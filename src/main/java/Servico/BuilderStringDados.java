package Servico;

import static java.lang.String.format;

public class BuilderStringDados {

	final StringBuilder builder = new StringBuilder();

	public String Buld(final String documento){
		
		builder.append(url)
				.append("?p=")
				.append(usuario)
				.append(senha)
				.append("        ")
				.append(protocolo) 
				.append(format("%-6s", estacao)) 
				.append(format("0000%s", documento)) 
				.append(tipoPessoa) 
				.append(format("%-6s", baseConsulta)) 
				.append(modalidade)
				.append(format("%07d", valorConsulta)) 
				.append(format("%-12s", centroCusto)) 
				.append(codificado) 
				.append(quantidadeRegistros)
				.append(conversa) 
				.append(funcao) 
				.append(tipoConsulta)
				.append(atualizaDados) 
				.append("                                          ") //Inicia=63 Bytes:42
				.append(format("%02d", quantidadeCheques)) 
				.append(receberEnderecosTelefonesAlternativos) 
				.append("        ") //Inicia=108 Bytes:7 Exemplo="       "
				.append(receberTelefone9Digitos)
				.append(format("%09d", contaCorrente)) 
				.append(format("%01d", digitoContaCorrente)) 
				.append(format("%04d", agenciaCorrente)) 
				.append(alerta) 
				.append(format("%-8s", logon)) 
				.append(" ") //Inicia=140 Bytes:1 Exemplo=" "
				.append(formatoResposta)
				.append(periodoVisualizacaoCompromissos) 
				.append(periodoVisualizacaoEnderecos)
				.append("                                                                                                                                                                                                                                                                 ") //Inicia=144 Bytes:48 Campos out
				.append("P002CSBA                                                                                                           ")
				.append("P006SSSSS  99SSSSSSSS SSSSN")
				.append("                                                                                        ")
				.append("T999");
		return builder.toString();
	}
}
