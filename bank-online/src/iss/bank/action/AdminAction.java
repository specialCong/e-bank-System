package iss.bank.action;   

import iss.bank.entity.Admin;
import iss.bank.service.AdminService;

import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport{   

    private String adminName;
    private String adminPwd;
    private Admin admin;
    private AdminService adminServiceImpl;   
    
    
	public AdminService getAdminServiceImpl() {
		return adminServiceImpl;
	}
	public void setAdminServiceImpl(AdminService adminServiceImpl) {
		this.adminServiceImpl = adminServiceImpl;
	}

	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPwd() {
		return adminPwd;
	}
	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}


//   public String execute(){
//     String page = "FAILURE";   
//     boolean flag = false;   
//     flag = personManage.checkUser(userLoginname, userPwd);   
//     if(flag){   
//      page = "SUCCESS";   
//     }   
//     return page;   
//        return "";   
//	}   

    public String adminlogin(){
           String page = "FAILURE";
           boolean flag = false;
           flag = adminServiceImpl.checkAdmin(adminName, adminPwd);
           if(flag){
            page = "SUCCESS";
           }
           return page;
    }
    
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}   

    
}  