package com.example.mybatisdemo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.ibatis.annotations.Many;

import java.util.List;
import java.util.Set;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Person {

    private Long id;

    private String name;

    private List<Address> address;

    private List<Long> addressIds;
}
