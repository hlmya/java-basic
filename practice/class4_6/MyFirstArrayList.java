import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.*;

import models.Classroom;
import models.Student;

public class MyFirstArrayList{
    static Scanner scanner = new Scanner(System.in);
    static SimpleDateFormat myFormat = new SimpleDateFormat("yyyyMMdd");
    static Classroom classroom = new Classroom();

    public static void main (String args[]){
        int userCommand;
        do{
            System.out.println("Please choose: 1.exit 2. add student 3.remove student 4.Print(sort by name) 5.Print(sort by Birthdate)");
            userCommand = scanner.nextInt();

            switch(userCommand){
                case 2:
                    boolean isAdded = true;
                    // do{
                        System.out.println("Student name: ");
                        String studentName = scanner.next();

                        System.out.println("Student's birthday: ");
                        Date studentBirthday = getValidDate();

                        System.out.println("Student's enrolment date: ");
                        Date enrolment = getValidDate();

                        Student s = new Student(studentName, studentBirthday, enrolment);
                        isAdded = classroom.addStudents(s);
                    // }while(!isAdded);
                    
                    System.out.println("The total students: " + classroom.howManyStudent());
                    break;
                case 3:
                    System.out.println("Who do want to remove?");
                    String nameRemove = scanner.next();
                    if(classroom.removeStudent(nameRemove)){
                        System.out.println("Removed");
                        System.out.println("Total number is: " + classroom.howManyStudent());
                    }else{
                        System.out.println("No removed");
                    }
                    break;
                case 4:
                    classroom.sortByName();
                    classroom.printArray();
                    break;
                case 5:
                    classroom.sortByBirthday();
                    classroom.printArray();
                default:
                    break;
            }
        }while(userCommand != 1);
    }
    // Check validate date
    public static Date getValidDate(){
        Date day = new Date();
        boolean validDate = false;
        while(!validDate){
            try{
                day = myFormat.parse(scanner.next());
                validDate = true;
            }catch(ParseException e){
                System.out.println("Wrong format, try again: ");
                validDate = false;
            }
        }
        return day;
    }
}