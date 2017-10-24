package rm.rmrf.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String username;
	private String password;
	private String SUCCESS = "success";
	private String FAIL = "fail";

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() throws Exception {
		if (getUsername().equals("lai") && getPassword().equals("1234")) {
			Integer loginTimes = (Integer)ActionContext.getContext().getSession().get("loginTimes");
			System.out.println(loginTimes);
			ActionContext.getContext().getSession().put("loginTimes", ++loginTimes);
			return SUCCESS; 
		} else { 
			return FAIL;
		}
	}
	
	public void validate() {
		if(getUsername() == null || getUsername().trim().equalsIgnoreCase("")) {
			addFieldError("username","user.required");
		}else if(getPassword() == null || getPassword().trim().equals("")) {
			addFieldError("password", "password.required");
		}
	}
}
