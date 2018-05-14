package com.xiu.combination10.eg;

public class Context {
	
	StringBuilder SqlBuilder = new StringBuilder();
	
	public String getSql(){
		return SqlBuilder.toString();
	}
	public void appendSql(String str){
		this.SqlBuilder.append(str);
	}
}
