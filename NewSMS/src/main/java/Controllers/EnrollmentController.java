package Controllers;

import Model.Enrollment;
import Service.EnrollmentServiceImpl;

public class EnrollmentController {

	private EnrollmentServiceImpl service;

	public EnrollmentController(EnrollmentServiceImpl service) {
		super();
		this.service = service;
	}

	public int insertEnrollment(Enrollment e) {
		return service.insertEnrollment(e);
	}

}
