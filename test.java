package persistance;


import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Entity;
/**
 * Entity implementation class for Entity: test
 *
 */
@Entity

public class test implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int note;
	@ManyToMany
	private List<Question>listquestion;
	
	public List<Question> getListquestion() {
		return listquestion;
	}

	public void setListquestion(List<Question> listquestion) {
		this.listquestion = listquestion;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	private static final long serialVersionUID = 1L;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public test() {
		super();
	}

	public test(int note) {
		super();
		this.note = note;
	}

   
	
}
