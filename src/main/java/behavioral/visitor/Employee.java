package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {

	private Integer id;
	private String name;
	private Double performanceRating;

	public Employee(Integer id, String name, Double performanceRating) {
		this.id = id;
		this.name = name;
		this.performanceRating = performanceRating;
	}

	public abstract void accept(EmployeeVisitor visitor);

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPerformanceRating() {
		return performanceRating;
	}

	public void setPerformanceRating(Double performanceRating) {
		this.performanceRating = performanceRating;
	}

}
