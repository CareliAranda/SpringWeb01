package mx.gob.queretaro.repository.impl;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.stereotype.Repository;

import mx.gob.queretaro.bean.CityBean;
import mx.gob.queretaro.exception.InternalException;
import mx.gob.queretaro.repository.ICityRepository;

@Repository
public class CityRepositoryImpl implements ICityRepository {

	private final JdbcOperations jdbc;
	private final Logger log = Logger.getLogger(getClass().getName());

	@Autowired
	public CityRepositoryImpl(JdbcOperations jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public List<CityBean> obtenerTodos() throws InternalException {
		try {
			return jdbc.query("SELECT city_id,city from city", (rs,rowNum)->new CityBean(rs.getLong("city_id"),rs.getString("city")));
		}catch (final Exception ex) {
			log.error("Ocurrio un error al obtener  las cuidades", ex);
			throw new InternalException("Ocurrio un error al obtener las ciudades.");
		}
	}


}
