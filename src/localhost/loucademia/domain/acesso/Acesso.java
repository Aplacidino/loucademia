package localhost.loucademia.domain.acesso;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import localhost.loucademia.domain.aluno.Aluno;

@Entity
@Table (name="ENTRADAS_SAIDAS")
public class Acesso implements Serializable {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column (name="ID", nullable = false)
	private Integer ID;
	
	@ManyToOne
	@JoinColumn(name="ALUNO_ID", nullable =false)
	private Aluno Aluno;
	
	@Column(name="ENTRADA", nullable= false)
	private LocalDateTime entrada;
	
	@Column(name="SAIDA", nullable= true)
	private LocalDateTime saida;
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public Aluno getAluno() {
		return Aluno;
	}
	public void setAluno(Aluno aluno) {
		Aluno = aluno;
	}
	public LocalDateTime getEntrada() {
		return entrada;
	}
	public void setEntrada(LocalDateTime entrada) {
		this.entrada = entrada;
	}
	public LocalDateTime getSaida() {
		return saida;
	}
	public void setSaida(LocalDateTime saida) {
		this.saida = saida;
	}
	@Override
	public String toString() {
		return "Acesso [ID=" + ID + ", Aluno=" + Aluno + ", entrada=" + entrada + ", saida=" + saida + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Acesso other = (Acesso) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		return true;
	}
	
	
}
