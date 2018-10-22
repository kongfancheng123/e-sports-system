package com.agioe.tool.data.Qo;

import lombok.Data;

@Data
public class GetPropertyByTypeAndTemplateAndParentNodeQo {
    /**
     * 设备类型编码
     */
    private String equipmentTypeCode;
    /**
     * 模板编码
     */
    private String equipmentPropertyTemplateCode;
    /**
     * 上层节点编码
     */
    private String parentNodeCode;
}