package com.marpol.rent.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class RentBookDto {
	
	private String r_seq; //	bigint
	private String r_date; // 	varchar(10)
	private String r_return_date; //	varchar(10)
	private String r_bcode; //	varchar(13)
	private String r_mcode; //	varchar(6)
	private String r_return_yn; //	varchar(1)
	private int r_point; //	int
	private int r_price; //	int

}
