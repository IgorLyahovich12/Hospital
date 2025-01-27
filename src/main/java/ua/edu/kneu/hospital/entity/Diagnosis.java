package ua.edu.kneu.hospital.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Diagnosis {
    private String initialDiagnosis; // Початковий діагноз
    private String finalDiagnosis; // Остаточний діагноз
    private String severity; // Ступінь тяжкості (легкий, середній, важкий)
    private String doctorNotes; // Примітки лікаря
    private boolean chronic; // Чи є діагноз хронічним (true/false)
    private String treatmentPlan; // План лікування
}
