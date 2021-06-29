package com.florentina.entry;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Entry {
    private UUID id;
    private LocalDate creationDate;
    private  String message;

    public Entry(String message) {
        this.id = UUID.randomUUID();
        this.creationDate = LocalDate.now();
        setMessage(message);
    }


    private void setMessage(String message) {
       if(message.isEmpty()){
           throw new IllegalArgumentException("Cannot be empty");
       }else{
           this.message = message;
       };
    }


    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", creationDate=" + creationDate +
                ", message='" + message + '\'' +
                '}';
    }
}
