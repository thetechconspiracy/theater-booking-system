/*
 * Written by Something Creative
 * Description
 */

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Movie {
  private String title;
  private String des;
  private LocalDateTime showtimes;
  private ArrayList<Review> reviews;
  private String rating;
  private Director director;
  private Actor[] mainCast;

  public Movie(String title, String des, String rating, String director, String cast){ // Only intended for use by LoadEventDatabase
    this.title = title;
    this.des = des;
    this.rating = rating;
    this.setDirector(director);
    this.setMainCast(cast);
  }

  public String toString(){
    return title + des + rating;
  }

  public String getTitle() {
    return title;
  }

  public String getDes() {
    return des;
  }

  public void setDes(String des) {
    this.des = des;
  }

  public LocalDateTime getShowtimes() {
    return showtimes;
  }

  public void setShowtimes(LocalDateTime showtimes) {
    this.showtimes = showtimes;
  }

  public ArrayList<Review> getReviews() {
    return reviews;
  }

  public void setReviews(ArrayList<Review> reviews) {
    this.reviews = reviews;
  }

  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public Director getDirector() {
    return director;
  }

  public void setDirector(Director director) {
    this.director = director;
  }

  public void setDirector(String director){
    ;
    //TODO: Convert string to Director
  }

  public Actor[] getMainCast() {
    return mainCast;
  }

  public void setMainCast(Actor[] mainCast) {
    this.mainCast = mainCast;
  }
  public void setMainCast(String mainCast){
    //TODO: Parse string, convert to cast
    ;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
