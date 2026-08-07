package Interface_Example;

// Abstract Parent Class
abstract class Hospitals {
    // Encapsulated fields
    private int hosId;
    private String name;
    private String emNo; // Changed to String for phone number formatting
    
    // Constructor to initialize hospital details
    public Hospitals(int hosId, String name, String emNo) {
        this.hosId = hosId;
        this.name = name;
        this.emNo = emNo;
    }

    // Public getters to access private data
    public int getHosId() { return hosId; }
    public String getName() { return name; }
    public String getEmNo() { return emNo; }

    // Common non-abstract method shared by all subclasses
    public void printHospitalInfo() {
        System.out.println("\nHospital: " + name + " (ID: " + hosId + ") | Emergency No: " + emNo);
    }

    // Abstract method that subclasses MUST implement
    public abstract void displayRole();
}

// Subclass 1: Doctor
class Doctor extends Hospitals {
    private String specialization;

    public Doctor(int hosId, String name, String emNo, String specialization) {
        super(hosId, name, emNo); // Pass data to parent constructor
        this.specialization = specialization;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Doctor | Specialization: " + specialization);
    }
}

// Subclass 2: Patient
class Patient extends Hospitals {
    private String ailment;

    public Patient(int hosId, String name, String emNo, String ailment) {
        super(hosId, name, emNo);
        this.ailment = ailment;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Patient | Diagnosed with: " + ailment);
    }
}

// Subclass 3: Admin Staff
class Admin extends Hospitals {
    private String department;

    public Admin(int hosId, String name, String emNo, String department) {
        super(hosId, name, emNo);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Admin | Managing Department: " + department);
    }
}

// Main Execution Class
public class AbstractDemo {
    public static void main(String[] args) {
        // Creating subclass objects with specific details
        Hospitals doc = new Doctor(11, "ABC Hospital", "545465", "Cardiologist");
        Hospitals pat = new Patient(11, "ABC Hospital", "545465", "Fever");
        Hospitals adm = new Admin(12, "City Care Clinic", "911911", "Billing");

        // Executing common and polymorphic behaviors
        doc.printHospitalInfo();
        doc.displayRole();

        pat.printHospitalInfo();
        pat.displayRole();

        adm.printHospitalInfo();
        adm.displayRole();
    }
}
