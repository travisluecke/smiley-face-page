package cloudguard.status.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import cloudguard.status.models.Event;
import cloudguard.status.models.Service;
import cloudguard.status.models.Status;

@Component
public class StatusService {
	
	public List<Service> getServices() {
		
		List<Service> services = new ArrayList<>();
		
		Service service1 = new Service();
		service1.setId("1");
		service1.setDescription("This is the cool software service.");
		service1.setName("LaLa Zippy");
		service1.setEvents(getEvents(service1));
		services.add(service1);
		
		Service service2 = new Service();
		service2.setId("2");
		service2.setDescription("Authorization service.");
		service2.setName("We Decide");
		service2.setEvents(getEvents(service2));
		services.add(service2);
		
		Service service3 = new Service();
		service3.setId("3");
		service3.setDescription("Math as a Service");
		service3.setName("Marc's corner");
		service3.setEvents(getEvents(service3));
		services.add(service3);
		
		return services;
	}

	public List<Event> getEvents(Service service) {
		List<Event> events = new ArrayList<>();
		Status status = new Status();
		Event event = new Event();

		if (service.getId().matches("1")) {
			
			status.setId("1");
			status.setStatusCode(1);
			status.setMessage("Scheduled Downtime.");
	
			event.setId("1");
			event.setDescription("Performing Service Upgrade, Scheduled Downtime.");
			event.setStartDate(new Date());
			event.setEndDate(new Date());
			event.setStatus(status);		
			
			events.add(event);
			
			return events;
					
		} else if ( service.getId().matches("2")) {
			
			status.setId("2");
			status.setStatusCode(2);
			status.setMessage("Unscheduled Downtime.");

			event.setId("3");
			event.setDescription("Service Failure due to hardware failure.");
			event.setStartDate(new Date());
			event.setEndDate(new Date());
			event.setStatus(status);		
			
			events.add(event);
			
			return events;
			
		} else {
			status.setId("0");
			status.setMessage("Nothing to report.");
			status.setStatusCode(0);
			
			event.setId("0");
			event.setDescription("No Events");
			event.setStatus(status);
			
			events.add(event);
			
			return events;
		}

	}

}
