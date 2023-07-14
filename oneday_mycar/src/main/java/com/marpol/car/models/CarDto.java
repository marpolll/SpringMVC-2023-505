package com.marpol.car.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Setter
@Getter
public class CarDto {

	private long c_no;   	//bigint
	private String c_title;	//varchar(5)
	private String c_ddate; //	varchar(15)
	private String c_dtime; //	varchar(15)
	private String c_ddis; //	varchar(10)
	private String c_edate; //	varchar(15)
	private String c_etime; //	varchar(15)
	private String c_edis; //	varchar(10)
	private String c_place; //	varchar(50)
	private String c_cost; //	varchar(10)
	
}
