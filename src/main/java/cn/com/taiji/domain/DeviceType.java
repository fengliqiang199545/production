package cn.com.taiji.domain;

import java.util.Date;

public class DeviceType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_type.device_type_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String deviceTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_type.device_type_name
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String deviceTypeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_type.device_type_model
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String deviceTypeModel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_type.device_type_spec
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String deviceTypeSpec;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_type.device_type_supplier
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String deviceTypeSupplier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_type.device_type_producer
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String deviceTypeProducer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_type.device_type_quantity
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private Integer deviceTypeQuantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column device_type.device_type_warranty
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private Date deviceTypeWarranty;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_type.device_type_id
     *
     * @return the value of device_type.device_type_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDeviceTypeId() {
        return deviceTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_type.device_type_id
     *
     * @param deviceTypeId the value for device_type.device_type_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceTypeId(String deviceTypeId) {
        this.deviceTypeId = deviceTypeId == null ? null : deviceTypeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_type.device_type_name
     *
     * @return the value of device_type.device_type_name
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDeviceTypeName() {
        return deviceTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_type.device_type_name
     *
     * @param deviceTypeName the value for device_type.device_type_name
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceTypeName(String deviceTypeName) {
        this.deviceTypeName = deviceTypeName == null ? null : deviceTypeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_type.device_type_model
     *
     * @return the value of device_type.device_type_model
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDeviceTypeModel() {
        return deviceTypeModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_type.device_type_model
     *
     * @param deviceTypeModel the value for device_type.device_type_model
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceTypeModel(String deviceTypeModel) {
        this.deviceTypeModel = deviceTypeModel == null ? null : deviceTypeModel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_type.device_type_spec
     *
     * @return the value of device_type.device_type_spec
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDeviceTypeSpec() {
        return deviceTypeSpec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_type.device_type_spec
     *
     * @param deviceTypeSpec the value for device_type.device_type_spec
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceTypeSpec(String deviceTypeSpec) {
        this.deviceTypeSpec = deviceTypeSpec == null ? null : deviceTypeSpec.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_type.device_type_supplier
     *
     * @return the value of device_type.device_type_supplier
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDeviceTypeSupplier() {
        return deviceTypeSupplier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_type.device_type_supplier
     *
     * @param deviceTypeSupplier the value for device_type.device_type_supplier
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceTypeSupplier(String deviceTypeSupplier) {
        this.deviceTypeSupplier = deviceTypeSupplier == null ? null : deviceTypeSupplier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_type.device_type_producer
     *
     * @return the value of device_type.device_type_producer
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getDeviceTypeProducer() {
        return deviceTypeProducer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_type.device_type_producer
     *
     * @param deviceTypeProducer the value for device_type.device_type_producer
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceTypeProducer(String deviceTypeProducer) {
        this.deviceTypeProducer = deviceTypeProducer == null ? null : deviceTypeProducer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_type.device_type_quantity
     *
     * @return the value of device_type.device_type_quantity
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public Integer getDeviceTypeQuantity() {
        return deviceTypeQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_type.device_type_quantity
     *
     * @param deviceTypeQuantity the value for device_type.device_type_quantity
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceTypeQuantity(Integer deviceTypeQuantity) {
        this.deviceTypeQuantity = deviceTypeQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column device_type.device_type_warranty
     *
     * @return the value of device_type.device_type_warranty
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public Date getDeviceTypeWarranty() {
        return deviceTypeWarranty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column device_type.device_type_warranty
     *
     * @param deviceTypeWarranty the value for device_type.device_type_warranty
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setDeviceTypeWarranty(Date deviceTypeWarranty) {
        this.deviceTypeWarranty = deviceTypeWarranty;
    }
}