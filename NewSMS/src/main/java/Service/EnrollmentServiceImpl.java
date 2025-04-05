package Service;

import Model.Enrollment;
import Repository.EnrollmentRepository;

public class EnrollmentServiceImpl implements EnrollmentService{
	private EnrollmentRepository repository;
	
	public EnrollmentServiceImpl() {
		super();
	}
	public EnrollmentServiceImpl(EnrollmentRepository repository) {
		this.repository = repository;
	}
	public int insertEnrollment(Enrollment e) {
		return repository.insertEnrollment(e);
	}

}
