package mx.gob.queretaro.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.gob.queretaro.bean.CityBean;
import mx.gob.queretaro.bean.CountryBean;

public class CityRowMapper implements RowMapper<CityBean> {

	@Override
	public CityBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		final CityBean city = new CityBean();

		city.setCityId(rs.getLong("city_id"));
		city.setCity(rs.getString("city"));
		city.setCountry(new CountryBean(rs.getLong("city_id")));
		city.setLastUpdate(rs.getDate("last_update"));
		city.setStatus(rs.getString("status"));

		return city;
	}

}
