package com.stackroute.pe2;

import java.lang.AssertionError;

public class StudentDetails {

    public double[] student(int noOfStudents,double[] studentArray){
        double[] result=new double[3];
        double min=0;
        double max=0;
        double sum=0;
        if(noOfStudents!=0) {
            for (int i = 0; i < studentArray.length; i++) {
                System.out.println("enter the marks of student:"+studentArray[i]);
            }
        }
        for(double num:studentArray){
            sum+=num;
        }
        for(int i=0;i<noOfStudents-1;i++){

            min=Math.min(studentArray[i],min);
            System.out.println(min);
        }


        for(int i=0;i<noOfStudents-1;i++){
            if(studentArray[i]>max){
                max=studentArray[i];
//                System.out.println(max);
            }
        }

        result[0]=sum/noOfStudents;
        System.out.println(result[0]);
        result[1]=min;
        System.out.println(result[1]);
        result[2]=max;
        System.out.println(result[2]);

        return result;
    }
}




