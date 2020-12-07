package MyDiary;

public class Diary {

        private Entry[] entries;
        private int noOfEntriesMade;

    public Diary(int numberOfEntries) {
    entries = new Entry[numberOfEntries];

    }



    public int getNumberOfDiaryEntries() {
        return entries.length;

    }

    public Entry[] getEntries() {
        return entries;
    }

    public void addNewEntry(Entry newDiaryEntry) {
        if(noOfEntriesMade < entries.length) {
            entries[noOfEntriesMade] = newDiaryEntry;
            noOfEntriesMade++;
        }
            else {
            /* Diary is full*/
        }
        }
    }

