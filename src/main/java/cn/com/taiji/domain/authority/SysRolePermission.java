package cn.com.taiji.domain.authority;

public class SysRolePermission {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_permission.id
     *
     * @mbg.generated Fri Jan 25 12:43:56 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_permission.sys_role_id
     *
     * @mbg.generated Fri Jan 25 12:43:56 CST 2019
     */
    private String sysRoleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_permission.sys_permission_id
     *
     * @mbg.generated Fri Jan 25 12:43:56 CST 2019
     */
    private String sysPermissionId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_permission.id
     *
     * @return the value of sys_role_permission.id
     *
     * @mbg.generated Fri Jan 25 12:43:56 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_permission.id
     *
     * @param id the value for sys_role_permission.id
     *
     * @mbg.generated Fri Jan 25 12:43:56 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_permission.sys_role_id
     *
     * @return the value of sys_role_permission.sys_role_id
     *
     * @mbg.generated Fri Jan 25 12:43:56 CST 2019
     */
    public String getSysRoleId() {
        return sysRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_permission.sys_role_id
     *
     * @param sysRoleId the value for sys_role_permission.sys_role_id
     *
     * @mbg.generated Fri Jan 25 12:43:56 CST 2019
     */
    public void setSysRoleId(String sysRoleId) {
        this.sysRoleId = sysRoleId == null ? null : sysRoleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_permission.sys_permission_id
     *
     * @return the value of sys_role_permission.sys_permission_id
     *
     * @mbg.generated Fri Jan 25 12:43:56 CST 2019
     */
    public String getSysPermissionId() {
        return sysPermissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_permission.sys_permission_id
     *
     * @param sysPermissionId the value for sys_role_permission.sys_permission_id
     *
     * @mbg.generated Fri Jan 25 12:43:56 CST 2019
     */
    public void setSysPermissionId(String sysPermissionId) {
        this.sysPermissionId = sysPermissionId == null ? null : sysPermissionId.trim();
    }
}