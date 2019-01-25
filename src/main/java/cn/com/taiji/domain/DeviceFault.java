package cn.com.taiji.domain;

import java.util.Date;

public class DeviceFault {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_fault.device_fault_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String deviceFaultId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_fault.device_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String deviceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_fault.device_fault_cause
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String deviceFaultCause;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_fault.device_fault_detail
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String deviceFaultDetail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_fault.device_fault_date
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private Date deviceFaultDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_fault.device_fault_maintenance
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String deviceFaultMaintenance;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_fault.device_fault_id
     *
     * @return the value of device_fault.device_fault_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDeviceFaultId() {
        return deviceFaultId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_fault.device_fault_id
     *
     * @param deviceFaultId the value for device_fault.device_fault_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceFaultId(String deviceFaultId) {
        this.deviceFaultId = deviceFaultId == null ? null : deviceFaultId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_fault.device_id
     *
     * @return the value of device_fault.device_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_fault.device_id
     *
     * @param deviceId the value for device_fault.device_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_fault.device_fault_cause
     *
     * @return the value of device_fault.device_fault_cause
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDeviceFaultCause() {
        return deviceFaultCause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_fault.device_fault_cause
     *
     * @param deviceFaultCause the value for device_fault.device_fault_cause
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceFaultCause(String deviceFaultCause) {
        this.deviceFaultCause = deviceFaultCause == null ? null : deviceFaultCause.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_fault.device_fault_detail
     *
     * @return the value of device_fault.device_fault_detail
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDeviceFaultDetail() {
        return deviceFaultDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_fault.device_fault_detail
     *
     * @param deviceFaultDetail the value for device_fault.device_fault_detail
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceFaultDetail(String deviceFaultDetail) {
        this.deviceFaultDetail = deviceFaultDetail == null ? null : deviceFaultDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_fault.device_fault_date
     *
     * @return the value of device_fault.device_fault_date
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public Date getDeviceFaultDate() {
        return deviceFaultDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_fault.device_fault_date
     *
     * @param deviceFaultDate the value for device_fault.device_fault_date
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceFaultDate(Date deviceFaultDate) {
        this.deviceFaultDate = deviceFaultDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_fault.device_fault_maintenance
     *
     * @return the value of device_fault.device_fault_maintenance
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDeviceFaultMaintenance() {
        return deviceFaultMaintenance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_fault.device_fault_maintenance
     *
     * @param deviceFaultMaintenance the value for device_fault.device_fault_maintenance
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceFaultMaintenance(String deviceFaultMaintenance) {
        this.deviceFaultMaintenance = deviceFaultMaintenance == null ? null : deviceFaultMaintenance.trim();
    }
}