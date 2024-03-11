import java.util.Scanner;

public class Githubassignment
{
    private String nameOfEmp;
    private int empId;
    private double basicSalary;
    private double grossSalary;

    // Constructor to initialize the data members
    public Githubassignment(String nameOfEmp, int empId, double basicSalary) 
    {
        this.nameOfEmp = nameOfEmp;
        this.empId = empId;
        this.basicSalary = basicSalary;
        calculateGrossSalary();
    }

    // Method to calculate GrossSalary
    private void calculateGrossSalary() 
    {
        double hra = 0.25 * basicSalary; // HRA is 25% of BasicSalary
        double da = 0.4 * basicSalary;   // DA is 40% of BasicSalary
        grossSalary = basicSalary + hra + da;
    }

    // Getter method for NameOfEmp
    public String getNameOfEmp() 
    {
        return nameOfEmp;
    }

    // Getter method for EmpId
    public int getEmpId() 
    {
        return empId;
    }

    // Getter method for GrossSalary
    public double getGrossSalary() 
    {
        return grossSalary;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input details for Employee
        System.out.println("Enter NameOfEmp:");
        String nameOfEmp = scanner.nextLine();
        System.out.println("Enter Emp-Id:");
        int empId = scanner.nextInt();
        System.out.println("Enter BasicSalary:");
        double basicSalary = scanner.nextDouble();

        // Create Employee object
        Githubassignment employee = new Githubassignment(nameOfEmp, empId, basicSalary);

        // Query a) Display the NameOfEmp and GrossSalary of employees whose name starts with a consonant
        if (!employee.getNameOfEmp().matches("[aeiouAEIOU].*")) 
        {
            System.out.println("NameOfEmp: " + employee.getNameOfEmp() + ", GrossSalary: " + employee.getGrossSalary());
        }

        // Query b) Display the Emp-Id and GrossSalary of Employees whose Emp-Id is between 101 and 150
        if (employee.getEmpId() >= 101 && employee.getEmpId() <= 150) 
        {
            System.out.println("Emp-Id: " + employee.getEmpId() + ", GrossSalary: " + employee.getGrossSalary());
        }

        // Query c) Count the total number of Employees whose GrossSalary is less than 35000/-
        int count = (employee.getGrossSalary() < 35000) ? 1 : 0;
        System.out.println("Total number of Employees whose GrossSalary is less than 35000/-: " + count);
        scanner.close();
    }
}
