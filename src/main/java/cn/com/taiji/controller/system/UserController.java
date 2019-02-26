package cn.com.taiji.controller.system;


import cn.com.taiji.domain.authority.SysUser;
import cn.com.taiji.domain.customize.CustomResult;
import cn.com.taiji.domain.customize.EUDataGridResult;
import cn.com.taiji.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get/{userId}")
    @ResponseBody
    public SysUser getItemById(@PathVariable String userId)throws Exception{
        SysUser sysUser = userService.get(userId);
        return sysUser;
    }

    @RequestMapping("/find")
    public String find() throws Exception{
        return "user_list";
    }

    @RequestMapping("/role")
    public String userRole() throws Exception{
        return "user_role_edit";
    }

    @RequestMapping("/add")
    public String add() throws Exception{
        return "user_add";
    }

    @RequestMapping("/edit")
    public String edit() throws Exception{
        return "user_edit";
    }

    @RequestMapping("/list")
    @ResponseBody
    public EUDataGridResult getList(Integer page,Integer rows,SysUser sysUser) throws Exception{
        EUDataGridResult result = userService.getList(page,rows,sysUser);
        return result;
    }

    @RequestMapping(value = "/insert" , method = RequestMethod.POST)
    @ResponseBody
    public CustomResult insert(@Valid SysUser sysUser, BindingResult bindingResult) throws Exception{
        CustomResult result;
        if (bindingResult.hasErrors()){
            FieldError fieldError = bindingResult.getFieldError();
            return CustomResult.build(100,fieldError.getDefaultMessage());
        }
        if (userService.findByUserNameAndId(sysUser.getUsername(),sysUser.getId()).size() > 0){
            return CustomResult.build(101,"该用户名已经存在，请更换用户名！！");
        }else if (userService.get(sysUser.getId()) != null){
            return CustomResult.build(101,"该用户编号已经存在，请更换用户编号！！");
        }
        result = userService.insert(sysUser);
        return result;
    }

    @RequestMapping(value = "/update")
    @ResponseBody
    public CustomResult update(@Valid SysUser user , BindingResult bindingResult)throws Exception{
        if (bindingResult.hasErrors()){
            FieldError fieldError = bindingResult.getFieldError();
            return CustomResult.build(100,fieldError.getDefaultMessage());
        }

        return userService.update(user);
    }

    @RequestMapping(value = "update_all")
    @ResponseBody
    public CustomResult updateAll(@Valid SysUser user ,BindingResult bindingResult) throws Exception{
        if (bindingResult.hasErrors()){
            FieldError fieldError = bindingResult.getFieldError();
            return CustomResult.build(100,fieldError.getDefaultMessage());
        }
        if (userService.findByUserNameAndId(user.getUsername(),user.getId()).size() > 0){
            return CustomResult.build(101,"该用户名已经存在，请更换用户名！！");
        }

        return userService.updateAll(user);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public CustomResult delete(String id) throws Exception{
        return userService.delete(id);
    }

    @RequestMapping("/delete_batch")
    @ResponseBody
    public CustomResult delete_batch(String[] ids)throws Exception{
        return userService.deleteBatch(ids);
    }


    @RequestMapping(value="/change_status")
    @ResponseBody
    public CustomResult changeStatus(String[] ids) throws Exception{
        CustomResult result = userService.changeStatus(ids);
        return result;
    }

    //根据用户id查找
    @RequestMapping("/search_user_by_userId")
    @ResponseBody
    public EUDataGridResult searchUserByUserId(Integer page, Integer rows, String searchValue)
            throws Exception{
        EUDataGridResult result = userService.searchUserByUserId(page, rows, searchValue);
        return result;
    }

    //根据用户名查找
    @RequestMapping("/search_user_by_userName")
    @ResponseBody
    public EUDataGridResult searchUserByUserName(Integer page, Integer rows, String searchValue)
            throws Exception{
        EUDataGridResult result = userService.searchUserByUserName(page, rows, searchValue);
        return result;
    }

    //搜根据角色名查找
    @RequestMapping("/search_user_by_roleName")
    @ResponseBody
    public EUDataGridResult searchUserByRoleName(Integer page, Integer rows, String searchValue)
            throws Exception{
        EUDataGridResult result = userService.searchUserByRoleName(page, rows, searchValue);
        return result;
    }
}
