package models;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Cases{
    // fields
    private Patient patient;
    private List<Doctor> doctorByPatient;
    private Date entryDate;
    private Date exitDate;

    // Constructor
    public Cases(Patient patient, Doctor doctor, Date entryDate, Date exitDate){
        doctorByPatient = new ArrayList<Doctor>();
        this.doctorByPatient.add(doctor);

        this.patient = patient;
        this.entryDate = entryDate;
        this.exitDate = exitDate;
    }

    // getter and setter
    public Patient getPatient(){
        return this.patient;
    }
    public void setPatient(Patient patient){
        this.patient = patient;
    }

    public List<Doctor> getDoctorList(){
        return this.doctorByPatient;
    }
    public void setDoctorList(List<Doctor> doctorByPatient){
        this.doctorByPatient = doctorByPatient;
    }

    public void addDoctorListByPatient(Doctor doctor){
        this.doctorByPatient.add(doctor);
    }

    public void setEntryDate(Date entryDate){
        this.entryDate = entryDate;
    }
    public Date getEntryDate(){
        return this.entryDate;
    }

    public void setExitDate(Date exitDate){
        this.exitDate = exitDate;
    }
    public Date getExitDate(){
        return this.exitDate;
    }

    @Override
    public String toString(){
        return "Patient: " + patient.toString() + "\nListDoctor " + doctorByPatient.toString();
    }
}