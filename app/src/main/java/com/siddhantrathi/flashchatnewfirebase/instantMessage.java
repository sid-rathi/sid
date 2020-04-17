package com.siddhantrathi.flashchatnewfirebase;

public class instantMessage {
    public String message;
    private String author;

    instantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }
         public instantMessage() {


        }


        public String getMessage() {
            return message;
        }

        public String getAuthor() {
            return author;
        }

}
