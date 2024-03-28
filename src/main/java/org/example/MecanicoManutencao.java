package org.example;

class MecanicoManutencao extends Funcionario {
	private float salarioBase;

	public MecanicoManutencao(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float calcularSalario() {
		float salario = salarioBase;
		if (this.getTipoVagao() != null && this.getTipoVagao() instanceof VagaoTanque) {
			salario *= 1.2; // Bônus de 20% para vagões tanque
		}
		return salario;
	}
}
