import br.com.desafio.dominio.BootCamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso = new Curso();
		curso.setTitulo("Curso Java");
		curso.setDescricao("Descrição Curso Java");
		curso.setCargaHoraria(44);
		
		Curso cursoJavaScript = new Curso();
		cursoJavaScript.setTitulo("Curso JavaScript");
		cursoJavaScript.setDescricao("Descrição Curso JavaScript");
		cursoJavaScript.setCargaHoraria(44);
		
			
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Curso JavaScript");
		mentoria.setDescricao("Descrição Curso JavaScript");
		mentoria.setData(LocalDate.now());
		
		BootCamp bootCamp = new BootCamp();
		bootCamp.setNome("BootCamp Java Developer");
		bootCamp.setDescricao("Descrição BootCamp Java Developer");
		bootCamp.getConteudos().add(curso);
		bootCamp.getConteudos().add(cursoJavaScript);
		bootCamp.getConteudos().add(mentoria);
		
		Dev devNanna = new Dev();
		devNanna.setNome("Nanna");
		devNanna.InscreverBootCampo(bootCamp);
		System.out.println("Conteudo Inscritos" + devNanna.getConteudosInscritos());
		devNanna.Progredir();
		devNanna.Progredir();
		System.out.println("Conteudo Inscritos" + devNanna.getConteudosInscritos());
		System.out.println("Conteudo Concluídos" + devNanna.getConteudosConcluidos());
		System.out.println("XP" + devNanna.CalcularTotalXp());
		
		Dev devMarlon = new Dev();
		devMarlon.setNome("Marlon");
		devMarlon.InscreverBootCampo(bootCamp);
		System.out.println("Conteudo Inscritos" + devMarlon.getConteudosInscritos());
		devMarlon.Progredir();
		devMarlon.Progredir();
		devMarlon.Progredir();
		System.out.println("Conteudo Inscritos" + devMarlon.getConteudosInscritos());
		System.out.println("Conteudo Concluídos" + devMarlon.getConteudosConcluidos());
		System.out.println("XP" + devMarlon.CalcularTotalXp());
		/*System.out.println(mentoria);
		System.out.println(curso);
		System.out.println(cursoJavaScript);*/
	}
}
