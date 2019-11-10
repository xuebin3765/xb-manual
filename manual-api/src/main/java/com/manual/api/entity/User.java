package com.manual.api.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * desc: 用户基本信息类
 * author: xuebin3765@163.com
 * date: 2019/09/23
 */
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class User implements Serializable {

    @Id
    @Column(length = 64)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false, length = 64)
    private String userName;
    @Column(nullable = false, length = 64)
    private String password;
    @Column(length = 3)
    private long createTime;
    @Column(length = 32)
    private long modifyTime;
    @Column(length = 64)
    private String email;
    @Column(length = 16)
    private String phoneNumber;

}
