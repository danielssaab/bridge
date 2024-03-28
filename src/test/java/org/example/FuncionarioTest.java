package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

	@Test
	void deveRetornarSalarioMaquinistaComCargaFragil() {
		Maquinista maquinista = new Maquinista(2000.0f);
		maquinista.setTipoCarga(new CargaFragil());
		assertEquals(2000.0f, maquinista.calcularSalario(), 0.01f);
	}

	@Test
	void deveRetornarSalarioMaquinistaComCargaGeral() {
		Maquinista maquinista = new Maquinista(2000.0f);
		maquinista.setTipoCarga(new CargaGeral());
		assertEquals(2000.0f, maquinista.calcularSalario(), 0.01f);
	}

	@Test
	void deveRetornarSalarioMaquinistaComCargaPerigosa() {
		Maquinista maquinista = new Maquinista(2000.0f);
		maquinista.setTipoCarga(new CargaPerigosa());
		assertEquals(2200.0f, maquinista.calcularSalario(), 0.01f);
	}

	@Test
	void deveRetornarSalarioMecanicoManutencaoComVagaoAberto() {
		MecanicoManutencao mecanico = new MecanicoManutencao(1500.0f);
		mecanico.setTipoVagao(new VagaoAberto());
		assertEquals(1500.0f, mecanico.calcularSalario(), 0.01f);
	}

	@Test
	void deveRetornarSalarioMecanicoManutencaoComVagaoFechado() {
		MecanicoManutencao mecanico = new MecanicoManutencao(1500.0f);
		mecanico.setTipoVagao(new VagaoFechado());
		assertEquals(1500.0f, mecanico.calcularSalario(), 0.01f);
	}

	@Test
	void deveRetornarSalarioMecanicoManutencaoComVagaoTanque() {
		MecanicoManutencao mecanico = new MecanicoManutencao(1500.0f);
		mecanico.setTipoVagao(new VagaoTanque());
		assertEquals(1800.0f, mecanico.calcularSalario(), 0.01f);
	}
}
