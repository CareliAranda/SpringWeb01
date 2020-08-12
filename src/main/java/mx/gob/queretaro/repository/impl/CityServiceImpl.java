package mx.gob.queretaro.repository.impl;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.gob.queretaro.bean.CityBean;
import mx.gob.queretaro.exception.InternalException;
import mx.gob.queretaro.repository.ICityRepository;
import mx.gob.queretaro.services.ICityService;
@Service
public class CityServiceImpl implements ICityService {

	private final ICityRepository cityRepository;
	private final Logger log = Logger.getLogger(getClass().getName());

	@Autowired
	public  CityServiceImpl(ICityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}

	@Override
	public List<CityBean> obtenerTodos() throws InternalException {
		try {
			return cityRepository.obtenerTodos();
		}catch (final InternalException ex) {
			throw ex;
		}catch (final Exception ex) {
			log.error("Ocurrio un error al obtener  las cuidades", ex);
			throw new InternalException("Ocurrio un error al obtener las cuidades ");
		}
	}
}
