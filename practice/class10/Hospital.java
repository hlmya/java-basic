import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import models.Cases;
import models.Doctor;
import models.Patient;
import models.HospitalDocument;

public class Hospital{
    static HospitalDocument document = new HospitalDocument();
    public static void main(String args[]){
        Doctor doctorA = new Doctor("A", new Date(), "", "", "", "");
        Doctor doctorB = new Doctor("B", new Date(), "", "", "", "");
        Doctor doctorC = new Doctor("C", new Date(), "", "", "", "");
        document.createDoctors(doctorA);
        document.createDoctors(doctorB);
        document.createDoctors(doctorC);

        Patient patientX = new Patient("X", new Date(), "", "");
        Patient patientY = new Patient("Y", new Date(), "", "");
        Patient patientZ = new Patient("Z", new Date(), "", "");
        document.createPatients(patientX);
        document.createPatients(patientY);
        document.createPatients(patientZ);

        Cases case1 = new Cases(patientX, doctorA, new Date(), new Date());
        Cases case2 = new Cases(patientX, doctorB, new Date(), new Date());
        Cases case3 = new Cases(patientZ, doctorB, new Date(), new Date());
        Cases case4 = new Cases(patientX, doctorB, new Date(), new Date());

        document.createCases(case1);
        document.createCases(case2);
        document.createCases(case3);
        document.createCases(case4);
        //test
        System.out.println("Doctor list");
        document.printDoctorList();

        System.out.println("Patient list");
        document.printPatientList();

        System.out.println("Cases list");
        document.printCasesList();

        List<Doctor> listDoctorByPatient = new ArrayList<>();
        listDoctorByPatient = document.findListDoctorByPatient(patientX);

        for(Doctor d: listDoctorByPatient){
			System.out.println("List doctor by patient: "+ d);
		}

        List<Patient> listPatientByDoctor = new ArrayList<>();
        listPatientByDoctor = document.findListPatientByDoctor(doctorB);

        for(Patient p: listPatientByDoctor){
			System.out.println("List Patient by doctor: "+ p);
		}
    }
}