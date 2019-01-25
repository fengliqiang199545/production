package cn.com.taiji.domain;

import javax.validation.constraints.Size;

public class Department {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.department_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max = 40 , message = "{id.length.error}")
    private String departmentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.department_name
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max = 100 , message = "{name.length.error}")
    private String departmentName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column department.note
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max = 5000 , message = "{note.length.error}")
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.department_id
     *
     * @return the value of department.department_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.department_id
     *
     * @param departmentId the value for department.department_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.department_name
     *
     * @return the value of department.department_name
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.department_name
     *
     * @param departmentName the value for department.department_name
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column department.note
     *
     * @return the value of department.note
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column department.note
     *
     * @param note the value for department.note
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}