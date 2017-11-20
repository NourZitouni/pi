package services;

import java.util.List;

import javax.ejb.Remote;

import persistance.Course;
import persistance.Question;
@Remote
public interface BasicOpsRemote {
	void addQuestion(Question question);

	void updateQuestion(Question question);

	void deleteQuestion(Question question);

	void deleteQuestionById(int id);

	Question findQuestionById(int id);

	List<Question> findAllQuestions();
	
	void addCourse(Course course);

	void updateCourse(Course course);

	void deleteCourse(Course course);

	void deleteCourseById(int id);

	Course findCourseById(int id);

	List<Course> findAllCourses();
	public List<Question> Questionalea();
	Question aleat();
	public int aleaT();
}
