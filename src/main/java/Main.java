import java.io.File;

import br.edu.unoesc.model.Disciplina;
import br.edu.unoesc.model.Turma;
import br.edu.unoesc.util.ConverterXML;

public class Main {

	public static void main(String[] args) {

		ConverterXML<Turma> conversor = new ConverterXML<Turma>(Turma.class);

		Turma turma = conversor.gerarObj(new File("turma.xml"));
		System.out.println(turma.toString());

		Disciplina disc = new Disciplina();
		
		// calculos de média
		System.out.println("Media do aluno 01: "+ turma.getAlunos().get(1).calculaMedia());
		System.out.println("Media da disciplina 01: "+ disc.calculaMedia(turma.getAlunos(), 1l));
		System.out.println("Media da turma: "+turma.calculaMedia(turma));
	}
}
