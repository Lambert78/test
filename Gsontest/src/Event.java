import java.util.List;

public class Event {
	public String getSetvice() {
		return service;
	}
	
	public void setSetvice(String setvice) {
		this.service = setvice;
	}
	
	public List<String> getSubservices() {
		return subservices;
	}
	
	public void setSubservices(List<String> subservices) {
		this.subservices = subservices;
	}
	
	String service;
	List<String> subservices;
}
