package week3.day6;


public class Tnpetrolprice extends Findprice {

	public float getsgtaxes() {
		return (float) ((getcgtaxes() + getoriginalprice()) * 0.25f);
			}
	 
	public float getfinalprice() {
		return getoriginalprice() + getcgtaxes() +getsgtaxes() ;
	}

	public float getoriginalprice() {
		// TODO Auto-generated method stub
		return 0;
	}

		public void run() {
			
		}
	}
	


}
