package cn.com.taiji.domain;

public class Material {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material.material_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String materialId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material.material_type
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String materialType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material.status
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material.remaining
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private Integer remaining;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material.note
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material.material_id
     *
     * @return the value of material.material_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getMaterialId() {
        return materialId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material.material_id
     *
     * @param materialId the value for material.material_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setMaterialId(String materialId) {
        this.materialId = materialId == null ? null : materialId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material.material_type
     *
     * @return the value of material.material_type
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getMaterialType() {
        return materialType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material.material_type
     *
     * @param materialType the value for material.material_type
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setMaterialType(String materialType) {
        this.materialType = materialType == null ? null : materialType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material.status
     *
     * @return the value of material.status
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material.status
     *
     * @param status the value for material.status
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material.remaining
     *
     * @return the value of material.remaining
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public Integer getRemaining() {
        return remaining;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material.remaining
     *
     * @param remaining the value for material.remaining
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material.note
     *
     * @return the value of material.note
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material.note
     *
     * @param note the value for material.note
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}