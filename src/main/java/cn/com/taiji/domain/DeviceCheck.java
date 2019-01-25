package cn.com.taiji.domain;

import java.util.Date;

public class DeviceCheck {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_check.device_check_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String deviceCheckId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_check.device_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String deviceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_check.device_check_emp_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String deviceCheckEmpId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_check.device_check_date
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private Date deviceCheckDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_check.device_check_result
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String deviceCheckResult;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_check.device_check_fault_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String deviceCheckFaultId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_check.device_check_id
     *
     * @return the value of device_check.device_check_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDeviceCheckId() {
        return deviceCheckId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_check.device_check_id
     *
     * @param deviceCheckId the value for device_check.device_check_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceCheckId(String deviceCheckId) {
        this.deviceCheckId = deviceCheckId == null ? null : deviceCheckId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_check.device_id
     *
     * @return the value of device_check.device_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_check.device_id
     *
     * @param deviceId the value for device_check.device_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_check.device_check_emp_id
     *
     * @return the value of device_check.device_check_emp_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDeviceCheckEmpId() {
        return deviceCheckEmpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_check.device_check_emp_id
     *
     * @param deviceCheckEmpId the value for device_check.device_check_emp_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceCheckEmpId(String deviceCheckEmpId) {
        this.deviceCheckEmpId = deviceCheckEmpId == null ? null : deviceCheckEmpId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_check.device_check_date
     *
     * @return the value of device_check.device_check_date
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public Date getDeviceCheckDate() {
        return deviceCheckDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_check.device_check_date
     *
     * @param deviceCheckDate the value for device_check.device_check_date
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceCheckDate(Date deviceCheckDate) {
        this.deviceCheckDate = deviceCheckDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_check.device_check_result
     *
     * @return the value of device_check.device_check_result
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDeviceCheckResult() {
        return deviceCheckResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_check.device_check_result
     *
     * @param deviceCheckResult the value for device_check.device_check_result
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceCheckResult(String deviceCheckResult) {
        this.deviceCheckResult = deviceCheckResult == null ? null : deviceCheckResult.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_check.device_check_fault_id
     *
     * @return the value of device_check.device_check_fault_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDeviceCheckFaultId() {
        return deviceCheckFaultId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_check.device_check_fault_id
     *
     * @param deviceCheckFaultId the value for device_check.device_check_fault_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceCheckFaultId(String deviceCheckFaultId) {
        this.deviceCheckFaultId = deviceCheckFaultId == null ? null : deviceCheckFaultId.trim();
    }
}