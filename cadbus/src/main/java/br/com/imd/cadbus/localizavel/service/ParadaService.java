package br.com.imd.cadbus.localizavel.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

import br.com.imd.cadwork.core.dao.GenericDAO;
import br.com.imd.cadwork.core.localizavel.model.Localizavel;
import br.com.imd.cadwork.core.service.GoogleService;
import br.com.imd.cadwork.core.service.LocalizavelService;
import br.com.imd.cadwork.core.service.exception.GenericServiceException;
import br.com.imd.cadwork.util.exception.ConvertLocalizavelException;

@Component
public class ParadaService extends LocalizavelService {

	@Override
	public List<Localizavel> listar() throws GenericServiceException {
		return super.listar();
	}

	@Override
	public void salvar(Localizavel parada, BindingResult resultado) throws GenericServiceException {
		super.salvar(parada, resultado);
	}

	@Override
	public Optional<Localizavel> buscar(Long id) throws GenericServiceException {
		return super.buscar(id);
	}

	@Autowired
	@Override
	protected void setDao(GenericDAO<Localizavel> dao) {
		this.dao = dao;
	}	

	@Override
	protected void verificaExistencia(Localizavel parada) throws GenericServiceException {
		//TODO
	}

	public List<Map<String, Object>> buscarParadasProximas(Double lat, Double lng) throws GenericServiceException, ConvertLocalizavelException {
		return super.buscarLocalizaveisProximos(lat, lng, GoogleService.PARADA);
	}
	
	
}
