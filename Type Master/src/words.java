
ArrayList<String> al = new ArrayList<String>();
	
	public ArrayList<String> creation() {
			if(hj==0){
	    al.add("this");
		al.add("is");
		al.add("highlight");
		al.add("exercise");
		al.add("inside");
		al.add("start");
		al.add("deleting");
		al.add("tapping");
		al.add("copying");
		al.add("whenever");
		al.add("control");
		al.add("the");
		al.add("inter");
		al.add("implement");
		al.add("creation");
		al.add("extends");
		al.add("java");
		al.add("import");
		al.add("public");
		hj++;
		}
		if(ik==0){
			ik++;
			Collections.shuffle(al);
			return al;
		}
			
			return al;
		}
	  public String method2(int a) {
		ArrayList<String> al1 = new ArrayList<String>();
	al1=creation();
	return al1.get(a);
	}