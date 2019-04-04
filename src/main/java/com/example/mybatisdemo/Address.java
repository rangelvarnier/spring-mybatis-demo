package com.example.mybatisdemo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString(of = {"id", "description"})
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Address {

    private Long id;

    private String description;
}
