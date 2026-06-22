package com.internship.demo.dto;

public class BMIResponse {
    private String name;
    private String gender;
    private Double mass;
    private Double height;
    private Double age;

    private String exercise;
    private Double BMIresult;

    private Double maintenanceCal;
    private Double BMR;
    private Double  protein_target;
    private Double cal_deficit;
    private String error;

    // Success response

    public BMIResponse(String gender, Double mass, Double height, Double age, String exercise, Double BMIresult, Double maintenanceCal, Double BMR, Double protein_target, Double  cal_deficit) {
        this.gender = gender;
        this.mass = mass;
        this.height = height;
        this.age = age;
        this.exercise = exercise;
        this.BMIresult = BMIresult;
        this.maintenanceCal = maintenanceCal;
        this.BMR = BMR;
        this.cal_deficit = cal_deficit;
        this.protein_target = protein_target;
        this.error = null;
    }

    // error response

    public BMIResponse(String error) {
        this.error = error;
    }

    //Getter
    public String getGender() {
        return gender;
    }
    public Double getMass() {
        return mass;
    }

    public Double getHeight() {
        return height;
    }

    public Double getAge() {
        return age;
    }

    public String getExercise() {
        return exercise;
    }

    public double getBMIresult() {
        return BMIresult;
    }
    public double getMaintenanceCal() {
        return maintenanceCal;
    }
    public double BMR()
    {
        return BMR;
    }

    public double getProtein_target() {
        return protein_target;
    }

    public double cal_deficit() {
        return cal_deficit;
    }
    public String getError() {
        return error;
    }
}
