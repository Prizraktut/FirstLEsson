package Lesson7_HW;

import java.util.Scanner;

public class MainOOP {

    public static void main(String[] args){

        findColorApple();
       // patientToTreat();
    }

    public static void patientToTreat(){
        String doctor;
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the treatment plan for you ");
        int plan = input.nextInt();

        Patient patient = new Patient(plan,"");
        doctor = patient.appointment(patient.treatmentPlan);

        if(doctor == "Surgeon"){
            Surgeon surgeon = new Surgeon();
            System.out.println(surgeon);
        } else if (doctor == "Therapist") {
            Therapist therapist = new Therapist();
            System.out.println(therapist);
        }
        else {
            Dentist dentist = new Dentist();
            System.out.println(dentist);
        }

    }

    public static void findColorApple () {

        Apple apple = new Apple();
        Apple.AppleNew appleNew = apple.createChanger();
        appleNew.colorNew("Black");
        System.out.println(apple.getColor());
    }
}
