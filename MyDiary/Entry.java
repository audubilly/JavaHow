package MyDiary;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entry {

    private String entryTitle;
    private LocalDateTime entryDateAndTime;
    private  String entryBody;

    public Entry(String entryTitle) {
        this.entryTitle = entryTitle;
        entryDateAndTime = LocalDateTime.now(); // to set local time in the constructor on creation time.
        this.entryBody = entryBody;
    }

    public void setEntryTitle(String entryTitle) {
        this.entryTitle = entryTitle;
    }

    public String getEntryTitle() {
        return entryTitle;
    }

    public LocalDateTime getEntryDateAndTime() {
        return  LocalDateTime.now();
    }

    public String getEntryBody() {
        return entryBody;
    }

    public void setEntryBody(String entryBody) {
        this.entryBody = entryBody;
    }

    public String viewEntry() {
        String preview = ("Title: " + getEntryTitle() + "\n" + "Entry Date: "+ getEntryDateAndTime().toLocalDate()+ "\n" + "Entry Body: " + getEntryBody());
        return preview;
    }


    @Override
    public String toString(){
        return viewEntry();
    }
}