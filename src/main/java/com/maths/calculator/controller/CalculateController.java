package com.maths.calculator.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maths.calculator.model.Calculator;
import com.maths.calculator.model.CalculatorResponse;

/**
 * This is a rest controller class
 *
 * maps api request
 * 
 */

@RestController
@RequestMapping("/api")
public class CalculateController {

	@PostMapping("/add")
	public CalculatorResponse doSum(@RequestBody Calculator calculate) {
		return new CalculatorResponse(calculate.getX() + calculate.getY());

	}

	@PostMapping("/diff")
	public CalculatorResponse doDiff(@RequestBody Calculator calculate) {
		return new CalculatorResponse(calculate.getX() - calculate.getY());

	}

}
