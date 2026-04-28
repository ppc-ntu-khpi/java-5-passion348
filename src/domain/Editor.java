package domain;

/**
 * Представляє редактора (Editor), який є спеціалізацією художника.
 * <p>
 * Додає інформацію про спосіб редагування:
 * електронний або паперовий.
 */

public class Editor extends Artist {

    /**
     * Створює редактора з повним набором даних.
     *
     * @param electronicEditing чи використовується електронне редагування
     * @param skiils навички редактора
     * @param name ім'я
     * @param jobTitle посада
     * @param level рівень
     * @param dept відділ
     */

    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора з навичками та типом редагування.
     *
     * @param electronicEditing чи електронне редагування
     * @param skiils навички
     */

    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора з вказаним типом редагування та базовими налаштуваннями.
     *
     * @param electronicEditing чи електронне редагування
     */

    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Створює редактора з електронним редагуванням за замовчуванням.
     */

    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає текстове представлення редактора,
     * включаючи тип редагування.
     *
     * @return рядок з інформацією про редактора
     */

    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    /**
     * Визначає, чи використовує редактор електронне редагування.
     * true — електронне, false — паперове.
     */

    private boolean electronicEditing;

    /**
     * Повертає тип редагування.
     *
     * @return true якщо електронне редагування, false якщо паперове
     */

    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює тип редагування.
     *
     * @param electronic true для електронного, false для паперового
     */

    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}