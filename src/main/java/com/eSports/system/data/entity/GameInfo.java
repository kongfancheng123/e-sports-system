package com.eSports.system.data.entity;

import lombok.Data;

import java.util.Date;


@Data
public class GameInfo {
    /**
     * id
     */
    private Integer id;
    /**
     * 赛事简称
     */
    private String gameName;
    /**
     * 赛事描述
     */
    private String gameDesc;
    /**
     * 赛事时间
     */
    private Date gameTime;
    /**
     * 赛事比分
     */
    private String gameScore;

}
