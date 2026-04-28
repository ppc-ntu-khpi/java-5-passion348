package domain;

/**
 * Представляє менеджера, який є типом працівника.
 * <p>
 * Менеджер керує групою співробітників ({@link Employee}).
 */

public class Manager extends Employee {

    /**
     * Створює менеджера з повним набором даних.
     *
     * @param employees список підлеглих працівників
     * @param name ім'я менеджера
     * @param jobTitle посада
     * @param level рівень
     * @param dept відділ
     */

    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Повертає текстове представлення менеджера,
     * включаючи список імен підлеглих.
     *
     * @return рядок з інформацією про менеджера
     */

    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Створює менеджера з базовими даними.
     *
     * @param employees список підлеглих працівників
     */

    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Створює менеджера без початкових даних.
     * Ініціалізує масив підлеглих розміром 10.
     */

    public Manager() {
        super();
        employees = new Employee[10];
    }

    /**
     * Масив співробітників, якими керує менеджер.
     */

    private Employee[] employees;

    /**
     * Повертає список імен підлеглих як рядок.
     *
     * @return імена співробітників через кому
     */

    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює список підлеглих працівників.
     *
     * @param employees масив співробітників
     */

    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Повертає масив підлеглих працівників.
     *
     * @return масив Employee
     */

    public Employee[] getEmployeesList() {
        return employees;
    }
}