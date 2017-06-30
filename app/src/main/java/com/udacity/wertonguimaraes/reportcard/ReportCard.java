package com.udacity.wertonguimaraes.reportcard;

/**
 * Created by wertonguimaraes on 02/06/17.
 */

public class ReportCard {
    private static final int TOTAL_GRADE = 6;

    private String mStudentName;
    private double mPortuguese;
    private double mMath;
    private double mGeography;
    private double mHistory;
    private double mChemistry;
    private double mPhysical;

    public ReportCard(String studentName, double portuguese, double math, double geography,
                      double history, double chemistry, double physical) {
        this.mStudentName = studentName;
        this.mPortuguese = portuguese;
        this.mMath = math;
        this.mGeography = geography;
        this.mHistory = history;
        this.mChemistry = chemistry;
        this.mPhysical = physical;
    }

    public String getmStudentName() {
        return mStudentName;
    }

    public void setmStudentName(String mStudentName) {
        this.mStudentName = mStudentName;
    }

    public double getmPortuguese() {
        return mPortuguese;
    }

    public void setmPortuguese(double mPortuguese) {
        this.mPortuguese = mPortuguese;
    }

    public double getmMath() {
        return mMath;
    }

    public void setmMath(double mMath) {
        this.mMath = mMath;
    }

    public double getmGeography() {
        return mGeography;
    }

    public void setmGeography(double mGeography) {
        this.mGeography = mGeography;
    }

    public double getmHistory() {
        return mHistory;
    }

    public void setmHistory(double mHistory) {
        this.mHistory = mHistory;
    }

    public double getmChemistry() {
        return mChemistry;
    }

    public void setmChemistry(double mChemistry) {
        this.mChemistry = mChemistry;
    }

    public double getmPhysical() {
        return mPhysical;
    }

    public void setmPhysical(double mPhysical) {
        this.mPhysical = mPhysical;
    }

    public double average() {
        return (getmPortuguese() + getmMath() + getmGeography() + getmHistory()
                + getmChemistry() + getmPhysical()) / TOTAL_GRADE;
    }

    public String toString() {
        return String.format("Student Name: %s,\n" +
                        "Portuguese: %.2f,\n" +
                        "Math: %.2f,\n" +
                        "Geography: %.2f,\n" +
                        "History: %.2f,\n" +
                        "Chemistry: %.2f, \n" +
                        "Physical: %.2f,\n" +
                        "Average: %.2f",
                getmStudentName(),
                getmPortuguese(),
                getmMath(),
                getmGeography(),
                getmHistory(),
                getmChemistry(),
                getmPhysical(),
                average()
        );
    }
}
