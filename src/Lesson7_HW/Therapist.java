package Lesson7_HW;
public class Therapist {

    public String appoint(int treatmentPlan){

        if(treatmentPlan == 1){
            return "Surgeon";

        } else if (treatmentPlan == 2) {
            return "Dentist";
        }
        else {
            return "Therapist";
        }
    }

    @Override
    public String toString(){
        return "\tTherapist is treating you";

    }

}
