package ec.edu.uce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.modelo.Receta;
import ec.edu.uce.service.IGestorCitaService;
import ec.edu.uce.service.IPacienteService;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private IGestorCitaService gestorServ;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		Paciente paciente1=new Paciente();
		paciente1.setId(33236);
		paciente1.setNombre("Patricio");
		paciente1.setApellido("Salazar");
		paciente1.setEdad(22);
		
		Receta rec1=new Receta();
		rec1.setId(88323);
		rec1.setIndicaciones("Reposo durante 4 dias");
		rec1.setMedicamentos("Ibuprofeno");
		
		this.gestorServ.registratNuevaConsulta(paciente1, rec1);
		
		//pacienteServ.InsertarPacienteServicio(paciente1);
		//pacienteServ.borrarPacienteServicio(3336);
		//pacienteServ.actualizarPacienteServicio(paciente1);
		//System.out.println("El paciente a buscar fue: "+pacienteServ.buscarPacienteServicio(12345));
	
		
		
	}

}
