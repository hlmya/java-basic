package models;
import java.util.Date;
public class Doctor extends Person{
    // new field
    private String doctorLicense;
    private String speciality;

    // constructor
    public Doctor(String name, Date birthday, String phone, String bloodType, String doctorLicense, String speciality){
        super(name, birthday, phone, bloodType);
        this.doctorLicense = doctorLicense;
        this.speciality = speciality;
    }
    //Getter and setter
    public void setDoctorLicense(String doctorLicense){
        this.doctorLicense = doctorLicense;
    }
    public String getDoctorLicense(){
        return this.doctorLicense;
    }

    public void setSpeciality(String speciality){
        this.speciality = speciality;
    }
    public String getSpeciality(){
        return this.speciality;
    }

    @Override
    public String toString(){
        return super.toString() + "Doctor Licence:"+ doctorLicense + " Specility: " + speciality;
    }

}