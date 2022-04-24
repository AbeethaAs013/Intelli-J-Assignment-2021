package com.company;

abstract public class Student {
    protected String StdName;
    protected String StdAddress;
    protected String StdSex;
    protected String Stdborn_year;
    protected String StdSpecialization;

    public void addDetails(String StdName, String StdAddress, String StdSex, int Stdborn_year, String se, String Stdpecialization) {
        this.StdName = StdName;
        this.StdAddress = StdAddress;
        this.StdSex = StdSex;
        this.Stdborn_year = Stdborn_year;
        this.StdSpecialization = Stdpecialization;
    }

    public String generateID(){
        try {
            int randomPIN = (int)(Math.random()*90000)+1000;
            String x= String.format("%d",randomPIN);
            return ("IT"+ x);
        } catch (Exception IDInvalidException) {
            System.out.println(IDInvalidException);
        }
        return  generateID();
    }


    abstract public void showDetails();

    public void addMark(double m1, double m2, double m3, double m4, double m5) {


    }

}

