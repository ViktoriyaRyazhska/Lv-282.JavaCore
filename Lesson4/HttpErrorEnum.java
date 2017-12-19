package lesson4;

public enum HttpErrorEnum {
	
	Bad_Request (400),
	Unauthorized (401),
	Payment_Required (402),
	Forbidden (403),
	Not_Found (404),
	Method_Not_Allowed (405),
	Not_Acceptable (406),
	Proxy_Authentication_Required (407),
	Request_Timeout (408),
	Conflict (409),
	Gone (410),
	Length_Required (411),
	Precondition_Failed (412),
	Request_Entity_Too_Large (413),
	Request_URI_Too_Long (414),
	Unsupported_Media_Type (415),
	Requested_Range_Not_Satisfiable (416),
	Expectation_Failed (417),
	I_am_a_teapot (418),
	Authentication_Timeout (419),
	Method_Failure (420),
	Unprocessable_Entity (422),
	Locked (423),
	Failed_Dependency (424),
	Upgrade_Required (426),
	Precondition_Required (428),
	Too_Many_Requests (429),
	Request_Header_Fields_Too_Large (431),
	Login_Timeout (440),
	No_Response (444),
	Retry_With (449),
	Blocked_by_Windows_Parental_Controls (450),
	Unavailable_For_Legal_Reasons (451),
	Redirect (451),
	Request_Header_Too_Large (494),
	Cert_Error (495),
	No_Cert (496),
	HTTP_to_HTTPS (497),
	Token_expired (498),
	Client_Closed_Request (499);
	
	private final int error;

	HttpErrorEnum (int error) {
		this.error = error;
	}
		
	public int getError() {
		return error;
	}
}
