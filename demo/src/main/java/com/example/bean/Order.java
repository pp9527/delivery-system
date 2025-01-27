package com.example.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: pwz
 * @create: 2022/9/13 11:37
 * @Description:
 * @FileName: Order
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("order_record")
public class Order {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private int model;
    private String startStation;
    private double desLongitude;
    private double desLatitude;
    private double privacyLongitude;
    private double privacyLatitude;
    private int orderId;
    private String consignee;
    private int length;
    private int width;
    private double weight;
    private String goods;
    private int deadline;  //   单位s
    private int status; // 默认0:未发货  1:运输中  2:超时  3:已完成
    private String info;
    private boolean privacyStatus; //隐私保护状态 启用为1
    private String route;
    private int time;
    private int energy;
    @TableField(exist = false)
    private String lastStation;
    @TableField(exist = false)
    private String nextStation;
}