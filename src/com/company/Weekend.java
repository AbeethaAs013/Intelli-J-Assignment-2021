package com.company;

public class Weekend extends Student {
    private String stdjob_Title;
    private String stdName;
    private String stdAddress;
    private String stdSex;
    private int stdborn_year;
    private String stdSpecialization;

    public void addDetails(String stdName,String stdAddress,String stdSex,int stdborn_year,String stdSpecialization,String stdjob_Title) {
        this.stdName = stdName;
        this.stdAddress = stdAddress;
        this.stdSex = stdSex;
        this.stdborn_year = stdborn_year;
        this.stdSpecialization = stdSpecialization;
        this.stdjob_Title = stdjob_Title;
    }

    public String get CharSequence stdJob_Title() {
        return stdjob_Title;
    }

    public void setstdJob_Title(String stdjob_Title) {
        this.stdjob_Title = stdjob_Title;
    }
    @Override
    public void showDetails() {
        System.out.println(" Student name "+ stdName +"\n Student Address "+stdAddress +"\n Gender "+ stdSex +"\n Student year "+stdborn_year +"\n Student Specialization "+ stdSpecialization +"\n Student Job Title "+ stdjob_Title );

    }

}

