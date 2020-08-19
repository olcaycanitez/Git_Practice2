package day40_CustomClassPractice;
/*
Offer
        Attribute:
            salary, Location, hasPTO, isFullTime, WFH, jobTitle, benifit
        Actions:
            setOfferInfo
            getOfferInfo
        MUST use this keyword
 */

public class Offer {

    double salary;
    String state;
    boolean hasPTO;
    boolean isFullTime;
    boolean isWFH;
    String jobTitle;
    boolean hasBenefit;

    public void setOfferInfo(double salary, String state, boolean hasPTO, boolean isFullTime, boolean isWFH, String jobTitle, boolean hasBenefit){
        this.salary = salary;
        this.state = state;
        this.hasPTO = hasPTO;
        this.isFullTime = isFullTime;
        this.isWFH = isWFH;
        this.jobTitle = jobTitle;
        this.hasBenefit = hasBenefit;
    }

    public void getOfferInfo(){// display offer info
        System.out.println("================================================================");
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Location: "+ state);
        System.out.println("================================================================");


    }





}
