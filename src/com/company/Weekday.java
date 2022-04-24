package com.company;

public class Weekday extends Student {
    private String stdfree_Day;
    private String Stdfree_Day;

    public void addDetails(String Stdname,String Stdddress,String Stdborn_year,String Stdpecialization,String Stdfree_Day) {
        this.StdName = StdName;
        this.StdAddress = StdAddress;
        this.StdSex = StdSex;
        this.Stdborn_year = Stdborn_year;
        this.StdSpecialization = Stdpecialization;
        this.Stdfree_Day = Stdfree_Day;
    }

    public String get CharSequence stdFree_Day(){
        return Stdfree_Day();
    }

    private CharSequence Stdfree_Day() {
    }

    public void set void stdFree_Day(String Stdfree_Day) {
        this.Stdfree_Day = Stdfree_Day;
    }
    @Override
    public void showDetails() {
        String stdName = null;
        String stdAddress = "";
        String stdSex = "";
        String stdSpecialization = null;
        String stdborn_year = null;
        System.out.println(" Student name "+ stdName +"\n Student Address "+stdAddress +"\n Gender "+ stdSex +"\n Student year "+stdborn_year +"\n Student Specialization "+ stdSpecialization +"\n Student Job Title "+ stdfree_Day );

    }

}

