package com.ellie.dto;

public class Single_DVD {
private String title;
private String releaseDate;
private int rating;
private String directorName;
private String studio;
private String userNotes;

public Single_DVD() {
	
}

public Single_DVD(String title, String releaseDate, int rating, String directorName, String studio, String userNotes) {
	super();
	this.title = title;
	this.releaseDate = releaseDate;
	this.rating = rating;
	this.directorName = directorName;
	this.studio = studio;
	this.userNotes = userNotes;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getReleaseDate() {
	return releaseDate;
}

public void setReleaseDate(String releaseDate) {
	this.releaseDate = releaseDate;
}

public int getRating() {
	return rating;
}

public void setRating(int rating) {
	this.rating = rating;
}

public String getDirectorName() {
	return directorName;
}

public void setDirectorName(String directorName) {
	this.directorName = directorName;
}

public String getStudio() {
	return studio;
}

public void setStudio(String studio) {
	this.studio = studio;
}

public String getUserNotes() {
	return userNotes;
}

public void setUserNotes(String userNotes) {
	this.userNotes = userNotes;
}

@Override
public String toString() {
	return "Single_DVD [title=" + title + ", releaseDate=" + releaseDate + ", rating=" + rating + ", directorName="
			+ directorName + ", studio=" + studio + ", userNotes=" + userNotes + "]";
}


}
