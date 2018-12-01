package com.example.antivirus.informatron;

public class HardwareObject {
    public  String hardware;
    public  String hardwareMeaning;


    public  HardwareObject(String key, String Value){
        this.hardware = key;
        this.hardwareMeaning = Value;
    }

    public String getHardware(){
        return  hardware;
    }

    public  String getHardwareMeaning(){
        return  hardwareMeaning;
    }

}
