package com.mozcalti.training.spring.boot.helloworld.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Getter
public class Greet {
	private String name;
}
