package POO;

public class TestePaciente {
	public static void main(String[] args) {
	Paciente[] cadastrado = new Paciente[3];
	
	cadastrado[0] = new Paciente("Wanessa Lopez",890308);
	cadastrado[1] = new Paciente("Monica Dias",8273);
	cadastrado[2] = new Paciente("Carlos Franklin",49039);
	
	for(Paciente roda1:cadastrado) {
		roda1.imprimir();
	}
	System.out.println("\nO aumento no valor hospitalar de cada paciente foi de: ");
	
	for(Paciente roda:cadastrado) {
		roda.aumentarValorHospitalar(10);
		roda.imprimir();
		}
	}
}
