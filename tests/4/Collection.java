public class Collection{

    private ArrayList<interval> collection;
    private int lastInterval; // last used index in the collection

    public boolean Overlap(interval a, interval b){
	// complementary 
	return (!(a.getHigh() < b.getLow()) || (a.getLow() > b.getHigh()));
    }

    public interval doUnion(interval a, interval b){
	if (!(Overlap(a, b)))
	    return null;
	else {
	    int low, high;
	    if (a.getLow() < b.getLow())
		low = a.getLow();
	    else
		low = b.getLow();
	    if (a.getHigh() > b.getHigh())
		high = a.getHigh();
	    else
		high = b.getHigh();
	    return new Interval(low, high);
	}
    }

    public void addInterval(interval n){
	int i = 0;
	while (i < Collection.size()){
	    if (Overlap(Collection.get(i), n)){
		n = doUnion(n, Collection.get(i));
		Collection.remove(i);
	    }
	    else if (n.getHigh() < Collection.get(i).getLow()){
		c.add(i,n);
	    }
	}
	// ambiguous as to what "proper place" is
	c.add(n);
    }
    
}
