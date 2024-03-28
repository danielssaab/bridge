package org.example;
class Maquinista extends Funcionario {
	private float salarioBase;

	public Maquinista(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float calcularSalario() {
		float salario = salarioBase;
		if (this.getTipoCarga() != null && this.getTipoCarga() instanceof CargaPerigosa) {
			salario *= 1.1; // Bônus de 10% para cargas perigosas
		}
		return salario;
	}
}