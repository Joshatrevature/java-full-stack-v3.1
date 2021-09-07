package com.hibconnect;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "notes")
public class Note {

	@Id
	private int id;
	private String title;
	private String content;
	private Date created;
	
	public Note() {
		
	}
	
	public Note (String title, String content, Date created) {
		
	}
}
