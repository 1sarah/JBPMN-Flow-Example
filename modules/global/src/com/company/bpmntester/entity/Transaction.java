package com.company.bpmntester.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "BPMNTESTER_TRANSACTION")
@Entity(name = "bpmntester_Transaction")
@NamePattern("%s|description")
public class Transaction extends StandardEntity {
    private static final long serialVersionUID = -8609730644768321491L;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CHECK_NO")
    private String checkNo;

    @Column(name = "RECCOMENDATIONS")
    private String reccomendations;

    public String getReccomendations() {
        return reccomendations;
    }

    public void setReccomendations(String reccomendations) {
        this.reccomendations = reccomendations;
    }

    public String getCheckNo() {
        return checkNo;
    }

    public void setCheckNo(String checkNo) {
        this.checkNo = checkNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}