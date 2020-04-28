package com.example.javafaker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student{

    /**
     * 姓名
     */
    private String name;

    /**
     * 分数
     */
    private double score;

}
