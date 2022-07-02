package behavioral.strategy;

import java.time.LocalDate;

/**
 * Klasa Employee stworzona na potrzeby wzorca Strategii. Będziemy sortować pracowników po dacie zatrudnienia.
 */
public class Employee {
    private String fullName;
    private LocalDate dateOfEmployment;

    public Employee(String fullName, LocalDate dateOfEmployment) {
        this.fullName = fullName;
        this.dateOfEmployment = dateOfEmployment;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(LocalDate dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    @Override
    public String toString() {
        return "Employee{" + "fullName='" + fullName + '\'' + ", dateOfEmployment=" + dateOfEmployment + '}';
    }

}
