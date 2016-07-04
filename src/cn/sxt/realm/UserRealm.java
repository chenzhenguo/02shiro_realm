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
	//��֤
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		System.out.println("-------realm-------");
		String username = (String)token.getPrincipal();
		//�������ݿ��  �����û��������ݿ⽫�����ѯ����
		String pwd = "1111";//α����
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(username, pwd, getName());
		return info;
	}
	//��Ȩ
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
		return null;
	}


}
