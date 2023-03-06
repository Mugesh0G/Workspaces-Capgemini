package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HitsTotal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	int total;
	@Column
	double max;
	@Column
	HitsTotal2 hits;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}
	public HitsTotal2 getHits() {
		return hits;
	}
	public void setHits(HitsTotal2 hits) {
		this.hits = hits;
	}
	@Override
	public String toString() {
		return "HitsTotal [id=" + id + ", total=" + total + ", max=" + max + ", hits=" + hits + "]";
	}
	public HitsTotal(int id, int total, double max, HitsTotal2 hits) {
		super();
		this.id = id;
		this.total = total;
		this.max = max;
		this.hits = hits;
	}
	public HitsTotal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
