package assignment2.organizations.spa;

public class Therapist {
    private String name;

    private String specialization;

    private int experience;

    public Therapist(String name, String specialization, int experience) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Therapist) {
            Therapist t = (Therapist) obj;
            return name.equals(t.name) && specialization.equals(t.specialization) && experience == t.experience;
        }

        return false;
    }
}
