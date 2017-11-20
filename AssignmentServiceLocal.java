package services;

import javax.ejb.Local;

import persistance.Question;
import persistance.test;
@Local
public interface AssignmentServiceLocal {
	void assignQuestionToTest(Question question, test tests);

}
