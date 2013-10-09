package com.nowbeat.core.orm;


import com.nowbeat.core.AbstractNowBeatEntity;
import com.nowbeat.enums.Genre;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Configurable
@Entity
@Table(name = "TRACK", uniqueConstraints = { @UniqueConstraint(name = "I_TRACK", columnNames = {
		"TRACK" }) })
public class Track extends AbstractNowBeatEntity {

    @Column(name = "NIGHTCLUB", length = 50)
    @NotNull
    protected String nightclub;

    @Column(name = "TRACK", length = 50)
    @NotNull
    protected String track;

   	@Column(name = "TRACK_NAME", length = 90)
	@NotNull
	private String trackName;

    @Column(name = "ARTIST", length = 90)
    @NotNull
    private String artist;

    @Column(name = "GENRE", length = 10)
    @NotNull
    private Genre genre;

    @Column(name = "DJ", length = 30)
    @NotNull
    private String dj;

    @Column(name = "FILE_LOCATION", length = 100)
    @NotNull
    private String fileLocation;

	@Column(name = "SHORT_NAME", length = 15)
	@NotNull
	private String shortName;

    @Column(name = "UPLOADED_DATE")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "M-")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate uploadedDate;

    @Column(name = "UPLOADED_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @DateTimeFormat(style = "M-")
    private DateTime uploadedTime;

    @Column(name = "TRACK_FEE", precision = 20, scale = 3)
    private double trackFee;


    public String getNightclub() {
        return nightclub;
    }

    public void setNightclub(String nightclub) {
        this.nightclub = nightclub;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getDj() {
        return dj;
    }

    public void setDj(String dj) {
        this.dj = dj;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public LocalDate getUploadedDate() {
        return uploadedDate;
    }

    public void setUploadedDate(LocalDate uploadedDate) {
        this.uploadedDate = uploadedDate;
    }

    public DateTime getUploadedTime() {
        return uploadedTime;
    }

    public void setUploadedTime(DateTime uploadedTime) {
        this.uploadedTime = uploadedTime;
    }

    public double getTrackFee() {
        return trackFee;
    }

    public void setTrackFee(double trackFee) {
        this.trackFee = trackFee;
    }
}
