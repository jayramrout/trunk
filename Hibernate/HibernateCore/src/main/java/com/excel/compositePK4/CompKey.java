package com.excel.compositePK4;


import java.io.Serializable;

public class CompKey implements Serializable {

private int cid, tid;


public CompKey()
{
}

public CompKey(int cid,int tid)
{
	setCid(cid);
	setTid(tid);
}

public void setCid(int cid) 
{
	this.cid = cid;
}

public void setTid(int tid)
{
	this.tid = tid;
}

public int getCid()
{
	return this.cid;
}

public int getTid()
{
	return this.tid;
}

}
