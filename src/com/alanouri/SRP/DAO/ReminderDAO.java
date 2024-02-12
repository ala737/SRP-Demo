package com.alanouri.SRP.DAO;

import com.alanouri.SRP.Entity.Reminder;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

public class ReminderDAO {

    public void saveReminders(List<Reminder> reminderList, String fileName) throws FileNotFoundException {
        try (PrintStream writter = new PrintStream("C://Users/Ala Nouri/Desktop/notes/" + fileName)) {
            reminderList.forEach(reminder -> writter.println(reminder));
        }
    }

}
