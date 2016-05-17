package by.it.luksha.jd01_08.hospital;

import by.it.luksha.jd01_08.hospital.patient.Patient;
import java.util.ArrayList;

public class Hospital {
    //список пациентов
    ArrayList<Patient> listPatient;

    /**
     * Конструктор для госпиталя
     */
    public Hospital() {
        this.listPatient = new ArrayList<>();
    }

    /**
     * Метод возвращает список пациентов
     * @return ArrayList пациентов
     */
    public ArrayList<Patient> getListPatient() {
        return listPatient;
    }

    /**
     * Метод добавляет пациента в список пациентов
     * @param patient добавляемый пациент
     */
    public void addPatient(Patient patient) {
        listPatient.add(patient);
    }
}
