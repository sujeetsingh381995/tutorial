package com.ziletech.college;

import java.util.Date;

public class College {

    private Date openingDate;
    private String collegeName;
    private String address;
    private int[] contactNumbers;
    public Course[] courses;
    public Student[] students;

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setContactNumbers(int[] contactNumbers) {
        for (int i = 0; i < contactNumbers.length; i++) {
            if (contactNumbers[i] < 0) {
                return;
            }
        }
        this.contactNumbers = contactNumbers;
    }

    public int[] getContactNumbers() {
        return contactNumbers;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setOpeningDate(Date date) {
        this.openingDate = date;
    }

    public Date getOpeningDate() {
        return this.openingDate;
    }

}
