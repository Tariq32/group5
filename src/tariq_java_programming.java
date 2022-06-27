import java.util.Scanner;

public class tariq_java_programming {
    public static void main(String[] args) {
        System.out.println("Hello World !");
//     int a = 55;
//     int b = 65;
//     if (a >b)
//     {
//         System.out.println("A is  greater.");
//     }
//        else
//        {
//            System.out.println("B is greater.");
//        }
//            int num = 4;
//            if (num % 2 == 0)
//            {
//                System.out.println(+num+"Number is even");
//            }

        //A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
        // Ask user for their salary and year of service and print the net bonus amount.
//
//        int employee_years_of_service = 6;
//        int employee_salary = 50000;
//        if (employee_years_of_service > 5 ) {
//            System.out.println("You will receive a bonus of 5%");
//        }
//        else {
//            System.out.println(" No bonus for this employee ");
//        }


//        A school has following rules for grading system:
//        a. Below 25 - F
//        b. 25 to 45 - E
//        c. 45 to 50 - D
//        d. 50 to 60 - C
//        e. 60 to 80 - B
//        f. Above 80 - A
//        Ask user to enter marks and print the corresponding grade.

//
//        int mark = 40;
//        if (mark > 80)
//        {
//            System.out.println("Student has grade is an A");
//        } else if (mark >60 &&mark <= 80) {
//        System.out.println("Student grade is B ");
//        }  else if (mark >50 &&mark <= 60) {
//            System.out.println("Student grade is a C");
//
//        } else if (mark > 45 && mark<=50 ) {
//            System.out.println("Student grade is D");
//        } else if (mark>25 && mark<=45 ) {
//            System.out.println("Student grade is E");
//
//        } else if (mark< 25) {
//            System.out.println("Student grade is F");
//
//        }
//        Question # 01:
//        A student will not be allowed to sit in exam if his/her attendance is less than 75%. Take following input from user:
//• Number of classes held
//• Number of classes attended.
//• And print
//• percentage of class attended
//• Is student is allowed to sit in exam or not.


//        int attendance = 75;
//        if (attendance >=75)
//        {
//            System.out.println("Student will be able to take exam");
//        } else  {
//            System.out.println("Student is not allowed to take exam");
//
//        }
//        If x = 2, y = 5, z = 0
//        then find values of the following expressions:
//        a. x == 2
//        b. x!= 5
//        c. x!= 5 && y >= 5
//        d. z!= 0 || x == 2
//        e. !(y < 10)

//Question # 01:
////        A student will not be allowed to sit in exam if his/her attendance is less than 75%. Take following input from user:
////• Number of classes held
////• Number of classes attended.
////• And print
////• percentage of class attended
////• Is student is allowed to sit in exam or not.


        Scanner scan = new Scanner(System.in);
        System.out.println("enter your classes held ");
        int class_held = scan.nextInt();
        System.out.println("enter your classes attended ");
        int class_attended = scan.nextInt();
        int percentage = class_attended  *100/class_held;
        System.out.println(" Your percentage is:" +percentage);
        if (percentage >= 75)
        {
            System.out.println("You can take exam");
        }else
        {
            System.out.println("You can not take exam ");

        }
        System.out.println("Do you have medical condition");
            String  medicalCondition = scan.nextLine();
            if (medicalCondition.equals("Yes"))
            {
                System.out.println("You are allowed to take exam");
            } else
            {
                System.out.println("You are not allowed");
            }


//        Modify the above question to allow student to sit if he/she has medical cause.
//                Ask user if he/she has medical cause or not (‘Y' or 'N’) and print accordingly.





    }

    }




