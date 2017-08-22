package Servico;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringDadosTest {
	
	final BuilderStringDados builder = new BuilderStringDados();

	@Test
	public void testPrepararDocumento() {
		final String documento = "721.138.243-02";
		final String result = builder.prepararDocumento(documento);
		assertEquals("72113824302", result);
	}

	@Test
	public void testBuildStringDadosCpfLimpo() {
		final String documento = "72113824302";
		final String comparar = "www.linkdeconexao.com.br?p=usuariosenha        B49C      000072113824302FISICAC     FI0000000            NAO99SIMINIANAO                                          00NAO        000000000000000SIM         1                                                                                                                                                                                                                                                                   P002CSBA                                                                                                           P006SSSSS  99SSSSSSSS SSSSN                                                                                        T999";
		final String result = builder.build(documento);
		assertEquals(comparar, result);
	}
	
	@Test
	public void testBuildStringDados() {
		final String documento = "721.138.243-02";
		final String comparar = "www.linkdeconexao.com.br?p=usuariosenha        B49C      000072113824302FISICAC     FI0000000            NAO99SIMINIANAO                                          00NAO        000000000000000SIM         1                                                                                                                                                                                                                                                                   P002CSBA                                                                                                           P006SSSSS  99SSSSSSSS SSSSN                                                                                        T999";
		final String result = builder.gerarStringDados(documento);
		assertEquals(comparar, result);
	}

}
