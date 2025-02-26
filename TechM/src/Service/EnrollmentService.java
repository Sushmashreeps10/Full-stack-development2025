package Service;

import java.util.List;

import Model.Enrollment;

	interface EnrollmentService {	
		public int insertEnrollment(Enrollment s);
		public int updateEnrollment(Enrollment s, String id,String cid);
		public int deleteEnrollment(String id, String cid);
		public List<Enrollment> fetchAll();
		public Enrollment fetchOneEnrollment(String id, String cid);
}
