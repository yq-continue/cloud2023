package com.atyang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yang
 * @create 2023-05-27 23:36
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;

    private Integer age;

    private String job;
}
