package cn.com.taiji.domain;

import javax.validation.constraints.Size;
import java.util.Date;

public class FinalMeasuretCheck {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column final_measuret_check.f_measure_check_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max=40, message="{id.length.error}")
    private String fMeasureCheckId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column final_measuret_check.order_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column final_measuret_check.check_item
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max=40, message="检验项目的长度限制在40个字符之内")
    private String checkItem;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column final_measuret_check.cdate
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private Date cdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column final_measuret_check.measure_data
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max=2000, message="实际测量数据的长度限制在2000个字符之内")
    private String measureData;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column final_measuret_check.emp_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String empId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column final_measuret_check.result
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max=2000, message="校验结果的长度限制在2000个字符之内")
    private String result;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column final_measuret_check.note
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max=5000, message="{note.length.error}")
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column final_measuret_check.f_measure_check_id
     *
     * @return the value of final_measuret_check.f_measure_check_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getfMeasureCheckId() {
        return fMeasureCheckId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column final_measuret_check.f_measure_check_id
     *
     * @param fMeasureCheckId the value for final_measuret_check.f_measure_check_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setfMeasureCheckId(String fMeasureCheckId) {
        this.fMeasureCheckId = fMeasureCheckId == null ? null : fMeasureCheckId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column final_measuret_check.order_id
     *
     * @return the value of final_measuret_check.order_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column final_measuret_check.order_id
     *
     * @param orderId the value for final_measuret_check.order_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column final_measuret_check.check_item
     *
     * @return the value of final_measuret_check.check_item
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getCheckItem() {
        return checkItem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column final_measuret_check.check_item
     *
     * @param checkItem the value for final_measuret_check.check_item
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setCheckItem(String checkItem) {
        this.checkItem = checkItem == null ? null : checkItem.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column final_measuret_check.cdate
     *
     * @return the value of final_measuret_check.cdate
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public Date getCdate() {
        return cdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column final_measuret_check.cdate
     *
     * @param cdate the value for final_measuret_check.cdate
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column final_measuret_check.measure_data
     *
     * @return the value of final_measuret_check.measure_data
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getMeasureData() {
        return measureData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column final_measuret_check.measure_data
     *
     * @param measureData the value for final_measuret_check.measure_data
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setMeasureData(String measureData) {
        this.measureData = measureData == null ? null : measureData.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column final_measuret_check.emp_id
     *
     * @return the value of final_measuret_check.emp_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getEmpId() {
        return empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column final_measuret_check.emp_id
     *
     * @param empId the value for final_measuret_check.emp_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column final_measuret_check.result
     *
     * @return the value of final_measuret_check.result
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column final_measuret_check.result
     *
     * @param result the value for final_measuret_check.result
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column final_measuret_check.note
     *
     * @return the value of final_measuret_check.note
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column final_measuret_check.note
     *
     * @param note the value for final_measuret_check.note
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}