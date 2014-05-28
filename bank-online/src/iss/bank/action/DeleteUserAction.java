package iss.bank.action;

import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.RequestAware;
import com.opensymphony.xwork2.ActionSupport;
import iss.bank.action.Pager;
import iss.bank.entity.*;
import iss.bank.service.AdminService;
import iss.bank.service.impl.AdminServiceImpl;



public class DeleteUserAction extends ActionSupport implements RequestAware{
	private int pageNow=1;
	private int pageSize=6;
	private User user;
	private String id;
	private Map request;
	private AdminServiceImpl adminServiceImpl;


	
	public int getPageNow() {
		return pageNow;
	}
	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Map getRequest() {
		return request;
	}
	public void setRequest(Map request) {
		this.request = request;
	}
	public AdminServiceImpl getAdminServiceImpl() {
		return adminServiceImpl;
	}
	public void setAdminServiceImpl(AdminServiceImpl adminServiceImpl) {
		this.adminServiceImpl = adminServiceImpl;
	}
	@Override
	public String execute() throws Exception {
		int userId=Integer.parseInt(id);
		if(adminServiceImpl.delete(userId)){
			List list=adminServiceImpl.findAll(pageNow,pageSize);
			Pager page = new Pager(getPageNow(),list.size());
			request.put("list", list);
			request.put("page", page);
			return "view";
		}else{
			request.put("shanchu", "É¾³ýÊ§°Ü£¡");
			return "failure";
		}
	}
}