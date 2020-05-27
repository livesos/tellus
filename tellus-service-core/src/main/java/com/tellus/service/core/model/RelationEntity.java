package com.tellus.service.core.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

/**
 * <p>
 * 层级关系表 层级关系
 * </p>
 *
 * @author Roy.l
 * @since 2020-05-25
 */
@TableName("t_relation")
public class RelationEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 关系类型 1-用户，2-组织，3-角色，4-菜单
     */
    @TableId("TYPE")
    private Integer type;

    /**
     * 祖先，上级ID 祖先ID
     */
    @TableField("ANCESTOR")
    private Integer ancestor;

    /**
     * 后代，下级ID 后代ID
     */
    @TableField("DESCENDANT")
    private Integer descendant;

    /**
     * 隔代，祖先与后代的距离 祖先与后代的隔代距离
     */
    @TableField("DISTANCE")
    private Integer distance;


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getAncestor() {
        return ancestor;
    }

    public void setAncestor(Integer ancestor) {
        this.ancestor = ancestor;
    }

    public Integer getDescendant() {
        return descendant;
    }

    public void setDescendant(Integer descendant) {
        this.descendant = descendant;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "RelationEntity{" +
                "type=" + type +
                ", ancestor=" + ancestor +
                ", descendant=" + descendant +
                ", distance=" + distance +
                "}";
    }
}
