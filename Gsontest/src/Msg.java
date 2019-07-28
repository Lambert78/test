import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Msg {

	Boolean activity;

	@SerializedName("selected-tax-id")
	String selectedtaxid;

	@SerializedName("auth-token")
	String authtoken;

	String err = null;

	Payload payload;

	List<Event> events;

	public Payload getPayload() {
		return payload;
	}

	public void setPayload(Payload payload) {
		this.payload = payload;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public Boolean getActivity() {
		return activity;
	}

	public void setActivity(Boolean activity) {
		this.activity = activity;
	}

	public String getErr() {
		return err;
	}

	public void setErr(String err) {
		this.err = err;
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
