package com.internship.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class BMIRequest {
    @NotBlank(message = "Enter name: ")
    private String name;

    @NotBlank(message = "Enter gender (M/F): ")
    private String gender;

    @NotNull(message = "Enter weight in kilograms(kg): ")
    private Double mass;

    @NotNull(message = "Enter height in metres (m): ")
    private Double height;

    @NotNull(message = "Enter age: ")
    private Double age;

    @NotBlank(message = "Input activity level(none/light exercise/moderate exercise/heavy exercise): ")
    private String exercise;

    @NotNull(message = "Enter target weight: ")
    private Double target_weight;

    @NotNull(message = "Enter the time period by which you want to attain this weight(don't write unit): ")
    private double time;

    @NotBlank(message = "Enter unit(weeks/months/years): ")
    private String unit;

    public String getName() { //GET name
        return name;
    }
    public void setName(String name) { // SET name
        this.name = name;
    }

    public String getGender() { // GET gender
        return gender;
    }
    public void setGender(String gender) { // SET gender
        this.gender = gender;
    }

    public Double getMass() { // GET mass
        return mass;
    }
    public void setMass(Double mass) { // SET mass
        this.mass = mass;
    }

    public Double getHeight() { // GET height
        return height;
    }
    public void setHeight(Double height) { //SET height
        this.height = height;
    }

    public Double getAge() { //GET age
        return age;
    }
    public void setAge(Double age) { //SET age
        this.age = age;
    }

    public String getExercise() {//GET exercise
        return exercise;
    }
    public void setExercise(String exercise) { //SET exercise
        this.exercise = exercise;
    }

    public Double getTarget_weight() {
        return target_weight;
    }
    public void setTarget_weight(Double target_weight) {
        this.target_weight = target_weight;
    }

    public double getTime() {
        return time;
    }
    public void setTime() {
        this.time = time;
    }

    public String getUnit() {
        return unit;
    }
    public void setUnit() {
        this.unit = unit;
    }
}