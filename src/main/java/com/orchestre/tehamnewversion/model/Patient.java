package com.orchestre.tehamnewversion.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="person_id")
    @JsonProperty("person_id") 
    private Long id;
	
	@Basic
	@Column(name = "PatientID", length = 30, nullable=false)
	@JsonProperty("PatientID") 
 	private Integer PatientID;
 	
	@Basic
	@Column(name = "Vorgeschichte", length = 30, nullable=false)
	@JsonProperty("Vorgeschichte") 
    private String Vorgeschichte;
    
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
    private Date Geburtsdatum ;
    
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

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getPersonID() {
		return id;
	}

	public void setPersonID(Long personID) {
		id = personID;
	}

	public Integer getPatientID() {
		return PatientID;
	}

	public void setPatientID(Integer patientID) {
		PatientID = patientID;
	}

	public String getVorgeschichte() {
		return Vorgeschichte;
	}

	public void setVorgeschichte(String vorgeschichte) {
		Vorgeschichte = vorgeschichte;
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

	public Patient(String vorgeschichte, String nachname, String vorname, Date geburtsdatum, String emailAdresse,
			Integer telefonnummer, String adresse, String userkennung, String passwort) {
		super();
		Vorgeschichte = vorgeschichte;
		Nachname = nachname;
		Vorname = vorname;
		Geburtsdatum = geburtsdatum;
		EmailAdresse = emailAdresse;
		Telefonnummer = telefonnummer;
		Adresse = adresse;
		Userkennung = userkennung;
		Passwort = passwort;
	}

	@Override
	public String toString() {
		return "Patient [PersonID=" + id + ", PatientID=" + PatientID + ", Vorgeschichte=" + Vorgeschichte
				+ ", Nachname=" + Nachname + ", Vorname=" + Vorname + ", Geburtsdatum=" + Geburtsdatum
				+ ", EmailAdresse=" + EmailAdresse + ", Telefonnummer=" + Telefonnummer + ", Adresse=" + Adresse
				+ ", Userkennung=" + Userkennung + ", Passwort=" + Passwort + "]";
	}
	
	
    
    
    
    

}
