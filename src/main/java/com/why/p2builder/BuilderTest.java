package com.why.p2builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BuilderTest {
    private String name;
    private String address;

    private String sex;

    private String age;
    private String phone;

    private String imageUrl;
    private String idCard;
}
