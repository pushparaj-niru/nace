/**
 * 
 */
package com.nace.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author PUSHPARAJ
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "nacedtls")
public class NACEEntity implements Serializable{
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long orderNo;
	@Column(name="level")
	private int level;
	@Column(name = "code")
	private String code;
	@Column(name = "parent")
	private String parent;	
	@Column(name = "description")
	private String description;
	@Column(name = "iteminclude",columnDefinition = "TEXT")
	private String itemInclude;
	@Column(name = "itemalsoinclude",columnDefinition = "TEXT")
	private String itemAlsoInclude;
	@Column(name = "rulings")
	private String rulings;
	@Column(name = "itemexclude",columnDefinition = "TEXT")
	private String itemExclude;
	@Column(name = "referencetoISIC")
	private String referenceToISIC;
	
	
	
	
}
