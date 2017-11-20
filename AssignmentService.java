package services;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import persistance.Question;
import persistance.test;

/**
 * Session Bean implementation class AssignmentService
 */
@Stateless
@LocalBean
public class AssignmentService implements AssignmentServiceLocal,AssignmentServiceRemote {
	@PersistenceContext
	private EntityManager entityManager;

	@EJB
	private BasicOpsLocal basicOpsLocal;
    /**
     * Default constructor. 
     */
    public AssignmentService() {
        // TODO Auto-generated constructor stub
    }
	@Override
	public void assignQuestionToTest(Question question, test tests) {
		//question.setQuestion(test);
		//basicOpsLocal.updateQuestion(question);
		
	}

}
