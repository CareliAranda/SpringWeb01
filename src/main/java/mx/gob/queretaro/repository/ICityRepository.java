package mx.gob.queretaro.repository;

import java.util.List;

import mx.gob.queretaro.bean.CityBean;
import mx.gob.queretaro.exception.InternalException;

public interface ICityRepository {
	List<CityBean>obtenerTodos() throws InternalException;

}
