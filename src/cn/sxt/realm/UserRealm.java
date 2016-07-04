package cn.sxt.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class UserRealm extends AuthorizingRealm{
	@Override
	public String getName() {
		return "UserRealm";
	}
	//认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		System.out.println("-------realm-------");
		String username = (String)token.getPrincipal();
		//连接数据库的  根据用户名到数据库将密码查询出来
		String pwd = "1111";//伪代码
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username, pwd, getName());
		return info;
	}
	//授权
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
		return null;
	}


}
