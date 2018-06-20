package br.com.imd.cadbus.criterio.domain;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.imd.cadwork.core.dao.GenericDomainException;
import br.com.imd.cadwork.core.localizavel.exception.CriterioException;
import br.com.imd.cadwork.core.localizavel.model.CriterioLocalizacao;
import io.swagger.annotations.ApiModel;

@Entity
@Table(name = "onibus", schema = "criterio")
@ApiModel
public class CriterioLocaLizacaoOnibus extends CriterioLocalizacao {

	@Column
	private Integer linha;
	
	@Column
	private LocalTime horaInicio;
	
	@Column
	private LocalTime horaFim;

	public Integer getLinha() {
		return linha;
	}

	public void setLinha(Integer linha) {
		this.linha = linha;
	}

	@Override
	public void validaCriterios() throws GenericDomainException {
		if(LocalTime.now().isAfter(horaFim) ||
		   LocalTime.now().isBefore(horaInicio)) {
			throw new CriterioException("Parada indisponível no momento");
		}
	}

}
