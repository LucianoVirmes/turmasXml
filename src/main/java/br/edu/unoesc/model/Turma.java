package br.edu.unoesc.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Turma {
	@XmlAttribute
	private String nome;
	@XmlElementWrapper(name="alunos")
	private List<Aluno> aluno;
	
	public Double calculaMedia(Turma turma){
	Double media = 0.0;	
		for (Aluno aluno : turma.getAlunos()) {
			media += aluno.calculaMedia();
		}
		return media = media / turma.getAlunos().size();
	}
	
	public Turma() {
		
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluno> getAlunos() {
		return aluno;
	}

	public void setAlunos(List<Aluno> aluno) {
		this.aluno = aluno;
	}

	public Turma(String nome, List<Aluno> aluno) {
		super();
		this.nome = nome;
		this.aluno = aluno;
	}

	@Override
	public String toString() {
		return "Turma [nome=" + nome + ", aluno=" + aluno + "]";
	}

}
