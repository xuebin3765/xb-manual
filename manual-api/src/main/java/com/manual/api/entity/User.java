package com.manual.api.entity;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * desc: 用户基本信息类
 * author: xuebin3765@163.com
 * date: 2019/09/23
 */
@Data
@Table
@Entity
public class User implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String userName;
    @Column
    private String password;

}
