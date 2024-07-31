/*
package org.example;

public class RefactoringAfter2 {
    public static void main(String[] args) {
        EmployeePrac employee = new EmployeePrac();
        //8時間越えを残業とみなす
        double overWorkingHours1 = employee.calculateOverWorkingHours(6);
        System.out.println(overWorkingHours1);
        System.out.println(employee.getPayment(10));
    }
}
class EmployeePrac {
    private static final int StandardWorkHours = 8;
    private static final double OverTimeMultpliter = 1.5;
    private static final int PaymentPerHour = 1000;

    public double getPayment(int workingHours) {
        double OverWorkingHours = calculateOverWorkingHours(workingHours);
        double paymentForOverWorkingHours = PaymentPerHour * OverTimeMultpliter;
        double standardWorkingHours = workingHours - OverWorkingHours;
        double paymentForStandardWorkHours = PaymentPerHour * standardWorkingHours;
        return paymentForOverWorkingHours + paymentForStandardWorkHours;
    }
    public double calculateOverWorkingHours(double workingHours) {
        if (workingHours <= StandardWorkHours) {
            return 0;
        } else {
            return workingHours - StandardWorkHours;
        }
    }
}
*/

package org.example;

public class RefactoringAfter2 {
    public static void main(String[] args) {
        // 8時間越えを残業とみなす
        double overWorkingHours1 = EmployeePrac.calculateoverWorkingHours(6);
        System.out.println(overWorkingHours1);
        EmployeePrac e = new EmployeePrac();
        System.out.println(e.getPayment(10));
    }
}
class EmployeePrac {
    int paymentPerHour = 1000;
    static final int STANDARD_WORK_HOURS = 8;

    public double getPayment(int workingHours) {
        double overWorkingHours = calculateoverWorkingHours(workingHours);
        double paymentForOverWorkingHours = paymentPerHour * 1.5 * overWorkingHours;
        double standardWorkingHours = workingHours - overWorkingHours;
        double paymentForStandardWorkHours = paymentPerHour * standardWorkingHours;
        return paymentForOverWorkingHours + paymentForStandardWorkHours;
    }
    public static double calculateoverWorkingHours(double workingHours) {
        if (workingHours < STANDARD_WORK_HOURS) {
            return 0;
        } else {
            return workingHours - STANDARD_WORK_HOURS;
        }
    }
}

