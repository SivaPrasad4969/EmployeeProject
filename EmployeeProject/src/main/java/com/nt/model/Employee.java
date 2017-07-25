package com.nt.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="krishna")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Employee implements Serializable{
@GenericGenerator(name="g1",strategy="increment")
@Id
@GeneratedValue(generator="g1")
@Column(name="id",length=10)
private int id;
@Column(name="name",length=20)
private String name;
@Column(name="addres",length=25)
private String addres;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddres() {
	return addres;
}
public void setAddres(String addres) {
	this.addres = addres;
}

}
