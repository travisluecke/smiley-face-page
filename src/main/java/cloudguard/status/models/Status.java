package cloudguard.status.models;

import org.springframework.stereotype.Component;

@Component
public class Status {
	
	private String id;
	private int statusCode; //0 = green, 1 = degraded, 2 = scheduled down, 3 = un-scheduled down
	private String message;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	

}
