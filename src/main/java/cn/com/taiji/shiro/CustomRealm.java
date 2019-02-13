package cn.com.taiji.shiro;

import cn.com.taiji.domain.authority.SysPermission;
import cn.com.taiji.domain.authority.SysUser;
import cn.com.taiji.domain.customize.ActiveUser;
import cn.com.taiji.domain.vo.RoleVO;
import cn.com.taiji.service.RoleService;
import cn.com.taiji.service.SysService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CustomRealm extends AuthorizingRealm {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SysService sysService;

    @Autowired
    private RoleService roleService;

    @Override
    public void setName(String name){
        super.setName("customRealm");
    }


    /*
    *   realm的授权方法
    * */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        //从principals中获取主身份信息
        //将getPrimaryPrincipal方法返回值转为真实身份类型（在doGetAuthenticationInfo认证通过填充到SimpleAuthenticationInfo中身份类型）
        ActiveUser activeUser = (ActiveUser) principals.getPrimaryPrincipal();

        //根据身份信息从数据库中获取到权限数据
        List<SysPermission> permissionList = null;

        try {
            permissionList = sysService.findPermissionListByUserId(activeUser.getUserid());
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        List<String> permissions = new ArrayList<>();
        if (permissionList != null){
            for (SysPermission s :permissionList
                    ) {
                permissions.add(s.getPercode());
            }
        }
        //查到权限数据，返回授权信息
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addStringPermissions(permissions);

        return simpleAuthorizationInfo;
    }


    /*
    *   Realm的认证方法
    * */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //token是用户输入的用户名和密码，第一步从token中取出用户名
        String username = (String)token.getPrincipal();

        SysUser sysUser = null;

        //第二步，根据用户输入的username从数据库中进行查询
        try {
             sysUser = sysService.getSysUserByName(username);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        //如果查询不到，则返回null
        if (sysUser == null){
            if (logger.isDebugEnabled()){
                logger.debug("user not exist!!");
            }
            return null;
        }

        String password = sysUser.getPassword();

        ActiveUser activeUser = new ActiveUser();

        activeUser.setUserid(sysUser.getId());
        activeUser.setUsername(sysUser.getUsername());
        activeUser.setUserStatus(sysUser.getLocked());

        RoleVO sysRole = null;

        try {
            sysRole = roleService.findRoleByUserId(sysUser.getId());
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        activeUser.setRolename(sysRole.getRoleName());
        activeUser.setRoleStatus(sysRole.getAvailable());

        logger.info(activeUser.getUsername());

        //根据用户id取出菜单
        List<SysPermission> menus = null;

        //通过相应的服务类 ，取到相应的菜单
        try {
            menus = sysService.findMenuListByUserId(sysUser.getId());
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        //将用户菜单设置到activeUser
        activeUser.setMenus(menus);

        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(activeUser,password,this.getName());

        return simpleAuthenticationInfo;
    }
}
