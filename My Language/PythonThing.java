import java.util.*;

public class PythonThing {
	public static HashMap<String, Object> IDVals = new HashMap<String, Object>();
	public static HashMap<String, ArrayList<Object>>  tupleVals = new HashMap<String, ArrayList<Object>>();
	public static ArrayList<Object> unpack = new ArrayList<>();
	
	
	public static void assign(String ID, Object val)
	{
	    IDVals.put(ID, val);
	    
	    if (tupleVals.containsKey(ID))
	    {
	      tupleVals.remove(ID);
	    }
	  }
	
	public static void addID(String ID1, String ID2)
	{
		if (IDVals.get(ID2) instanceof Integer)
			addINT(ID1, (Integer) IDVals.get(ID2));
		
		if (IDVals.get(ID2) instanceof String)
			strConcat(ID1, (String) IDVals.get(ID2));
	}
	
	public static void add(String ID, Object val)
	{
		if (val instanceof Integer)
			addINT(ID, (Integer) val);
		else if (val instanceof String)
			strConcat(ID, (String) val);
	}
	
	public static void addINT(String ID, Integer val)
	{
		IDVals.replace(ID, (Integer) IDVals.get(ID) + val);
	}
	
	public static void strConcat(String ID, String val)
	{
		IDVals.replace(ID, (String) IDVals.get(ID) + val);
	}
	
	public static void tupleUpdate(String ID, Integer index, Object val)
	{
		ArrayList<Object> update = tupleVals.get(ID);
		update.add(index, val);
	}
	
	public static Object tupleIndex(String ID, Integer i)
	{
		ArrayList<Object> tuple = tupleVals.get(ID);
		return tuple.get(i-1);
	}
	
	public static Object indexing(String ID, Object i)
	{
		if (i instanceof Integer)
		{
			return tupleIndex(ID, (Integer) i);
		}
		return null;
	}
	
	public static void tuplePush(String ID1, Integer index, String ID2)
	{
		ArrayList<Object> original = tupleVals.get(ID1);
		ArrayList<Object> added = tupleVals.get(ID2);
		original.add(index, added);
	}
	
	public static void assignTuple(String ID)
	{
	    tupleVals.put(ID, new ArrayList<Object>());
	    
	    if (IDVals.containsKey(ID))
	    {
	      IDVals.remove(ID);
	    }
	  }
	
	public static void unpackSet(Object val)
	{
			unpack.add(val);
	}
	
	public static void unpackCreate(String ID)
	{
		assignTuple(ID);
		ArrayList<Object> array = tupleVals.get(ID);
		
		for (Object stuff : unpack)
		{
			array.add(stuff);
		}
		unpack.clear();
	}
	
	public static Object tupleSlice(String ID, Object start, Object stop)
	{
		int begin, end;
		if (tupleVals.containsKey(ID))
		{
			ArrayList<Object> slice = tupleVals.get(ID);
			ArrayList<Object> copy = new ArrayList<Object>();
			if (start == null)
			{
				begin = 0;
				if (stop == null)
				{
					end = slice.size();
					for (int i = begin; i < end; i++)
					{
						copy.add(slice.get(i));
					}
					return copy;
				}
				else if (stop instanceof Integer)
				{
					end = ((Integer) stop) - 1;
					for (int i = begin; i < end; i++)
					{
						copy.add(slice.get(i));
					}
					return copy;
				}
			}
			else if (start instanceof Integer)
			{
				begin = ((Integer) start) - 1;
				if (stop == null)
				{
					end = slice.size();
					for (int i = begin; i < end; i++)
					{
						copy.add(slice.get(i));
					}
					return copy;
				}
				else if (stop instanceof Integer)
				{
					end = (Integer) stop;
					for (int i = begin; i < end; i++)
					{
						copy.add(slice.get(i));
					}
					return copy;
				}
			}
		}
		return null;
	}
	
	public static void tupleSliceAssign(String ID1, String ID2, String start, String stop)
	{
		ArrayList<Object> slice = tupleVals.get(ID1);
		ArrayList<Object> copy = tupleVals.get(ID2);
		int begin, end;
		
		if (start == null) begin = 0;
		else begin = Integer.parseInt(start);
		
		if (stop == null) end = copy.size();
		else end = Integer.parseInt(stop);
		
		for (int i = begin; i < end; i++)
		{
			slice.add(copy.get(i));
		}
	}
	
	public static void tupleConcat(String ID1, String ID2)
	{
		
		if (tupleVals.containsKey(ID1) && tupleVals.containsKey(ID2))
		{
			ArrayList<Object> original, concat;
			original = tupleVals.get(ID1);
			concat = tupleVals.get(ID2);
			for (Object tupleBits : concat)
			{
		        original.add(tupleBits);
			}
		}
		if (IDVals.get(ID2) instanceof Integer && !IDVals.containsKey(ID1) && !(IDVals.get(ID1) instanceof String))
			assign(ID1, 0);
		else if (IDVals.get(ID2) instanceof String && !IDVals.containsKey(ID1) && !(IDVals.get(ID1) instanceof Integer))
			assign(ID1, "");
		addID(ID1, ID2);
	}
		
	
	public static void tupleCreate(String ID, Object val)
	{
		ArrayList<Object> create = tupleVals.get(ID);
		create.add(val);
	}
	
	public static void println(Object val)
	{
		System.out.println(val.toString());
	}
	
	public static Object getValue(String ID)
	{
		if (IDVals.containsKey(ID))
			return IDVals.get(ID);
		else if (tupleVals.containsKey(ID))
			return tupleVals.get(ID);
		return null;
	}
	
	
	public static void main(String[] args) {
	  
	}

}