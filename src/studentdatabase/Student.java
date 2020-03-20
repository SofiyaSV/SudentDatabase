package studentdatabase;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastNAme;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourses = 600;
    private static int id = 1000;

    //Коструктор : предлагает ввести имя пользователя, год учащихся
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastNAme = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

        //System.out.println(firstName + " " + lastNAme + " " + gradeYear + " " + studentID);

    }

    //Создаем ID
    private void setStudentID() {
        //год  обучения + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }
    // Записываюсь на курсы
    public void enroll () {

     do {
        System.out.println("Enter course to enroll (Q to quit): ");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();
        if (!course.equals("Q")) {
            courses = courses + "\n   " + course;
            tuitionBalance = tuitionBalance + costOfCourses;
        } else {
            System.out.println("BREAK!");
            break;
        }
    } while (1 != 0);


        //System.out.println("ENROLLED IN : " + courses);
        //System.out.println("TUITION BALANCE : " + tuitionBalance);
    }
    //Просмотр баланса
    public void viewBalance () {
        System.out.println("Your balance is : $ " + tuitionBalance);
    }
    //Оплата обучения
    public void payTuition () {
        viewBalance();
        System.out.println("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    //Показать статус
    public String toString () {
        return "Name : " + firstName + " " + lastNAme +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $ " + tuitionBalance;
    }


}
