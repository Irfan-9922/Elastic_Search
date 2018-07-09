package com.dss.Hibernatedemo.onetomany;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="MEETING")
public class Meeting1 {
@Id

private int meetingId;
public int getMeetingId() {
	return meetingId;
}
public void setMeetingId(int meetingId) {
	this.meetingId = meetingId;
}
public Date getMeetingDate() {
	return meetingDate;
}
public void setMeetingDate(Date meetingDate) {
	this.meetingDate = meetingDate;
}
@Override
public String toString() {
	return "Meeting1 [meetingId=" + meetingId + ", meetingDate=" + meetingDate + ", meetingDescription="
			+ meetingDescription + "]";
}
public String getMeetingDescription() {
	return meetingDescription;
}
public void setMeetingDescription(String meetingDescription) {
	this.meetingDescription = meetingDescription;
}
public Meeting1( Date meetingDate, String meetingDescription) {
	super();
	this.meetingDate = meetingDate;
	this.meetingDescription = meetingDescription;
}
private Date meetingDate;
private String meetingDescription;

}
