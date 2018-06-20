package br.com.imd.cadbus.localizavel.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.imd.cadwork.core.localizavel.model.Localizavel;
import br.com.imd.cadwork.core.service.GoogleService;
import io.swagger.annotations.ApiModel;

/**
 * 
 * Classe que define o modelo Parada
 * 
 * @author Miguel
 * @version 0.1
 *
 */

@Entity
@Table(name = "parada", schema = "localizavel")
@ApiModel
public class Parada extends Localizavel{

	public Parada() {
		id = new Long(0);
	}

	/**
	 * Método para retorno do id de uma instância de Parada
	 * 
	 * @return Long - Valor do id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Altera o valor do id de uma instância de Parada
	 * 
	 * @param id
	 *            Long - Novo valor do id
	 */

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Método que retorna o nome da escola
	 * 
	 * @return String - Nome da escola
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Método que modifica o nome da escola
	 * 
	 * @param nome
	 *            String - Novo nome da escola
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean validaLocalizavel() {
		return google.validaExistencia(endereco.getLatitude(),
									   endereco.getLongitude(),									   
									   GoogleService.PARADA);	
	}
}
