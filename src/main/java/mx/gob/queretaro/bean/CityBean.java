package mx.gob.queretaro.bean;

import java.io.Serializable;
import java.util.Date;

public class CityBean implements Serializable {

	private static final long serialVersionUID = 98357281576429822L;
	private long cityId;
	private String city;
	private CountryBean country;
	private Date lastUpdate;
	private String status;

	public CityBean() {
	}

	public long getCityId() {
		return cityId;
	}

	public void setCityId(long cityId) {
		this.cityId = cityId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public CountryBean getCountry() {
		return country;
	}

	public void setCountry(CountryBean country) {
		this.country = country;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
