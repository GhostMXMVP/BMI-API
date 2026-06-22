package com.internship.demo.service;

import com.internship.demo.dto.BMIResponse;
import org.springframework.stereotype.Service;

@Service
public class BMIService {
    public BMIResponse calculate(String gender, Double age, Double mass, String exercise, Double height, Double target_weight, Double time, String unit) {
         Double new_height = height*100;
         Double bmi = Math.round((mass / (height * height)) * 100.0) / 100.0;
         Double bmr = 0.0;
         Double maintenanceCal = 0.0;
         if(gender.equalsIgnoreCase("male")) {
             bmr = (double)Math.round(10*mass+6.25*new_height-5*age+5);

             if(exercise.equalsIgnoreCase("little") || exercise.equalsIgnoreCase("none")) {
                 maintenanceCal = (double)Math.round(bmr*1.2);
             } else if(exercise.equalsIgnoreCase("light")) {
                 maintenanceCal = (double)Math.round(bmr*1.375);
             }  else if(exercise.equalsIgnoreCase("moderate")) {
                 maintenanceCal = (double)Math.round(bmr*1.55);
             } else if(exercise.equalsIgnoreCase("heavy")) {
                 maintenanceCal =(double)Math.round(bmr*1.725);
             }
         } else if(gender.equalsIgnoreCase("female")) {
             bmr = 10*mass+6.25*new_height-5*age-161;
                if(exercise.equalsIgnoreCase("little")||exercise.equalsIgnoreCase("none")) {
                    maintenanceCal = (double)Math.round(bmr*1.2);
                } else if(exercise.equalsIgnoreCase("light")) {
                    maintenanceCal = (double)Math.round(bmr*1.375);
                } else if(exercise.equalsIgnoreCase("moderate")) {
                    maintenanceCal = (double)Math.round(bmr*1.55);
                } else if(exercise.equalsIgnoreCase("heavy")) {
                    maintenanceCal = (double)Math.round(bmr*1.725);
                }
         }
         double protein_target = target_weight * 1.6;
         if(unit.equalsIgnoreCase("weeks")) {
             time = time * 7;
         } else if(unit.equalsIgnoreCase("months")) {
             time = time * 30;
         } else if(unit.equalsIgnoreCase("years")) {
             time = time * 365;
         }
         double weight_toLose = mass - target_weight;
         double cal_deficit_total = weight_toLose * 7700;
         double cal_deficit = cal_deficit_total/ time;


         return new BMIResponse(gender, mass, height, age, exercise,  bmi, maintenanceCal, bmr, protein_target, cal_deficit);
    }
}