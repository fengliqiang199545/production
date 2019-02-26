<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="../js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">

<link href="../css/uploadfile.css" rel="stylesheet">
<script src="../js/jquery.uploadfile.js"></script>

<script type="text/javascript" charset="utf-8" src="../js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="../js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding: 10px 10px 10px 10px ;">
    <form id="userRoleEditForm" class="roleForm" method="post">
        <input type="hidden" name="roleId" name="roleId">
        <span>角色名：</span>
        <input type="text" class="easyui-textbox" name="roleName" data-options="required: true"><br><br>
        <span>状&nbsp态：</span>
        <select name="available" class="easyui-combobox" data-options="width:150, editable:false">
            <option value="1">有效</option>
            <option value="2">锁定</option>
        </select><br><br>
        <span>权限：</span><br><br>
        <input type="hidden" name="permission">
        <span style="font-weight: bold">订单管理：</span>
        <label><input type="checkbox" name="permissionOption3" value="11"></label>
        <label><input type="checkbox" name="permissionOption3" value="12"></label>
        <label><input type="checkbox" name="permissionOption3" value="13"></label>
        <br><br>
        <span style="font-weight: bold">客户管理：</span>
        <label><input type="checkbox" name="permissionOption3" value="21"></label>
        <label><input type="checkbox" name="permissionOption3" value="22"></label>
        <label><input type="checkbox" name="permissionOption3" value="23"></label>
        <br><br>
        <span style="font-weight: bold">产品管理：</span>
        <label><input type="checkbox" name="permissionOption3" value="31"></label>
        <label><input type="checkbox" name="permissionOption3" value="32"></label>
        <label><input type="checkbox" name="permissionOption3" value="33"></label>
        <br><br>
        <span style="font-weight: bold">产品管理：</span>
        <label><input type="checkbox" name="permissionOption3" value="31"></label>
        <label><input type="checkbox" name="permissionOption3" value="32"></label>
        <label><input type="checkbox" name="permissionOption3" value="33"></label>
        <br><br>
        <span style="font-weight: bold">产品管理：</span>
        <label><input type="checkbox" name="permissionOption3" value="31"></label>
        <label><input type="checkbox" name="permissionOption3" value="32"></label>
        <label><input type="checkbox" name="permissionOption3" value="33"></label>
        <br><br>
        <span style="font-weight: bold">产品管理：</span>
        <label><input type="checkbox" name="permissionOption3" value="31"></label>
        <label><input type="checkbox" name="permissionOption3" value="32"></label>
        <label><input type="checkbox" name="permissionOption3" value="33"></label>
        <br><br>
        <span style="font-weight: bold">产品管理：</span>
        <label><input type="checkbox" name="permissionOption3" value="31"></label>
        <label><input type="checkbox" name="permissionOption3" value="32"></label>
        <label><input type="checkbox" name="permissionOption3" value="33"></label>
        <br><br>
        <span style="font-weight: bold">产品管理：</span>
        <label><input type="checkbox" name="permissionOption3" value="31"></label>
        <label><input type="checkbox" name="permissionOption3" value="32"></label>
        <label><input type="checkbox" name="permissionOption3" value="33"></label>
        <br><br>
        <span style="font-weight: bold">产品管理：</span>
        <label><input type="checkbox" name="permissionOption3" value="31"></label>
        <label><input type="checkbox" name="permissionOption3" value="32"></label>
        <label><input type="checkbox" name="permissionOption3" value="33"></label>
        <br><br>
        <span style="font-weight: bold">产品管理：</span>
        <label><input type="checkbox" name="permissionOption3" value="31"></label>
        <label><input type="checkbox" name="permissionOption3" value="32"></label>
        <label><input type="checkbox" name="permissionOption3" value="33"></label>
        <br><br>
        <span style="font-weight: bold">产品管理：</span>
        <label><input type="checkbox" name="permissionOption3" value="31"></label>
        <label><input type="checkbox" name="permissionOption3" value="32"></label>
        <label><input type="checkbox" name="permissionOption3" value="33"></label>
        <br><br>


    </form>
</div>