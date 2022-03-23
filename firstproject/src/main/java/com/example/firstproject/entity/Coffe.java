package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity  // 이 어노테이션이 테이블을 만들어 준다고 한다 . 아래 필드는 컬럼을 만들고 ,
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class Coffe {
    @Id
    @GeneratedValue // 자동으로 id 값을 생성 , 1,2,3 ...
    private Long id;

    @Column
    private String Menu;

    @Column
    private String price;

}
