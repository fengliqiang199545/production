package cn.com.taiji.domain;

import java.util.Date;

public class TechnologyRequirement {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column technology_requirement.technology_requirement_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String technologyRequirementId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column technology_requirement.technology_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String technologyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column technology_requirement.requirement
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private String requirement;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column technology_requirement.add_time
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private Date addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column technology_requirement.revise_time
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    private Date reviseTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column technology_requirement.technology_requirement_id
     *
     * @return the value of technology_requirement.technology_requirement_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getTechnologyRequirementId() {
        return technologyRequirementId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column technology_requirement.technology_requirement_id
     *
     * @param technologyRequirementId the value for technology_requirement.technology_requirement_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setTechnologyRequirementId(String technologyRequirementId) {
        this.technologyRequirementId = technologyRequirementId == null ? null : technologyRequirementId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column technology_requirement.technology_id
     *
     * @return the value of technology_requirement.technology_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getTechnologyId() {
        return technologyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column technology_requirement.technology_id
     *
     * @param technologyId the value for technology_requirement.technology_id
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setTechnologyId(String technologyId) {
        this.technologyId = technologyId == null ? null : technologyId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column technology_requirement.requirement
     *
     * @return the value of technology_requirement.requirement
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public String getRequirement() {
        return requirement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column technology_requirement.requirement
     *
     * @param requirement the value for technology_requirement.requirement
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setRequirement(String requirement) {
        this.requirement = requirement == null ? null : requirement.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column technology_requirement.add_time
     *
     * @return the value of technology_requirement.add_time
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column technology_requirement.add_time
     *
     * @param addTime the value for technology_requirement.add_time
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column technology_requirement.revise_time
     *
     * @return the value of technology_requirement.revise_time
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public Date getReviseTime() {
        return reviseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column technology_requirement.revise_time
     *
     * @param reviseTime the value for technology_requirement.revise_time
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    public void setReviseTime(Date reviseTime) {
        this.reviseTime = reviseTime;
    }
}