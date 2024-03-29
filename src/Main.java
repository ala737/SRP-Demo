import com.alanouri.SRP.DAO.ReminderDAO;
import com.alanouri.SRP.Printer.ReminderPrinter;
import com.alanouri.SRP.Entity.Reminder;
import com.alanouri.SRP.Utiles.Utiles;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        Utiles utiles = new Utiles();
        ReminderPrinter reminderPrinter = new ReminderPrinter();

        Reminder reminder = new Reminder();
        Reminder work = new Reminder(101,"work on java", LocalDateTime.of(2024, 02, 10, 12, 10));
        Reminder play = new Reminder(102,"watch the game",LocalDateTime.of(2024, 02, 10, 18, 30));
        Reminder workout = new Reminder(103,"go to the gym",LocalDateTime.of(2022,02,11,6,15));
        Reminder playRami =  new Reminder(104,"Win Torh a rami",LocalDateTime.of(2024, 02, 10, 19, 0));


        utiles.addReminder(work);
        utiles.addReminder(play);
        utiles.addReminder(workout);
        utiles.addReminder(playRami);

        reminderPrinter.printReminders(utiles.getReminderList());
      //  reminder.saveReminders("Notes Of The Night");

        ReminderDAO reminderDAO = new ReminderDAO();
        reminderDAO.saveReminders(utiles.getReminderList(),"night notes");
    }
}