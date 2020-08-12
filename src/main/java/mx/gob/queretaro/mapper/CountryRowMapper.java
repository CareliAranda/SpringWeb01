package mx.gob.queretaro.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.gob.queretaro.bean.CountryBean;

public class CountryRowMapper implements RowMapper<CountryBean> {

	@Override
	public CountryBean mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		final CountryBean country = new CountryBean();
		country.setCountryId(rs.getLong("country_id"));
		country.setCountry(rs.getString("country"));
		country.setLastUpdate(rs.getDate("last_update"));
		return country;
	}

}
