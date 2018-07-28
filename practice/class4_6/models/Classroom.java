package models;
import java.util.*;
import java.text.*;

public class Classroom{
    private ArrayList<Student> students;

    // Constructor
    public Classroom(){
        students = new ArrayList<Student>();
    }

    //Getter and setter
    public ArrayList<Student> getStudents(){
        return this.students;
    }
    public void setStudents(ArrayList<Student> students){
        this.students = students;
    }
    
    // Add method
    public boolean addStudents(Student s){
        boolean isAdded = true;
        //Check person exist or not
        if(students.size()>0){
            for(int i=0; i<students.size(); i++){
                // Return false if Person exist
                if(students.get(i).equalPerson(s)){
                    isAdded = false;
                }
            }
        }
        // Add student if isAdded true
        if(isAdded){
            students.add(s);
        }
        return isAdded;
    }

    // Remove method
    public boolean removeStudent(String name){
        boolean isRemove = false;
        for(int i=0; i< students.size(); i++){
            Student student = students.get(i);
            if(student.getName().equalsIgnoreCase(name)){
                students.remove(i);
                isRemove = true;
            }
        }
        return isRemove;
    }

    // How many people in array
    public int howManyStudent(){
        return students.size();
    }

    // Sort name follow alphabet
    public void sortByName(){
        for(int i=0; i<students.size()-1; i++){
            for(int j=i+1; j<students.size(); j++){
                if(students.get(i).getName().compareTo(students.get(j).getName()) > 0){
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
    }

    // Sort birthday
    public void sortByBirthday(){
        
    }
    
    // Print A
    public void printArray(){
        for(int i=0; i< students.size(); i++){
            System.out.println(students.get(i));
        }

        // another for loop
        // for(Student p: students){
        //     System.out.println(p);
        // }
    }
}