package com.marpol.hello.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
@Builder
public class BBsDto {

	private long b_seq;	//bigint
	private long b_pseq;	//bigint
	private String b_date; //	varchar(10)
	private String b_time; //	varchar(10)
	private String b_username; //	varchar(125)
	private String b_subject; //	varchar(125)
	private String b_content; //	text
	private int b_count; //	int
	private String b_image; //	varchar(125)
	
}
