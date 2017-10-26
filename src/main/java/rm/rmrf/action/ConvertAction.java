package rm.rmrf.action;

import java.lang.reflect.Member;
import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.sun.corba.se.spi.servicecontext.UEInfoServiceContext;

import ognl.DefaultTypeConverter;
import rm.rmrf.vo.User;

public class ConvertAction {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user; 
	}

	public String execute() throws Exception {
		return Action.SUCCESS;
	}
}