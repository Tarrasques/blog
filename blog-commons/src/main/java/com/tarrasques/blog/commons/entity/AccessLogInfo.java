package com.tarrasques.blog.commons.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@ToString
@EqualsAndHashCode
public class AccessLogInfo {

    private String id;

    private String userName;

    private String accessIp;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date accessTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date accessTimeStart;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date accessTimeEnd;

}