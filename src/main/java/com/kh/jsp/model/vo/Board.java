package com.kh.jsp.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Board {
    private int boardNo;
    private int boardType;
    private int categoryNo;
    private String boardTitle;
    private String boardContent;
    private String boardWriter;
    private int count;
    private Date createDate;
    private String status;

    // JOIN 조회 시 카테고리명을 담기 위한 필드
    private String categoryName;
    
    // JOIN 조회 시 작성자 이름을 담기 위한 필드
    private String boardWriterName;
}