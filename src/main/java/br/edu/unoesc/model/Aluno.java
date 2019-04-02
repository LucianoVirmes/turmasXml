package br.edu.unoesc.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Aluno {
	@XmlElement
	private String nome;
	@XmlElementWrapper(name = "disciplinas")
	private List<Disciplina> disciplina;

	public Aluno() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplina;
	}

	public void setDisciplinas(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}

	public Aluno(String nome, List<Disciplina> disciplina) {
		super();
		this.nome = nome;
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", disciplinas=" + disciplina + "]";
	}

}
