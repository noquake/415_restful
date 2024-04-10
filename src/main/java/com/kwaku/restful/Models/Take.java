package com.kwaku.restful.Models;

public class Take {

    private String filmName;
    private String filmRating;
    private String filmNotes;

    public Take() {

    }

    public Take(String filmName, String rating, String notes) {
        this.filmName = filmName;
        this.filmRating = rating;
        this.filmNotes = notes;
    }

    public String getTakeName() {
        return filmName;
    }

    public String getTakeRating() {
        return filmRating;
    }

    public String getTakeNotes() {
        return filmNotes;
    }

    public void setTakeName(String filmName) {
        this.filmName = filmName;
    }

    public void setTakeRating(String filmRating) {
        this.filmRating = filmRating;
        System.out.printf("Film's rating has been changed to %S. \n\n", filmRating);
    }

    public void setTakeNotes(String filmNotes) {
        this.filmNotes = filmNotes;
        System.out.print("Your notes on this film have been updated");
    }

    public String listInfo() {
        String output = getTakeName() + ", " + getTakeRating() + ", " + getTakeNotes();
        return output;
    }
}
