package cn.com.taiji.domain;

import javax.validation.constraints.Size;
import java.util.Date;

public class Employee {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.emp_id
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    @Size(max=40, message="{id.length.error}")
    private String empId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.emp_name
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    @Size(max=40, message="员工姓名过长！")
    private String empName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.sex
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    @Size(max=2, message="员工性别过长！")
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.id_code
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    @Size(min=18, max=18, message="请输入正确身份证号！")
    private String idCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.birthday
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.join_date
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    private Date joinDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.status
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.education
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    @Size(max=20, message="学历的长度限制在20个字符之内！")
    private String education;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.degree
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    @Size(max=20, message="学位的长度限制在20个字符之内！")
    private String degree;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.major
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    @Size(max=20, message="专业的长度限制在20个字符之内！")
    private String major;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.graduate_school
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    @Size(max=40, message="毕业院校的长度限制在40个字符之内！")
    private String graduateSchool;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.education_form
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    @Size(max=40, message="受教育形式的长度限制在40个字符之内！")
    private String educationForm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.department_id
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    private String departmentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.emp_id
     *
     * @return the value of employee.emp_id
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public String getEmpId() {
        return empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.emp_id
     *
     * @param empId the value for employee.emp_id
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.emp_name
     *
     * @return the value of employee.emp_name
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.emp_name
     *
     * @param empName the value for employee.emp_name
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.sex
     *
     * @return the value of employee.sex
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.sex
     *
     * @param sex the value for employee.sex
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.id_code
     *
     * @return the value of employee.id_code
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public String getIdCode() {
        return idCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.id_code
     *
     * @param idCode the value for employee.id_code
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public void setIdCode(String idCode) {
        this.idCode = idCode == null ? null : idCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.birthday
     *
     * @return the value of employee.birthday
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.birthday
     *
     * @param birthday the value for employee.birthday
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.join_date
     *
     * @return the value of employee.join_date
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public Date getJoinDate() {
        return joinDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.join_date
     *
     * @param joinDate the value for employee.join_date
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.status
     *
     * @return the value of employee.status
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.status
     *
     * @param status the value for employee.status
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.education
     *
     * @return the value of employee.education
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public String getEducation() {
        return education;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.education
     *
     * @param education the value for employee.education
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.degree
     *
     * @return the value of employee.degree
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public String getDegree() {
        return degree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.degree
     *
     * @param degree the value for employee.degree
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.major
     *
     * @return the value of employee.major
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public String getMajor() {
        return major;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.major
     *
     * @param major the value for employee.major
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.graduate_school
     *
     * @return the value of employee.graduate_school
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public String getGraduateSchool() {
        return graduateSchool;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.graduate_school
     *
     * @param graduateSchool the value for employee.graduate_school
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool == null ? null : graduateSchool.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.education_form
     *
     * @return the value of employee.education_form
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public String getEducationForm() {
        return educationForm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.education_form
     *
     * @param educationForm the value for employee.education_form
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public void setEducationForm(String educationForm) {
        this.educationForm = educationForm == null ? null : educationForm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.department_id
     *
     * @return the value of employee.department_id
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.department_id
     *
     * @param departmentId the value for employee.department_id
     *
     * @mbg.generated Mon Jan 28 09:51:23 CST 2019
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }
}