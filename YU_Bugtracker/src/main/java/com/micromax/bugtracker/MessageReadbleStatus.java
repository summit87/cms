package com.micromax.bugtracker;

//Generated Nov 23, 2015 3:23:27 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
* MessageReadbleStatus generated by hbm2java
*/
@Entity
@Table(name="message_readble_status")
public class MessageReadbleStatus  implements java.io.Serializable {

	private int id;
    private PrivateMessages privateMessages;
    private Integer userId;
    private String column1;
    private String column2;
    private String column3;
    private String column4;
    private String column5;
    private Byte isReadble;

   public MessageReadbleStatus() {
   }

	
   public MessageReadbleStatus(int id) {
       this.id = id;
   }
   public MessageReadbleStatus(int id, PrivateMessages privateMessages, Integer userId, String column1, String column2, String column3, String column4, String column5, Byte isReadble) {
      this.id = id;
      this.privateMessages = privateMessages;
      this.userId = userId;
      this.column1 = column1;
      this.column2 = column2;
      this.column3 = column3;
      this.column4 = column4;
      this.column5 = column5;
      this.isReadble = isReadble;
   }
  
    @Id 

   
   @Column(name="id", unique=true, nullable=false)
   public int getId() {
       return this.id;
   }
   
   public void setId(int id) {
       this.id = id;
   }

   @ManyToOne(fetch=FetchType.EAGER)
   @JoinColumn(name="message_id")
   @JsonIgnore
   public PrivateMessages getPrivateMessages() {
       return this.privateMessages;
   }
   
   public void setPrivateMessages(PrivateMessages privateMessages) {
       this.privateMessages = privateMessages;
   }

   
   @Column(name="user_id")
   public Integer getUserId() {
       return this.userId;
   }
   
   public void setUserId(Integer userId) {
       this.userId = userId;
   }

   
   @Column(name="column1", length=45)
   public String getColumn1() {
       return this.column1;
   }
   
   public void setColumn1(String column1) {
       this.column1 = column1;
   }

   
   @Column(name="column2", length=45)
   public String getColumn2() {
       return this.column2;
   }
   
   public void setColumn2(String column2) {
       this.column2 = column2;
   }

   
   @Column(name="column3", length=45)
   public String getColumn3() {
       return this.column3;
   }
   
   public void setColumn3(String column3) {
       this.column3 = column3;
   }

   
   @Column(name="column4", length=45)
   public String getColumn4() {
       return this.column4;
   }
   
   public void setColumn4(String column4) {
       this.column4 = column4;
   }

   
   @Column(name="column5", length=45)
   public String getColumn5() {
       return this.column5;
   }
   
   public void setColumn5(String column5) {
       this.column5 = column5;
   }

   
   @Column(name="is_readble")
   public Byte getIsReadble() {
       return this.isReadble;
   }
   
   public void setIsReadble(Byte isReadble) {
       this.isReadble = isReadble;
   }




}

