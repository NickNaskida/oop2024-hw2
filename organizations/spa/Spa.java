package assignment2.organizations.spa;

import assignment2.commons.Organization;
import assignment2.commons.Contactable;

import java.util.ArrayList;
import java.util.List;

public class Spa extends Organization implements Contactable {
    String mission;

    String email, address, phoneNumber;

    List<Therapist> therapists = new ArrayList<Therapist>();

    public Spa(String name, String mission) {
        setName(name);
        this.mission = mission;
    }

    public void addTherapist(Therapist t) {
        therapists.add(t);
    }

    public boolean removeTherapist(Therapist t) {
        boolean removed = false;

        for (int i = 0; i < therapists.size(); i++) {
            if (therapists.get(i).equals(t)) {
                therapists.remove(i);
                removed = true;
                break;
            }
        }

        return removed;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
