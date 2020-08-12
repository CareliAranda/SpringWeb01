package mx.gob.queretaro.services;

import java.util.List;

import mx.gob.queretaro.bean.CityBean;
import mx.gob.queretaro.exception.InternalException;

public interface ICityService {
	List<CityBean> obtenerTodos() throws InternalException;

}
