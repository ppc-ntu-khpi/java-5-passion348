package domain;

/**
 * Представляє художника (Artist) як тип працівника.
 * <p>
 * Клас розширює {@link Employee} та додає специфічну для художника
 * характеристику — набір навичок (skills).
 */

public class Artist extends Employee {

    /**
     * Створює об'єкт Artist з повним набором даних.
     *
     * @param skiils масив навичок художника
     * @param name ім'я працівника
     * @param jobTitle посада
     * @param level рівень кваліфікації
     * @param dept відділ
     */

    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Створює художника тільки з навичками.
     *
     * @param skiils масив навичок
     */

    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    /**
     * Створює художника з порожнім набором навичок.
     * Ініціалізує масив фіксованого розміру 10.
     */

    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Повертає текстове представлення художника,
     * включаючи базову інформацію з Employee та список навичок.
     *
     * @return рядок з інформацією про художника
     */

    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    /**
     * Список навичок художника.
     */

    private String[] skiils;

    /**
     * Повертає навички у вигляді одного рядка,
     * розділеного комами.
     *
     * @return рядок зі списком навичок
     */

    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює новий масив навичок.
     *
     * @param skills новий список навичок
     */

    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Повертає сирий масив навичок.
     *
     * @return масив навичок
     */

    public String[] getSkillsLSist() {
        return skiils;
    }
}