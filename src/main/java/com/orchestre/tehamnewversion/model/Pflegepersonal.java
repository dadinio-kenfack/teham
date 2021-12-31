package com.orchestre.tehamnewversion.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Pflegepersonal {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PersonID")
    @JsonProperty("PersonID")
    private Integer PersonID;
	
	@Basic
	@Column(name = "PflegepersonalID", length = 30, nullable=false)
	@JsonProperty("PflegepersonalID") 
 	private Integer PflegepersonalID;
	
	@Basic
	@Column(name = "MatrikulPflegepersonal", length = 30, nullable=false)
	@JsonProperty("MatrikulPflegepersonal") 
    private Integer MatrikulPflegepersonal;
	
	@Basic
	@Column(name = "Nachname", length = 30, nullable=false)
	@JsonProperty("Nachname") 
    private String Nachname;
	
	@Basic
	@Column(name = "Vorname", length = 30, nullable=false)
	@JsonProperty("Vorname") 
    private String Vorname;
	
	@Basic
	@Column(name = "Geburtsdatum", length = 30, nullable=false)
	@JsonProperty("Geburtsdatum") 
    private Date Geburtsdatum;
	
	@Basic
	@Column(name = "EmailAdresse", length = 50, nullable=false)
	@JsonProperty("EmailAdresse") 
    private String EmailAdresse;
	
	@Basic
	@Column(name = "Telefonnummer", length = 30, nullable=false)
	@JsonProperty("Telefonnummer") 
    private Integer Telefonnummer;
	
	@Basic
	@Column(name = "Adresse", length = 30, nullable=false)
	@JsonProperty("Adresse") 
    private String Adresse;
	
	@Basic
	@Column(name = "Userkennung", length = 30, nullable=false)
	@JsonProperty("Userkennung") 
    private String Userkennung;
	
	@Basic
	@Column(name = "Passwort", length = 30, nullable=false)
	@JsonProperty("Passwort") 
    private String Passwort;
    
    
    
    
	public Pflegepersonal() {
		super();
	}
	
	
	
	public Pflegepersonal(Integer pflegepersonalID, Integer matrikulPflegepersonal, String nachname, String vorname,
			Date geburtsdatum, String emailAdresse, Integer telefonnummer, String adresse, String userkennung,
			String passwort) {
		super();
		PflegepersonalID = pflegepersonalID;
		MatrikulPflegepersonal = matrikulPflegepersonal;
		Nachname = nachname;
		Vorname = vorname;
		Geburtsdatum = geburtsdatum;
		EmailAdresse = emailAdresse;
		Telefonnummer = telefonnummer;
		Adresse = adresse;
		Userkennung = userkennung;
		Passwort = passwort;
	}



	public Integer getPersonID() {
		return PersonID;
	}
	public void setPersonID(Integer personID) {
		PersonID = personID;
	}
	public Integer getPflegepersonalID() {
		return PflegepersonalID;
	}
	public void setPflegepersonalID(Integer pflegepersonalID) {
		PflegepersonalID = pflegepersonalID;
	}
	public Integer getMatrikulPflegepersonal() {
		return MatrikulPflegepersonal;
	}
	public void setMatrikulPflegepersonal(Integer matrikulPflegepersonal) {
		MatrikulPflegepersonal = matrikulPflegepersonal;
	}
	public String getNachname() {
		return Nachname;
	}
	public void setNachname(String nachname) {
		Nachname = nachname;
	}
	public String getVorname() {
		return Vorname;
	}
	public void setVorname(String vorname) {
		Vorname = vorname;
	}
	public Date getGeburtsdatum() {
		return Geburtsdatum;
	}
	public void setGeburtsdatum(Date geburtsdatum) {
		Geburtsdatum = geburtsdatum;
	}
	public String getEmailAdresse() {
		return EmailAdresse;
	}
	public void setEmailAdresse(String emailAdresse) {
		EmailAdresse = emailAdresse;
	}
	public Integer getTelefonnummer() {
		return Telefonnummer;
	}
	public void setTelefonnummer(Integer telefonnummer) {
		Telefonnummer = telefonnummer;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public String getUserkennung() {
		return Userkennung;
	}
	public void setUserkennung(String userkennung) {
		Userkennung = userkennung;
	}
	public String getPasswort() {
		return Passwort;
	}
	public void setPasswort(String passwort) {
		Passwort = passwort;
	}



	@Override
	public String toString() {
		return "Pflegepersonal [PersonID=" + PersonID + ", PflegepersonalID=" + PflegepersonalID
				+ ", MatrikulPflegepersonal=" + MatrikulPflegepersonal + ", Nachname=" + Nachname + ", Vorname="
				+ Vorname + ", Geburtsdatum=" + Geburtsdatum + ", EmailAdresse=" + EmailAdresse + ", Telefonnummer="
				+ Telefonnummer + ", Adresse=" + Adresse + ", Userkennung=" + Userkennung + ", Passwort=" + Passwort
				+ "]";
	}
    
}
