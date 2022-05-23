package com.inti.SpringSpringBootValidationThymeleaf.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table
@Data 
@NoArgsConstructor @AllArgsConstructor
public class Utilisateur 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private @NonNull String nom;
	
	@Column(unique = true)
	private @NonNull String username;
	
	private @NonNull String mdp;
	
	@ManyToMany
	@JoinTable (name = "Utilisateur_Role",joinColumns = @JoinColumn(name="id_Utilisateur"), 
	inverseJoinColumns = @JoinColumn(name="id_Role"))
	List<Role> listeRole;

}
