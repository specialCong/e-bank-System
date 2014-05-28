package iss.bank.service.impl;   

import iss.bank.entity.Admin;
import iss.bank.entity.User;
import iss.bank.service.AdminService;
import iss.bank.service.impl.AdminServiceImpl;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


  public class AdminServiceImpl extends HibernateDaoSupport implements AdminService{
    //管理员登录验证   
    /* (non-Javadoc)
	 * @see iss.bank.service.impl.UserService#checkUser(java.lang.String, java.lang.String)
	 */
    /* (non-Javadoc)
	 * @see iss.bank.service.impl.UserService#checkUser(java.lang.String, java.lang.String)
	 */
    /* (non-Javadoc)
	 * @see iss.bank.service.impl.AdminService#checkUser(java.lang.String, java.lang.String)
	 */
    /* (non-Javadoc)
	 * @see iss.bank.service.impl.AdminService#checkAdmin(java.lang.String, java.lang.String)
	 */
    /* (non-Javadoc)
	 * @see iss.bank.service.impl.AdminService#checkAdmin(java.lang.String, java.lang.String)
	 */
    @SuppressWarnings("unchecked")
    public boolean checkAdmin(String adminName,String adminPwd){
       boolean flag = false;
      String hql = "from Admin as admin where admin.adminName = '"              +adminName+"' and admin.adminPwd = '"+adminPwd+"'";
      List<Admin> adminList = this.getHibernateTemplate().find(hql);
       if(adminList.size()>0){
        flag = true;
       }
       return flag;
    }
	/* (non-Javadoc)
	 * @see iss.bank.service.impl.AdminService#delete(int)
	 */
    
    public List findAll(int pageNow, int pageSize) {
//		List list =getHibernateTemplate().findByExample(Login.class,(pageNow-1)*pageSize , pageSize);
//		return list;
		try{
			Session session = getHibernateTemplate().getSessionFactory().openSession();
			Transaction ts=session.beginTransaction();
			Query query=session.createQuery("from User");
			
			int firstResult=(pageNow-1)*pageSize;
			query.setFirstResult(firstResult);
			query.setMaxResults(pageSize);
			List list=query.list();
			ts.commit();
			session.close();
			session=null;
			return list;
			}catch(Exception e){
				e.printStackTrace();
				return null;
			}
	}
    
	public boolean delete(int userId) {
		User  user=(User)getHibernateTemplate().get(User.class, userId);
//		getHibernateTemplate().delete((List<Userinfo>)user.getUserinfos());
		getHibernateTemplate().delete(user);
		return true;
	}





	
//	public List get(int login_id) {
//		List list=getHibernateTemplate().find("from Login where login_id=?",login_id);
//		return list;
//	}

} 



