package jrout.tutorial.hibernate.model;

// Generated Mar 15, 2015 6:09:27 PM by Hibernate Tools 4.0.0

import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 * Countries generated by hbm2java
 */
@Entity
@Table(name = "COUNTRIES")
@org.hibernate.annotations.Cache(usage= CacheConcurrencyStrategy.READ_ONLY)
public class Countries implements java.io.Serializable {

	private String countryId;
	private Regions regions;
	private String countryName;
	private Set<Locations> locationses = new HashSet<Locations>(0);

	public Countries() {
	}

	public Countries(String countryId) {
		this.countryId = countryId;
	}

	public Countries(String countryId, Regions regions, String countryName,
			Set<Locations> locationses) {
		this.countryId = countryId;
		this.regions = regions;
		this.countryName = countryName;
		this.locationses = locationses;
	}

	@Id
	@Column(name = "COUNTRY_ID", unique = true, nullable = false, length = 2)
	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REGION_ID")
	public Regions getRegions() {
		return this.regions;
	}

	public void setRegions(Regions regions) {
		this.regions = regions;
	}

	@Column(name = "COUNTRY_NAME", length = 40)
	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "countries")
	public Set<Locations> getLocationses() {
		return this.locationses;
	}

	public void setLocationses(Set<Locations> locationses) {
		this.locationses = locationses;
	}

}
