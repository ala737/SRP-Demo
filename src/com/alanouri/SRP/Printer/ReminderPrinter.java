package com.alanouri.SRP.Printer;

import com.alanouri.SRP.Entity.Reminder;

import java.util.List;

public class ReminderPrinter {

    public void printReminders(List<Reminder> reminderList) {
        reminderList.forEach(reminder -> System.out.println(reminder));
    }

}
