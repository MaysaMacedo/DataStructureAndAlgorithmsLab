package adt.skipList;

public class SkipNode<V> {

	//a chave do root eh Integer.MIN_VALUE e a do NIL eh Integer.MAX_VALUE
	protected int key;
	protected int height;
	protected V satteliteData;
	protected SkipNode<V>[] forward;
	
	public SkipNode(int key, int height, V satelliteData){
		this.key = key;
		this.height = height;
		this.satteliteData = satelliteData;
		this.forward = new SkipNode[height];
	}
	
		
	@Override
	public String toString(){
		String result = "";
		if(this.key == Integer.MIN_VALUE){
			result = "<ROOT," + this.height + "," + this.countForwardsNotNull() + ">";
		}else if(this.key == Integer.MAX_VALUE){
			result = "<NIL," + this.height + ">";
		}else{
			result = "<" + this.key + "," + this.height + ">";
		}
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		boolean resp = false;
		if(obj instanceof SkipNode){
			resp = this.key == ((SkipNode<V>)obj).key 
					&& this.height == ((SkipNode<V>)obj).height
					&& this.countForwardsNotNull() == ((SkipNode<V>)obj).countForwardsNotNull();
		}
		return resp;
	}
	private int countForwardsNotNull(){
		int resp = 0;
		for (int i = 0; i < forward.length; i++) {
			if(forward[i] != null){
				resp++;
			}
		}
		return resp;
	}


	public SkipNode<V>[] getForward() {
		return forward;
	}
	
	public SkipNode<V> getForward(int level) {
		return forward[level];
	}


	public int getKey() {
		return key;
	}
}
