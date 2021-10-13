package com.training.ifaces;

public interface DataAcess {

	public boolean add(Object o);
	 public Object[] findAll();
	    public Object findByID(int id);
    public int upadate(Object obj);
    public int remove(Object obj);
}
