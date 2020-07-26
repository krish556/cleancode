public class Construct {

	public double constructionCost(String material_type,double a,boolean aut) {
		if(material_type.equals("standard") && aut==false) {
			return 1200*a;
		}
		else if(material_type.equals("above standard") && aut==false) {
			return 1500*a;
		}
		else if(material_type.equals("high standard") && aut==false) {
			return 1800*a;
		}
		else {
			return 2500*a;
		}
	}
}