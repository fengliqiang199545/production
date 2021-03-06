package cn.com.taiji.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;
import java.util.Date;

public class MaterialReceive {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_receive.receive_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max = 40 , message = "{id.length.error}")
    private String receiveId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_receive.material_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String materialId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_receive.amount
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Max(value=999999999, message="收入数量过大")
    private Integer amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_receive.receive_date
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private Date receiveDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_receive.sender
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max=40, message="发送者的长度限制在40个字符之内")
    private String sender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_receive.receiver
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max=40, message="接收者的长度限制在40个字符之内")
    private String receiver;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_receive.note
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max=5000, message="{note.length.error}")
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_receive.receive_id
     *
     * @return the value of material_receive.receive_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getReceiveId() {
        return receiveId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_receive.receive_id
     *
     * @param receiveId the value for material_receive.receive_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId == null ? null : receiveId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_receive.material_id
     *
     * @return the value of material_receive.material_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getMaterialId() {
        return materialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_receive.material_id
     *
     * @param materialId the value for material_receive.material_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setMaterialId(String materialId) {
        this.materialId = materialId == null ? null : materialId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_receive.amount
     *
     * @return the value of material_receive.amount
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_receive.amount
     *
     * @param amount the value for material_receive.amount
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_receive.receive_date
     *
     * @return the value of material_receive.receive_date
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public Date getReceiveDate() {
        return receiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_receive.receive_date
     *
     * @param receiveDate the value for material_receive.receive_date
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_receive.sender
     *
     * @return the value of material_receive.sender
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getSender() {
        return sender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_receive.sender
     *
     * @param sender the value for material_receive.sender
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_receive.receiver
     *
     * @return the value of material_receive.receiver
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_receive.receiver
     *
     * @param receiver the value for material_receive.receiver
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_receive.note
     *
     * @return the value of material_receive.note
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_receive.note
     *
     * @param note the value for material_receive.note
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}