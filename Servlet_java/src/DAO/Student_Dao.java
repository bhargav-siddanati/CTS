package DAO;

import java.util.*;
import Model.Student;

public interface Student_Dao {
	boolean insertData(Student std);
	boolean deleteData(String id);
	boolean updateData(Student std);
	List<Student> getData();
}
