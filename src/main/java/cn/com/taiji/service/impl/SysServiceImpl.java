package cn.com.taiji.service.impl;

import cn.com.taiji.domain.authority.SysPermission;
import cn.com.taiji.domain.authority.SysPermissionExample;
import cn.com.taiji.domain.authority.SysUser;
import cn.com.taiji.domain.authority.SysUserExample;
import cn.com.taiji.mapper.authority.SysPermissionMapper;
import cn.com.taiji.mapper.authority.SysPermissionMapperCustom;
import cn.com.taiji.mapper.authority.SysUserMapper;
import cn.com.taiji.service.SysService;
import cn.com.taiji.util.CollectionsFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysServiceImpl implements SysService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysPermissionMapperCustom sysPermissionMapperCustom;

    @Autowired
    private SysPermissionMapper sysPermissionMapper;



    @Override
    public SysUser getSysUserByName(String username) throws Exception {
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
        criteria.andUsernameEqualTo(username);

        List<SysUser> list =  sysUserMapper.selectByExample(sysUserExample);
        if (list != null && list.size() == 1){
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<SysPermission> findMenuListByUserId(String userId) throws Exception {

        return sysPermissionMapperCustom.findMenuListByUserId(userId);

    }

    @Override
    public List<SysPermission> findPermissionListByUserId(String userId) throws Exception {

        String permission = sysPermissionMapperCustom.findPermissionByUserId(userId);
        if (permission != null){
            String[] permissionIds = permission.split(",");
            List<Long> ids = CollectionsFactory.newArrayList();

            for (int i = 0;i < permissionIds.length;i++){
                ids.add(Long.valueOf(permissionIds[i]));
            }
            SysPermissionExample example = new SysPermissionExample();
            SysPermissionExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(ids);

            return sysPermissionMapper.selectByExample(example);
        }
        return null;
    }
}
