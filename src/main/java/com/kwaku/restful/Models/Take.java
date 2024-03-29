package com.kwaku.restful.Models;

public class Take {

    private String filmName;
    private String filmRating;
    private String filmNotes;

    public Take() {

    }

    public Take Interstellar = new Take("Interstellar", "S", "Awesome");

    public Take(String filmName, String rating, String notes) {
        this.filmName = filmName;
        this.filmRating = rating;
        this.filmNotes = notes;
    }

    public String getfilmName() {
        return filmName;
    }

    public String getfilmRating() {
        return filmRating;
    }

    public String getfilmNotes() {
        return filmNotes;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public void setFilmRating(String filmRating) {
        this.filmRating = filmRating;
        System.out.printf("Film's rating has been changed to %S. \n\n", filmRating);
    }

    public void setFilmNotes(String filmNotes) {
        this.filmNotes = filmNotes;
        System.out.print("Your notes on this film have been updated");
    }

    public String listInfo() {
        String output = getfilmName() + ", " + getfilmRating() + ", " + getfilmNotes();
        return output;
    }
}
