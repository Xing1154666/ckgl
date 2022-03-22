package com.mmm.xyl.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author testjava
 * @since 2022-03-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Goods对象", description="")
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer num;

    @TableField("unitPrice")
    private Double unitPrice;

    private String sort;

    private Float price;

    @TableField("typeId")
    private Integer typeId;

    @TableField("inoutTime")
    private Date inoutTime;


}
