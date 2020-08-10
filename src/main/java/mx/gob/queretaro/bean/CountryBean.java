package mx.gob.queretaro.bean;

import java.io.Serializable;
import java.util.Date;

public class CountryBean implements Serializable {

	private static final long serialVersionUID = 6504621010333628987L;
	private long countryId;
	private String country;
	private Date lastUpdate;



	public CountryBean() {
	}
	public CountryBean(long countryId) {
		this.countryId = countryId;
	}

	public CountryBean(long countryId, String country) {
		this.countryId = countryId;
		this.country = country;
	}

	public long getCountryId() {
		return countryId;
	}
	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}



}
