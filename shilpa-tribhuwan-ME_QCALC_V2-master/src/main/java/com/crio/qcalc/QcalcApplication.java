package com.crio.qcalc;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
//		SpringApplication.run(QcalcApplication.class, args);
		System.out.println("Hello world!!");

		/*StandardCalculator calc = new StandardCalculator();
		calc.subtract(-Double.MAX_VALUE, Double.MAX_VALUE);
		System.out.println(calc.getResult());

		/*ScientificCalculator sc = new ScientificCalculator();
		sc.square(25);
		System.out.println(sc.getResult());*/

		LogicCalculator calc = new LogicCalculator();
		calc.AND(8, 6);
		calc.printResult();
	}

}
