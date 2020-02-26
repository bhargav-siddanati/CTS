package DAO;

import java.util.*;
import Model.Student;

public interface Student_Dao {
	boolean insertData(Student std);
	void deleteData(String id);
	void updateData(String id);
	List<Student> getData();
}
