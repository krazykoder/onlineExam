package com.JPA.onlineExam.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
//@Embeddable
public class Zip {

	@Id
	private int zipID;

	@OneToOne
	private Topic topic;

	@OneToOne
	private Score score;

}