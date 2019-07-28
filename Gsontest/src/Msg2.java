import com.google.gson.annotations.SerializedName;

public class Msg2 {
	Boolean activity;
/*
	@SerializedName("selected-tax-id")
	String selectedtaxid;

	@SerializedName("auth-token")
	String authtoken;
*/
	String newtoken;
	Event events;
	Payload payload;
	
	public Payload getPayload() {
		return payload;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}
	
	public String getNewtoken() {
		return newtoken;
	}

	public void setNewtoken(String newtoken) {
		this.newtoken = newtoken;
	}
	
	public Event getEvents() {
		return events;
	}

	public void setEvents(Event events) {
		this.events = events;
	}

	public Boolean getActivity() {
		return activity;
	}

	public void setActivity(Boolean activity) {
		this.activity = activity;
	}
/*
	public String getTaxId() {
		return selectedtaxid;
	}

	public void setTaxId(String taxId) {
		this.selectedtaxid = taxId;
	}

	public String getAuthtoken() {
		return authtoken;
	}

	public void setAuthtoken(String authtoken) {
		this.authtoken = authtoken;
	}
*/
}
