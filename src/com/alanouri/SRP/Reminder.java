package com.alanouri.SRP;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reminder {

    private int id;
    private String note;
    private LocalDateTime time;

    private List<Reminder> reminderList = new ArrayList<>();



    public Reminder() {
        // TODO Auto-generated constructor stub
    }


    public Reminder(int id, String note, LocalDateTime time) {
        super();
        this.id = id;
        this.note = note;
        this.time = time;
    }


    public void addReminder(Reminder reminder) {
        boolean isValid = validateReminder(reminder);

        if (!isValid) {
            throw new RuntimeException("reminder entered is not valid; please check again");
        }

        reminderList.add(reminder);

    }

    public void removeReminder(int reminderNo) {
        reminderList.remove(--reminderNo);
    }


    public void printReminders() {
        reminderList.forEach(reminder -> System.out.println(reminder));
    }

    public void saveReminders(String fileName) throws FileNotFoundException {
        try (PrintStream writter = new PrintStream("C://Users/Ala Nouri/Desktop/notes/" + fileName)) {
            reminderList.forEach(reminder -> writter.println(reminder));

        }
    }


    public boolean validateReminder(Reminder reminder) {

        if (reminder.getId() <= 0) {
            return false;
        }

        if (reminder.getNote().isBlank()) {
            return false;
        }

        return true;
    }












    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public LocalDateTime getTime() {
        return time;
    }
    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public List<Reminder> getReminderList() {
        return reminderList;
    }


    public void setReminderList(List<Reminder> reminderList) {
        this.reminderList = reminderList;
    }


    @Override
    public String toString() {
        return "Reminder [id=" + id + ", note=" + note + ", time=" + time + "]";
    }
}
