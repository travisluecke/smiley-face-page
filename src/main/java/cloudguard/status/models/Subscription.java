package cloudguard.status.models;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Subscription {
	
	private String id;
	private String name;
	private List<Integer> services;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getServices() {
		return services;
	}

	public void setServices(List<Integer> services) {
		this.services = services;
	}

}
