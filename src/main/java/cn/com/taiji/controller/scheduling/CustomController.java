package cn.com.taiji.controller.scheduling;

import cn.com.taiji.domain.Custom;
import cn.com.taiji.domain.customize.CustomResult;
import cn.com.taiji.domain.customize.EUDataGridResult;
import cn.com.taiji.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

/**
 * @author fengliqiang
 * @date 2019/02/25/5:08 PM
 **/

@Controller
@RequestMapping(value = "/custom")
public class CustomController {

    @Autowired
    private CustomService customService;

    @RequestMapping(value = "/get/{customId}")
    @ResponseBody
    public Custom getItemById(@PathVariable String customId)throws Exception{
        return customService.get(customId);
    }

    @RequestMapping(value = "/find")
    public String find() throws Exception{
        return "custom_list";
    }


    @RequestMapping(value = "/get_data")
    @ResponseBody
    public List<Custom> getData() throws Exception{
        return customService.find();
    }

    @RequestMapping(value = "/list")
    @ResponseBody
    public EUDataGridResult list(Integer page,Integer rows , Custom custom) throws Exception{
        EUDataGridResult result = customService.getList(page,rows,custom);
        return result;
    }

    @RequestMapping("/edit")
    public String edit() throws Exception{
        return "custom_edit";
    }


    @RequestMapping("/update_all")
    @ResponseBody
    public CustomResult update_all(@Valid Custom custom, BindingResult bindingResult) throws Exception{
        if (bindingResult.hasErrors()){
            FieldError fieldError = bindingResult.getFieldError();
            return CustomResult.build(100, fieldError.getDefaultMessage());
        }else {
            return customService.updateAll(custom);
        }
    }


    @RequestMapping("/update")
    @ResponseBody
    public CustomResult update(@Valid Custom custom , BindingResult bindingResult) throws Exception{
        CustomResult result = null;
        if (bindingResult.hasErrors()){
            FieldError fieldError = bindingResult.getFieldError();
            return CustomResult.build(100,fieldError.getDefaultMessage());
        }
        result = customService.update(custom);
        return result;
    }

    @RequestMapping("/add")
    public String add() throws Exception{
        return "custom_add";
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ResponseBody
    public CustomResult insert(@Valid Custom custom,BindingResult bindingResult) throws  Exception{
        CustomResult result;
        if (bindingResult.hasErrors()){
            FieldError fieldError = bindingResult.getFieldError();
            return CustomResult.build(100,fieldError.getDefaultMessage());
        }
        if (customService.get(custom.getCustomId()) != null){
            result = new CustomResult(0,"该客户编号已经存在，请更换！",null);
        }else {
            result = customService.insert(custom);
        }

        return result;
    }

    @RequestMapping(value="/update_note")
    @ResponseBody
    private CustomResult updateNote(@Valid Custom custom, BindingResult bindingResult) throws Exception {
        if(bindingResult.hasErrors()){
            FieldError fieldError = bindingResult.getFieldError();
            return CustomResult.build(100, fieldError.getDefaultMessage());
        }
        return customService.updateNote(custom);
    }

    @RequestMapping(value="/delete")
    @ResponseBody
    private CustomResult delete(String id) throws Exception {
        CustomResult result = customService.delete(id);
        return result;
    }


    @RequestMapping(value="/delete_batch")
    @ResponseBody
    private CustomResult deleteBatch(String[] ids) throws Exception {
        CustomResult result = customService.deleteBatch(ids);
        return result;
    }

    @RequestMapping(value="/change_status")
    @ResponseBody
    public CustomResult changeStatus(String[] ids) throws Exception{
        CustomResult result = customService.changeStatus(ids);
        return result;
    }

    //根据客户id查找
    @RequestMapping("/search_custom_by_customId")
    @ResponseBody
    public EUDataGridResult searchCustomByCustomId(Integer page , Integer rows, String searchValue) throws Exception{
        EUDataGridResult result = customService.searchCustomByCustomId(page,rows,searchValue);
        return  result;
    }

    //根据客户名查找
    @RequestMapping("/search_custom_by_customName")
    @ResponseBody
    public EUDataGridResult searchCustomByCustomName(Integer page, Integer rows, String searchValue)
            throws Exception{
        EUDataGridResult result = customService.searchCustomByCustomName(page, rows, searchValue);
        return result;
    }
}


