package persistance;

import java.io.Serializable;
import javax.persistence.*;



/**
 * Entity implementation class for Entity: Question
 *
 */
@Entity

public class Question implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String question;
	private String prop1;
	private String prop2;
	private String prop3;
	private String ra;
	
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private Person person;

	public Question( String question, String prop1, String prop2, String prop3, String ra) {
		super();
		
		this.question = question;
		this.prop1 = prop1;
		this.prop2 = prop2;
		this.prop3 = prop3;
		this.ra = ra;
	}
	public Question(int id, String question, String prop1, String prop2, String prop3, String ra) {
		super();
		this.id=id;
		this.question = question;
		this.prop1 = prop1;
		this.prop2 = prop2;
		this.prop3 = prop3;
		this.ra = ra;
	}

	public Question() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getProp1() {
		return prop1;
	}

	public void setProp1(String prop1) {
		this.prop1 = prop1;
	}

	public String getProp2() {
		return prop2;
	}

	public void setProp2(String prop2) {
		this.prop2 = prop2;
	}

	public String getProp3() {
		return prop3;
	}

	public void setProp3(String prop3) {
		this.prop3 = prop3;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

  
	
}
