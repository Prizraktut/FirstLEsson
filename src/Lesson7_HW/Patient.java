package Lesson7_HW;

public class Patient {
    int treatmentPlan;
    String doctor;

    public Patient(int treatmentPlan, String doctor){
        this.treatmentPlan = treatmentPlan;
        this.doctor = doctor;
    }

    public String appointment(int treatmentPlan){
        Therapist therapist = new Therapist();
        doctor = therapist.appoint(treatmentPlan);
        return doctor;
    }

    @Override
    public String toString(){
        return doctor + " is treating you";
    }



}
