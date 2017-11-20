package services;

import javax.ejb.Remote;

import persistance.Question;
import persistance.test;
@Remote
public interface AssignmentServiceRemote {
	void assignQuestionToTest(Question question, test tests);
}
