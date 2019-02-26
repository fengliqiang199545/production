<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="../js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="UTF-8" src="../js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="UTF-8" src="../js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<div style="padding:10px 10px 10px 10px">
    <form id="customEditForm" class="customForm" method="post">
        <input type="hidden" name="customId">
        <table cellpadding="5">
            <tr>
                <td>客户名称：</td>
                <td>
                    <input type="text" class="easyui-textbox" name="customName" data-options="required:true">
                </td>
            </tr>
            <tr>
                <td>客户全称:</td>
                <td>
                    <input class="easyui-textbox" type="text" name="fullName" style="width: 280px;"/>
                </td>
            </tr>
            <tr>
                <td>地址:</td>
                <td>
                    <input class="easyui-textbox" type="text" name="address" style="width: 280px;"/>
                </td>
            </tr>
            <tr>
                <td>传真:</td>
                <td>
                    <input class="easyui-textbox" type="text" name="fax"/>
                </td>
            </tr>
            <tr>
                <td>邮箱:</td>
                <td>
                    <input class="easyui-textbox" type="text" name="email"/>
                </td>
            </tr>
            <tr>
                <td>经理姓名:</td>
                <td>
                    <input class="easyui-textbox" type="text" name="ownerName"/>
                </td>
            </tr>
            <tr>
                <td>联系电话:</td>
                <td>
                    <input class="easyui-textbox" type="text" name="ownerTel"/>
                </td>
            </tr>
            <tr>
                <td>客户转台：</td>
                <td>
                    <select name="status" id="cc" class="easyui-combobox" style="width:250px;" panelHeight="auto"
                            data-options="width:150, editable:false">
                        <option value="1">有效客户</option>
                        <option value="2">无效客户</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>备注</td>
                <td>
                    <textarea name="note" style="width:800px;height:300px;visibility:hidden;"></textarea>
                </td>
            </tr>
        </table>
    </form>
    <div style="padding:5px">
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitCustomEditForm()"></a>
    </div>
</div>

<script type="text/javascript">
    var customEditEditor;
    $(function () {
        //初始化，实例化编辑器
        customEditEditor = TAOTAO.createEditor("#customEditForm [name=note]")
    })
function submitCustomEditForm() {
    $.get("custom/edit_judge",'',function (data) {
        if (data.msg != null){
            $.messager.alert("提示",data.msg)
        } else  {
            if (!$("#customEditForm").form("validate")) {
                $.messager.alert("提示","表单还没填写完成！");
                return;
            }
            //同步文本框中的备注
            customEditEditor.sync();
            $.post("custom/update_all",$("#customEditForm").serialize(),function (data) {
                if (data.status == 200){
                    $.messager.alert("提示","修改客户成功","info",function () {
                        $("#customEditWindow").window("close");
                        $("#cusotmList").datagrid("reload");
                    });
                } else {
                    $.messager.alert("提示",data.msg);
                }
            });
        }
    });
}
</script>