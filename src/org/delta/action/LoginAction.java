package org.delta.action;
import org.apache.commons.lang3.StringUtils;
import org.delta.model.User;
import com.opensymphony.xwork2.ActionSupport;
public class LoginAction extends ActionSupport {
	
	private User user;      //---------------New style, using model object-------->
	private String userId;   
	private String password;
	
	public void validate() {
		if(StringUtils.isEmpty(getUserId())){
			addFieldError("userId","UserID can't be blank");	
		}
		if(StringUtils.isEmpty(getPassword())){
			addFieldError("password","password can't be blank");
		}
    
	}
	public String verifyLogin(){
		System.out.println("IN Loging Action ");
		user = new User();                         //-Model object created------>
		user.setUserId(userId);                    //Setting up value on model object----->
		user.setPassword(password);
		if(user.getUserId().equals("userId")&& user.getPassword().equals("password")){
			return "success";
		}
		return "failure";
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	/*private String userId;   //--------------------------------------------------->old style
	private String password;
	
	public void validate() {
		if(StringUtils.isEmpty(getUserId())){
			addFieldError("userId","UserID can't be blank");
			
		}
		if(StringUtils.isEmpty(getPassword())){
			addFieldError("password","password can't be blank");
		}
    
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute(){
		System.out.println("IN Loging Action ");
		if(getUserId().equals("userId")&& getPassword().equals("password")){
			return "success";
		}
		return "failure";
	}
*/
}
