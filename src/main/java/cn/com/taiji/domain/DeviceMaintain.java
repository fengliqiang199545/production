package cn.com.taiji.domain;

import java.math.BigDecimal;
import java.util.Date;

public class DeviceMaintain {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_maintain.device_maintain_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String deviceMaintainId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_maintain.device_fault_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String deviceFaultId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_maintain.device_maintain_emp_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String deviceMaintainEmpId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_maintain.device_maintain_date
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private Date deviceMaintainDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_maintain.device_maintain_result
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String deviceMaintainResult;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_maintain.device_maintain_cost
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private BigDecimal deviceMaintainCost;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_maintain.note
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_maintain.device_maintain_id
     *
     * @return the value of device_maintain.device_maintain_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDeviceMaintainId() {
        return deviceMaintainId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_maintain.device_maintain_id
     *
     * @param deviceMaintainId the value for device_maintain.device_maintain_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceMaintainId(String deviceMaintainId) {
        this.deviceMaintainId = deviceMaintainId == null ? null : deviceMaintainId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_maintain.device_fault_id
     *
     * @return the value of device_maintain.device_fault_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDeviceFaultId() {
        return deviceFaultId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_maintain.device_fault_id
     *
     * @param deviceFaultId the value for device_maintain.device_fault_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceFaultId(String deviceFaultId) {
        this.deviceFaultId = deviceFaultId == null ? null : deviceFaultId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_maintain.device_maintain_emp_id
     *
     * @return the value of device_maintain.device_maintain_emp_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDeviceMaintainEmpId() {
        return deviceMaintainEmpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_maintain.device_maintain_emp_id
     *
     * @param deviceMaintainEmpId the value for device_maintain.device_maintain_emp_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceMaintainEmpId(String deviceMaintainEmpId) {
        this.deviceMaintainEmpId = deviceMaintainEmpId == null ? null : deviceMaintainEmpId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_maintain.device_maintain_date
     *
     * @return the value of device_maintain.device_maintain_date
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public Date getDeviceMaintainDate() {
        return deviceMaintainDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_maintain.device_maintain_date
     *
     * @param deviceMaintainDate the value for device_maintain.device_maintain_date
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceMaintainDate(Date deviceMaintainDate) {
        this.deviceMaintainDate = deviceMaintainDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_maintain.device_maintain_result
     *
     * @return the value of device_maintain.device_maintain_result
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDeviceMaintainResult() {
        return deviceMaintainResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_maintain.device_maintain_result
     *
     * @param deviceMaintainResult the value for device_maintain.device_maintain_result
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceMaintainResult(String deviceMaintainResult) {
        this.deviceMaintainResult = deviceMaintainResult == null ? null : deviceMaintainResult.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_maintain.device_maintain_cost
     *
     * @return the value of device_maintain.device_maintain_cost
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public BigDecimal getDeviceMaintainCost() {
        return deviceMaintainCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_maintain.device_maintain_cost
     *
     * @param deviceMaintainCost the value for device_maintain.device_maintain_cost
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceMaintainCost(BigDecimal deviceMaintainCost) {
        this.deviceMaintainCost = deviceMaintainCost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_maintain.note
     *
     * @return the value of device_maintain.note
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_maintain.note
     *
     * @param note the value for device_maintain.note
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}