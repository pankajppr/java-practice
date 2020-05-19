package com.filemon.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name="FileDetails")
@Table(name="File_Details")
@XmlRootElement
public class FileDetails {
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String fileName;
	String fromPath;
	String toPath;
	Date timeStatusChanged;
	short status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFromPath() {
		return fromPath;
	}
	public void setFromPath(String fromPath) {
		this.fromPath = fromPath;
	}
	public String getToPath() {
		return toPath;
	}
	public void setToPath(String toPath) {
		this.toPath = toPath;
	}
	public short getStatus() {
		return status;
	}
	public void setStatus(short status) {
		this.status = status;
	}
	public Date getTimeStatusChanged() {
		return timeStatusChanged;
	}
	public void setTimeStatusChanged(Date timeStatusChanged) {
		this.timeStatusChanged = timeStatusChanged;
	}
	@Override
	public String toString() {
		return "FileDetails [id=" + id + ", fileName=" + fileName + ", fromPath=" + fromPath + ", toPath=" + toPath
				+ ", timeStatusChanged=" + timeStatusChanged + ", status=" + status + "]";
	}
}
