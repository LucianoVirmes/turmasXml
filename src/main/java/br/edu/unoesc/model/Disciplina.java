package br.edu.unoesc.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Disciplina {
	@XmlAttribute(name = "nome")
	private String nome;
	@XmlAttribute(name = "codigo")
	private Long codigo;
	@XmlElement
	private Double nota;

	public Disciplina() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public Disciplina(String nome, Long codigo, Double nota) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", codigo=" + codigo + ", nota=" + nota + "]";
	}

}
