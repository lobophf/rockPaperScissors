package game;

public class Hand {
	private int m_id;	
	private String m_name;

	private int[][] comparison = {
	//              rock   paper   scissor
	/* rock */    { 0,    -1,      1}, 
	/* paper */   { 1,     0,     -1}, 
	/* scissor */ {-1,     1,      0}
	};

	public int compareTo(Hand other){
		return comparison[m_id][other.m_id];
	}

	protected int getId(){
		return m_id;
	}

	protected void setId(int id){
		m_id = id;
	}

	public String getName(){
		return m_name;
	}

	public void setName(String name){
		m_name = name;
	}	

	@Override
	public String toString(){
		return m_name;
	}
}
