package com.bloodnet.api.model;

public class TblSession {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_session.session_id
     *
     * @mbggenerated Thu Apr 13 22:20:22 JST 2017
     */
    private String sessionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_session.user_id
     *
     * @mbggenerated Thu Apr 13 22:20:22 JST 2017
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_session.create_dt
     *
     * @mbggenerated Thu Apr 13 22:20:22 JST 2017
     */
    private String createDt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_session.session_id
     *
     * @return the value of tbl_session.session_id
     *
     * @mbggenerated Thu Apr 13 22:20:22 JST 2017
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_session.session_id
     *
     * @param sessionId the value for tbl_session.session_id
     *
     * @mbggenerated Thu Apr 13 22:20:22 JST 2017
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_session.user_id
     *
     * @return the value of tbl_session.user_id
     *
     * @mbggenerated Thu Apr 13 22:20:22 JST 2017
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_session.user_id
     *
     * @param userId the value for tbl_session.user_id
     *
     * @mbggenerated Thu Apr 13 22:20:22 JST 2017
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_session.create_dt
     *
     * @return the value of tbl_session.create_dt
     *
     * @mbggenerated Thu Apr 13 22:20:22 JST 2017
     */
    public String getCreateDt() {
        return createDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_session.create_dt
     *
     * @param createDt the value for tbl_session.create_dt
     *
     * @mbggenerated Thu Apr 13 22:20:22 JST 2017
     */
    public void setCreateDt(String createDt) {
        this.createDt = createDt == null ? null : createDt.trim();
    }
}