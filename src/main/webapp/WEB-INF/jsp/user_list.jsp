<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="../js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="../js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="../js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<table class="easyui-datagrid" id="userList" title="用户列表"
       data-options="singleSelect:false,collapsible:true,pagination:true,rownumbers:true,url:'user/list',
       	method:'get',pageSize:10,fitColumns:true,toolbar:toolbar_user">
    <thead>
        <tr>
            <th data-options="field:'ck',checkbox:true"></th>
            <th data-options="field:'id',align:'center',width:150">用户编号</th>
            <th data-options="field:'username',align:'center',width:150">用户名</th>
            <th data-options="field:'password',align:'center',width:150">密码</th>
            <th data-options="field:'roleName',align:'center',width:150,formatter:formatRole">角色</th>
            <th data-options="field:'locked',width:150,align:'center',formatter:formatUserStatus">状态</th>
        </tr>
    </thead>
</table>

<div id="toolbar" style=" height: 22px; padding: 3px 11px; background: #fafafa;">
    <c:forEach items="${sessionScope.sysPermissionList}" var="per">
        <c:if test="${per == 'user:add'}">
            <div style="float: left;">
                <a href="#" class="easyui-linkbutton" plain="true" icon="icon-add" onclick="user_add()">新增</a>
            </div>
        </c:if>
        <c:if test="${per == 'user:edit'}">
            <div style="float:left">
                <a href="#" class="easyui-linkbutton" plain="true" icon="icon-add" onclick="user_edit()">编辑</a>
            </div>
        </c:if>
    </c:forEach>
</div>


<div id="userAddWindow" class="easyui-window" title="添加用户"
     data-options="modal:true,closed:true,resizable:true,iconCls:'icon-save',href:'user/add'" ,style="width:45%;height:60%;padding:10px;">
</div>
<div id="userEditWindow" class="easyui-window" title="编辑用户"
     data-options="modal:true,closed:true,resizable:true,iconCls:'icon-save',href:'user/edit'" ,style="width:45%;height:60%;padding:10px;">
</div>

<script>
    function getUserSelectionsIds() {
        var userList = $("#userList");
        var sels = userList.datagrid("getSelections");
        var ids = [];
        for (var i in sels){
            ids.push(sels[i].id);
        }

        ids = ids.join(",");
        return ids;
    }

    function user_edit() {
        $.get("user/edit_judge",'',function (data) {
            if (data.msg != null){
                $.messager.alert("提示",data.msg);
                return ;
            } else {
               var ids = getUserSelectionsIds();

               if (ids.length == 0){
                   $.messager.alert("提示","必须选择一个用户才能编辑！！");
                   return;
               }
               if (ids.indexOf(",") > 0){
                   $.messager.alert("提示","只能选择一个用户进行操作！！");
                   return ;
               }

               $("#userEditWindow")

            }
        });
    }



    function user_add() {
        $.get("user/add_judge",'',function (data) {
            if (data.msg != null){
                $.messager.alert("提示",data.msg);
                return ;
            } else {
                $("#userAddWindow").window("open");
            }
        });
    }
</script>