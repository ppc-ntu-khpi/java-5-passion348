package domain;

/**
 * Базовий клас, що представляє працівника компанії.
 * <p>
 * Містить загальну інформацію про працівника:
 * ім'я, посаду, рівень, відділ та унікальний ID.
 */

public class Employee {

    /**
     * Повертає текстове представлення працівника.
     *
     * @return рядок з інформацією про працівника
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

    // private static int employeesCount = 0;
    /**
     * Створює працівника з повним набором базових даних.
     * <p>
     * Рівень автоматично перевіряється і може бути тільки 1–3.
     *
     * @param name ім'я працівника
     * @param jobTitle посада
     * @param level рівень (1–3)
     * @param dept відділ
     */

    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Створює працівника з випадковим ID.
     * <p>
     * ID генерується в діапазоні 0–999.
     */

    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Встановлює посаду працівника.
     *
     * @param job назва посади
     */

    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Повертає посаду працівника.
     *
     * @return назва посади
     */

    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім'я працівника.
     *
     * @return ім'я
     */

    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень працівника.
     * <p>
     * Допустимі значення: 1–3. Інші значення замінюються на 1.
     *
     * @param level рівень працівника
     */

    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Повертає рівень працівника.
     *
     * @return рівень (1–3)
     */

    public int getLevel() {
        return level;
    }

    /**
     * Повертає відділ працівника.
     *
     * @return назва відділу
     */

    public String getDept() {
        return dept;
    }

    /**
     * Встановлює відділ працівника.
     *
     * @param dept назва відділу
     */

    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім'я працівника.
     * <p>
     * Ім'я перевіряється регулярним виразом.
     * Якщо воно некоректне — встановлюється "John Doe".
     *
     * @param name ім'я працівника
     */

    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}