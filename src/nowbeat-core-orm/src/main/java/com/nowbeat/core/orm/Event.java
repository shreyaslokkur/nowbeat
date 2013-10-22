package com.nowbeat.core.orm;


import com.nowbeat.core.AbstractNowBeatEntity;
import com.nowbeat.enums.Weekend;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Configurable
@Entity
@Table(name = "EVENT", uniqueConstraints = { @UniqueConstraint(name = "I_EVENT", columnNames = {
		"NIGHTCLUB","EVENT" }) })
public class Event extends AbstractNowBeatEntity {

    @Column(name = "NIGHTCLUB", length = 50)
    @NotNull
    protected String nightclub;

    @Column(name = "EVENT", length = 50)
    @NotNull
    protected String event;

   	@Column(name = "EVENT_NAME", length = 90)
	@NotNull
	private String eventName;

    @Column(name = "GOOGLE_EVENT_ID", length = 50)
    @NotNull
    protected String googleEventId;

    @Column(name = "FACEBOOK_EVENT_ID", length = 50)
    @NotNull
    protected String facebookEventId;

	@Column(name = "SHORT_NAME", length = 15)
	@NotNull
	private String shortName;

    /*@Column(name = "EVENT_DATE")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "M-")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate eventDate;*/

    /*@Column(name = "EVENT_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    @DateTimeFormat(style = "M-")
    private DateTime eventTime;*/

    @Column(name = "ENTRY_FEE_COUPLES", precision = 20, scale = 3)
    private double entryFeeCouples;

    @Column(name = "ENTRY_FEE_STAGS", precision = 20, scale = 3)
    private double entryFeeStags;

    @Column(name = "COVER_CHARGE", precision = 20, scale = 3)
    private double coverCharge;

    @Column(name = "IS_COUPLES_ONLY", length = 1)
    @NotNull
    private boolean isCouplesOnly;

    /*public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }*/

    /*public DateTime getEventTime() {
        return eventTime;
    }

    public void setEventTime(DateTime eventTime) {
        this.eventTime = eventTime;
    }*/

    public boolean isCouplesOnly() {
        return isCouplesOnly;
    }

    public void setCouplesOnly(boolean couplesOnly) {
        isCouplesOnly = couplesOnly;
    }

    public double getEntryFeeStags() {
        return entryFeeStags;
    }

    public void setEntryFeeStags(double entryFeeStags) {
        this.entryFeeStags = entryFeeStags;
    }

    public String getNightclub() {
        return nightclub;
    }

    public void setNightclub(String nightclub) {
        this.nightclub = nightclub;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

    public String getGoogleEventId() {
        return googleEventId;
    }

    public void setGoogleEventId(String googleEventId) {
        this.googleEventId = googleEventId;
    }

    public String getFacebookEventId() {
        return facebookEventId;
    }

    public void setFacebookEventId(String facebookEventId) {
        this.facebookEventId = facebookEventId;
    }

    public double getEntryFeeCouples() {
        return entryFeeCouples;
    }

    public void setEntryFeeCouples(double entryFeeCouples) {
        this.entryFeeCouples = entryFeeCouples;
    }

    public double getCoverCharge() {
        return coverCharge;
    }

    public void setCoverCharge(double coverCharge) {
        this.coverCharge = coverCharge;
    }
}
