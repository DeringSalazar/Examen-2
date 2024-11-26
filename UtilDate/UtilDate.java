/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UtilDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class UtilDate {
    public static final DateTimeFormatter Date_Formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.getDefault());
    
    public static boolean validate(String date) {
        if (date == null || date.trim().isEmpty())
            throw new IllegalArgumentException("La fecha no puede ser nula");
        try {
            LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
    
    public static java.sql.Date tosqlDate(LocalDate date){
        if (date == null) 
            throw new IllegalArgumentException("La fecha no puede ser nula");
        return java.sql.Date.valueOf(date);
    }
    
    public static LocalDate tolocalDate(java.sql.Date date){
        if (date == null) 
            throw new IllegalArgumentException("La fecha no puede ser nula");
        return date.toLocalDate();
    }
    
    public static LocalDate tolocalDate(String date){
        if (date == null) 
            throw new IllegalArgumentException("La fecha no puede ser nula");
        try {
            return LocalDate.parse(date, Date_Formatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Formato de fecha invalido. Se esperado 'dd/MM/yyyy'.");
        }
    }
    
    public static String toString(LocalDate date){
        if (date == null) 
            throw new IllegalArgumentException("La fecha no puede ser nula");
        return date.format(Date_Formatter);
    }
}
