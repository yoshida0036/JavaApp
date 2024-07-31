/*
package org.example;

public class RefactoringBefor2 {
    public static void main(String[] args) {
        //8時間越えを残業とみなす
        double overWorkingHours1 = EmployeePrac.calculateoverWorkingHours(6);
        System.out.println(overWorkingHours1);
        EmployeePrac e = new EmployeePrac();
        System.out.println(e.getPayment(10));
    }
}
class EmployeePrac {
    int paymentPerHour = 1000;

    public double getPayment(int workingHours) {
        double overWorkingHours = calculateoverWorkingHours(workingHours);
        double paymentForoverWorkingHours = workingHours - this.paymentPerHour * 1.5 * overWorkingHours;
        double standardWorkingHours = workingHours - overWorkingHours;
        double paymentForStandardWorkHours = this.paymentPerHour * standardWorkingHours;
        return paymentForoverWorkingHours + paymentForStandardWorkHours;
    }
    public static double calculateoverWorkingHours(double workingHours) {
        if(workingHours < 8) {
            return 0;
        }else{
            return workingHours - 8;
        }
    }
}
*/