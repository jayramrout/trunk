package jrout.tutorial.hibernatecore.compositePK4;

import java.io.Serializable;

public class CompositeKey implements Serializable {

	private int cid, tid;

	public CompositeKey() {
	}

	public CompositeKey(int cid, int tid) {
		setCid(cid);
		setTid(tid);
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getCid() {
		return this.cid;
	}

	public int getTid() {
		return this.tid;
	}

}
