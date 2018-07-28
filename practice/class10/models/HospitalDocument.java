package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class HospitalDocument{
    // this will store all list doctor, patient and cases and handle cases
    // fiels 
    private List<Doctor> doctors;
    private List<Patient> patients;
    private List<Cases> cases;

    // Constructor
    public HospitalDocument(){
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
        this.cases = new ArrayList<>();
    }

    // add case into list
    public Cases createCases(Cases cases) {
		this.cases.add(cases);
        return cases;
	}

    // add doctor into list
    public Doctor createDoctors(Doctor doctor){
        this.doctors.add(doctor);
        return doctor;
    }

    // add patient into list
    public Patient createPatients(Patient patient){
        this.patients.add(patient);
        return patient;
    }

    // find List Doctor By Patient
    public List<Doctor> findListDoctorByPatient(Patient patient) {
        List<Doctor> listDoctor = new ArrayList<>();
		for (Cases c : this.cases) {
			if (c.getPatient().equals(patient)) {
				// return c.getDoctorList();
                listDoctor.addAll(c.getDoctorList());
			}
		}
		return listDoctor;
	}

    // find List Patient By Doctor
    public List<Patient> findListPatientByDoctor(Doctor doctor) {
		List<Patient> lstPatient = new ArrayList<>();
		for (Cases c : this.cases) {
			if (c.getDoctorList().contains(doctor)) {
				lstPatient.add(c.getPatient());
			}
		}
		return lstPatient;
	}



    //********* print method
    public void printDoctorList(){
		for(Doctor d: doctors){
			System.out.println(d);
		}
	}

    public void printPatientList(){
		for(Patient p: patients){
			System.out.println(p);
		}
	}

    public void printCasesList(){
		for(Cases c: cases){
			System.out.println(c);
		}
	}


}