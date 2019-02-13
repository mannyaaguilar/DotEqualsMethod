package com.manny;

public class Student {

    private String regNumber;

    public Student(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Student){
            String regNumber = ((Student)obj).getRegNumber();
            if(regNumber !=null && regNumber.equals(this.getRegNumber())){
                return true;
            }
        }
        return false;
    }

    public int hashCode(){
        return this.regNumber.hashCode();
    }
}
