package cn.com.taiji.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

public class COrder {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_order.order_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max = 40 , message = "{id.length.error}")
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_order.custom_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max = 40 , message = "{id.length.error}")
    private String customId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_order.product_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max = 40 , message = "{id.length.error}")
    private String productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_order.order_date
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private Date orderDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_order.request_date
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private Date requestDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_order.note
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max = 5000 , message = "{note.length.error}")
    private String note;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_order.quantity
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Max(value = 999999999 , message = "订购数量不能超过999999999")
    private Integer quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_order.unit_price
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Max(value = 999999999 , message = "单价不能超过999999999")
    private BigDecimal unitPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_order.unit
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    @Size(max = 10 , message = "单位的长度限制在10个字符以内")
    private String unit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_order.image
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String image;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_order.file
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String file;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column c_order.status
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_order.order_id
     *
     * @return the value of c_order.order_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_order.order_id
     *
     * @param orderId the value for c_order.order_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_order.custom_id
     *
     * @return the value of c_order.custom_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getCustomId() {
        return customId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_order.custom_id
     *
     * @param customId the value for c_order.custom_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setCustomId(String customId) {
        this.customId = customId == null ? null : customId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_order.product_id
     *
     * @return the value of c_order.product_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_order.product_id
     *
     * @param productId the value for c_order.product_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_order.order_date
     *
     * @return the value of c_order.order_date
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_order.order_date
     *
     * @param orderDate the value for c_order.order_date
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_order.request_date
     *
     * @return the value of c_order.request_date
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public Date getRequestDate() {
        return requestDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_order.request_date
     *
     * @param requestDate the value for c_order.request_date
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_order.note
     *
     * @return the value of c_order.note
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_order.note
     *
     * @param note the value for c_order.note
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_order.quantity
     *
     * @return the value of c_order.quantity
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_order.quantity
     *
     * @param quantity the value for c_order.quantity
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_order.unit_price
     *
     * @return the value of c_order.unit_price
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_order.unit_price
     *
     * @param unitPrice the value for c_order.unit_price
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_order.unit
     *
     * @return the value of c_order.unit
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_order.unit
     *
     * @param unit the value for c_order.unit
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_order.image
     *
     * @return the value of c_order.image
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_order.image
     *
     * @param image the value for c_order.image
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_order.file
     *
     * @return the value of c_order.file
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getFile() {
        return file;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_order.file
     *
     * @param file the value for c_order.file
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column c_order.status
     *
     * @return the value of c_order.status
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column c_order.status
     *
     * @param status the value for c_order.status
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}