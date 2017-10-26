package rm.rmrf.convert;

import java.lang.reflect.Member;
import java.util.Map;

import ognl.DefaultTypeConverter;
import rm.rmrf.vo.User;

public class UserConvert extends DefaultTypeConverter {
	
	@Override
	public Object convertValue(Map context, Object value, Class toType) {
		System.out.println("I prove you invoke this line");
		System.out.println(toType);
		System.out.println(value); 
		if (toType == User.class) {
			System.out.println("I prove you invoke convert to user class");
			String[] params = (String[])value;
			User user = new User(params[0],params[1]);
			return user;
		} else if (toType == String.class) {
			System.out.println("i prove you invoke convert to String");
			User user = (User) value;
			return "username is " + user.getUsername() + ", and password is user" + user.getPassword();
		}
		return null;
	}
}
