package br.com.imd.cadbus.localizavel.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.imd.cadwork.core.localizavel.dao.LocalizavelDAO;
import br.com.imd.cadwork.core.localizavel.model.Localizavel;

@Repository
public interface ParadaDAO extends LocalizavelDAO {

	@Query("SELECT e FROM Parada e WHERE e.endereco.id = :idEndereco")
	public Optional<Localizavel> findEscolaByEndereco(@Param("idEndereco") Long idEndereco);
}
