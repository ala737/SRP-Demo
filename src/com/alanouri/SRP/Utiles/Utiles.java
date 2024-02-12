package com.alanouri.SRP.Utiles;

import com.alanouri.SRP.Entity.Reminder;
import com.alanouri.SRP.Validation.ReminderValidation;

import java.util.ArrayList;
import java.util.List;


public class Utiles {

    ReminderValidation validateReminder =  new ReminderValidation();

    public List<Reminder> getReminderList() {
        return reminderList;
    }

    public void setReminderList(List<Reminder> reminderList) {
        this.reminderList = reminderList;
    }

    private List<Reminder> reminderList = new ArrayList<>();


    public void addReminder(Reminder reminder) {
        boolean isValid =validateReminder.validateReminder(reminder);

        if (!isValid) {
            throw new RuntimeException("reminder entered is not valid; please check again");
        }

        reminderList.add(reminder);

    }

    public void removeReminder(int reminderNo) {
        reminderList.remove(--reminderNo);
    }
}
