import java.io.File;
import java.util.ArrayList;
import java.util.List;

import br.edu.unoesc.model.Aluno;
import br.edu.unoesc.model.Disciplina;
import br.edu.unoesc.model.Turma;
import br.edu.unoesc.util.ConverterXML;

public class Main {

	public static void main(String[] args) {
		
		ConverterXML<Turma> conversor = new ConverterXML<Turma>(Turma.class);
		
	Turma turma =	conversor.gerarObj(new File("turma.xml"));
	System.out.println(turma.toString());

	
	Turma turma2 = new Turma();
	turma.setNome("tads");
	Aluno aluno1 = new Aluno();
	aluno1.setNome("luciano");
	Aluno aluno2 = new Aluno();
	aluno2.setNome("joaquin");
	
	List<Aluno> alunos = new ArrayList<>();
	alunos.add(aluno1);
	alunos.add(aluno2);
	turma2.setAlunos(alunos);
	
	Disciplina disc = new Disciplina();
	disc.setCodigo(1l);
	disc.setNome("historia");
	disc.setNota(01.00);
	Disciplina disc2 = new Disciplina();
	disc2.setCodigo(2l);
	disc2.setNome("matematica");
	disc2.setNota(02.00);
	
	List<Disciplina> listaDisc = new ArrayList<>();
	listaDisc.add(disc);
	listaDisc.add(disc2);
	aluno1.setDisciplinas(listaDisc);
	
	conversor.gerarXml(new File("turma2.xml"), turma2);
	
	}

}
