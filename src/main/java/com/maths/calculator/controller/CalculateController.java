package com.maths.calculator.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maths.calculator.model.Calculator;

@RestController
@RequestMapping("/api")
public class CalculateController {
	
	 @PutMapping("/add")
	  public ResponseEntity<Map<String, Integer>> doSum(int x, int y) {

		 Calculator calculate = new Calculator();

		 calculate.setValueX(x);
		 calculate.setValueY(y);
	   
		 int sum = calculate.getValueX() + calculate.getValueY();
		 
		 Map <String, Integer> response = new HashMap<>();
		 response.put("result", sum);  
	    return ResponseEntity.ok(response);
	  }

}
