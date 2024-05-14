import java.util.Scanner;
 //Student drade calculator
public class Codesoft_task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name :");
        char Name = sc.nextLine().charAt(0);
        System.out.println("Enter marks obtain in hindi :");
        double hindi = sc.nextDouble();
        System.out.println("Enter marks obtain in english :");
        double english = sc.nextDouble();
        System.out.println("Enter marks obtain in science :");
        double science = sc.nextDouble();
        System.out.println("Enter marks obtain in maths :");
        double maths = sc.nextDouble();
        System.out.println("Enter marks obtain in sst :");
        double sst = sc.nextDouble();
        double Totalmarks = hindi+english+science+maths+sst;
        System.out.println("Total marks = " +Totalmarks);
        double avgpercentage = Totalmarks/5;
        System.out.println("Average percentage = " +avgpercentage);
        if (avgpercentage>91 && avgpercentage<=100) {
            System.out.println("Grade = A+");
        }else if (avgpercentage>81 && avgpercentage<=90) {
            System.out.println("Grade = A");
        }else if (avgpercentage>71 && avgpercentage<=80) {
            System.out.println("Grade = B+");
        }else if (avgpercentage>61 && avgpercentage<=70) {
            System.out.println("Grade = B");
        }else if (avgpercentage>51 && avgpercentage<=60) {
            System.out.println("Grade = C++");
        }else if (avgpercentage>41 && avgpercentage<=50) {
            System.out.println("Grade = C");
        }else if(avgpercentage>31 && avgpercentage<=40)  {
            System.out.println("Grade = D");
        }else
        System.out.println("Fail");
    }
    
}
