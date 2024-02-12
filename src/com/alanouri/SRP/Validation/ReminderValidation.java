package com.alanouri.SRP.Validation;

import com.alanouri.SRP.Entity.Reminder;

public class ReminderValidation {

    public boolean validateReminder(Reminder reminder) {

        if (reminder.getId() <= 0) {
            return false;
        }

        if (reminder.getNote().isBlank()) {
            return false;
        }

        return true;
    }
}
