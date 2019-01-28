package cn.com.taiji.domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

public class ProcessCountCheck {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_count_check.p_count_check_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max=40, message="{id.length.error}")
    private String pCountCheckId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_count_check.process_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String processId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_count_check.check_item
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max=40, message="检验项目的长度限制在40个字符之内")
    private String checkItem;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_count_check.sample
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Max(value=999999999, message="样本总数不能超过999999999")
    private Integer sample;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_count_check.check_number
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Max(value=999999999, message="抽检数不能超过999999999")
    private Integer checkNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_count_check.unqualify
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Max(value=999999999, message="不合格数不能超过999999999")
    private Integer unqualify;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_count_check.qualify
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Digits(integer=1, fraction=2, message="数据不合法，请输入类似“0.80”")
    private BigDecimal qualify;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_count_check.cdate
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private Date cdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_count_check.measure_data
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max = 2000 , message = "实际测试数据应该控制在2000个字符内")
    private String measureData;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_count_check.emp_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String empId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_count_check.result
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max=2000, message="校验结果的长度限制在2000个字符之内")
    private String result;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column process_count_check.note
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max=5000, message="{note.length.error}")
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_count_check.p_count_check_id
     *
     * @return the value of process_count_check.p_count_check_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getpCountCheckId() {
        return pCountCheckId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_count_check.p_count_check_id
     *
     * @param pCountCheckId the value for process_count_check.p_count_check_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setpCountCheckId(String pCountCheckId) {
        this.pCountCheckId = pCountCheckId == null ? null : pCountCheckId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_count_check.process_id
     *
     * @return the value of process_count_check.process_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_count_check.process_id
     *
     * @param processId the value for process_count_check.process_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setProcessId(String processId) {
        this.processId = processId == null ? null : processId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_count_check.check_item
     *
     * @return the value of process_count_check.check_item
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getCheckItem() {
        return checkItem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_count_check.check_item
     *
     * @param checkItem the value for process_count_check.check_item
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setCheckItem(String checkItem) {
        this.checkItem = checkItem == null ? null : checkItem.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_count_check.sample
     *
     * @return the value of process_count_check.sample
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public Integer getSample() {
        return sample;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_count_check.sample
     *
     * @param sample the value for process_count_check.sample
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setSample(Integer sample) {
        this.sample = sample;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_count_check.check_number
     *
     * @return the value of process_count_check.check_number
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public Integer getCheckNumber() {
        return checkNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_count_check.check_number
     *
     * @param checkNumber the value for process_count_check.check_number
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setCheckNumber(Integer checkNumber) {
        this.checkNumber = checkNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_count_check.unqualify
     *
     * @return the value of process_count_check.unqualify
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public Integer getUnqualify() {
        return unqualify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_count_check.unqualify
     *
     * @param unqualify the value for process_count_check.unqualify
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setUnqualify(Integer unqualify) {
        this.unqualify = unqualify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_count_check.qualify
     *
     * @return the value of process_count_check.qualify
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public BigDecimal getQualify() {
        return qualify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_count_check.qualify
     *
     * @param qualify the value for process_count_check.qualify
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setQualify(BigDecimal qualify) {
        this.qualify = qualify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_count_check.cdate
     *
     * @return the value of process_count_check.cdate
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public Date getCdate() {
        return cdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_count_check.cdate
     *
     * @param cdate the value for process_count_check.cdate
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_count_check.measure_data
     *
     * @return the value of process_count_check.measure_data
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getMeasureData() {
        return measureData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_count_check.measure_data
     *
     * @param measureData the value for process_count_check.measure_data
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setMeasureData(String measureData) {
        this.measureData = measureData == null ? null : measureData.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_count_check.emp_id
     *
     * @return the value of process_count_check.emp_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getEmpId() {
        return empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_count_check.emp_id
     *
     * @param empId the value for process_count_check.emp_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_count_check.result
     *
     * @return the value of process_count_check.result
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_count_check.result
     *
     * @param result the value for process_count_check.result
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column process_count_check.note
     *
     * @return the value of process_count_check.note
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column process_count_check.note
     *
     * @param note the value for process_count_check.note
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}