package services;

import java.util.List;
import java.util.Random;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import persistance.Course;
import persistance.Question;

/**
 * Session Bean implementation class BasicOps
 */
@Stateless
@LocalBean
public class BasicOps implements BasicOpsLocal,BasicOpsRemote {
	@PersistenceContext
	private EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public BasicOps() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void addQuestion(Question question) {
		entityManager.persist(question);
		
	}

	@Override
	public void updateQuestion(Question question) {
		entityManager.merge(question);
	
	}

	@Override
	public void deleteQuestion(Question question) {
		entityManager.remove(question);
		
	}

	@Override
	public void deleteQuestionById(int id) {
		entityManager.remove(findQuestionById(id));
		
	}

	@Override
	public Question findQuestionById(int id) {
		
		return entityManager.find(Question.class, id);
		
	}

	@Override
	public List<Question> findAllQuestions() {
		String jpql = "SELECT u FROM Question u";
		Query query = entityManager.createQuery(jpql);
		return query.getResultList();
	}

	@Override
	public void addCourse(Course course) {
		entityManager.persist(course);
		
	}

	@Override
	public void updateCourse(Course course) {
		entityManager.merge(course);
		
	}

	@Override
	public void deleteCourse(Course course) {
		entityManager.remove(course);
		
	}

	@Override
	public void deleteCourseById(int id) {
		entityManager.remove(findCourseById(id));
		
	}

	@Override
	public Course findCourseById(int id) {
		return entityManager.find(Course.class, id);
	}

	@Override
	public List<Course> findAllCourses() {
		String jpql = "SELECT u FROM Course u";
		Query query = entityManager.createQuery(jpql);
	
		return query.getResultList();
	}

	@Override
	public List<Question> Questionalea() {
		// TODO Auto-generated method stub
		//Random r = new Random();
		//int	x = 0;
		//int n =0;
		//x = (int)((n+1)*Math.random());
	//return entityManager.find(Question.class, r.nextInt(5));
	//int n=0 ;
	//while(x != 10)
		//x = (int)((n+1)*Math.random());
	//return entityManager.find(Question.class, x);
	 // return r;
		//return null;
	
	//String jpql = "Select q from question q limit 10";
	List query = entityManager.createQuery("select distinct q from Question q order by Rand()").setMaxResults(10).getResultList();
	//String jpql = ("select q from Question q order by Rand()");
	//Query query = entityManager.createQuery(jpql);
	//return query.setMaxResult(10).getResultList();
	return query;
	}

	@Override
	public Question aleat() {
		Random rnd = new Random();
		int nombre = rnd.nextInt(100);
		return entityManager.find(Question.class, nombre);
	}

	@Override
	public int aleaT() {
		Random rnd = new Random();
		int nombre = rnd.nextInt(100);
		System.out.println(nombre);
		return nombre;
	}



	

}
