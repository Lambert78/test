import com.google.gson.annotations.SerializedName;

public class Payload {

	@SerializedName("selected-tax-id")
	String selectedtaxid;

	@SerializedName("auth-token")
	String authtoken;

	public String getSelectedtaxid() {
		return selectedtaxid;
	}

	public void setSelectedtaxid(String selectedtaxid) {
		this.selectedtaxid = selectedtaxid;
	}

	public String getAuthtoken() {
		return authtoken;
	}

	public void setAuthtoken(String authtoken) {
		this.authtoken = authtoken;
	}
}
