package com.alanouri.SRP.Entity;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reminder {

    private int id;
    private String note;
    private LocalDateTime time;





    public Reminder() {
        // TODO Auto-generated constructor stub
    }


    public Reminder(int id, String note, LocalDateTime time) {
        super();
        this.id = id;
        this.note = note;
        this.time = time;
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



    @Override
    public String toString() {
        return "Reminder [id=" + id + ", note=" + note + ", time=" + time + "]";
    }
}
