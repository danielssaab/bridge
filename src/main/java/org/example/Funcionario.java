package org.example;

abstract class Funcionario {
	private TipoCarga tipoCarga;
	private TipoVagao tipoVagao;

	public void setTipoCarga(TipoCarga tipoCarga) {
		this.tipoCarga = tipoCarga;
	}

	public void setTipoVagao(TipoVagao tipoVagao) {
		this.tipoVagao = tipoVagao;
	}

	public TipoCarga getTipoCarga() {
		return tipoCarga;
	}

	public TipoVagao getTipoVagao() {
		return tipoVagao;
	}

	public abstract float calcularSalario();
}