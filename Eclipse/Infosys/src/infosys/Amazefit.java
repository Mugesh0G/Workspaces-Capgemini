package infosys;

import java.util.ArrayList;

class Sport{
		 static String sportsNameArr[]= {"Rugby","Basketball","Volleyball"};
		 static double weightHeightIndexArr[]= {0.35,0.39,0.37};
		 String sportName;
		 double sportParticipationCost;
		 Athelete athelete;
		 
		public static String[] getSportsNameArr() {
			return sportsNameArr;
		}
		public static void setSportsNameArr(String[] sportsNameArr) {
			Sport.sportsNameArr = sportsNameArr;
		}
		public static double[] getWeightHeightIndexArr() {
			return weightHeightIndexArr;
		}
		public static void setWeightHeightIndexArr(double[] weightHeightIndexArr) {
			Sport.weightHeightIndexArr = weightHeightIndexArr;
		}
		public String getSportName() {
			return sportName;
		}
		public void setSportName(String sportName) {
			this.sportName = sportName;
		}
		public double getSportParticipationCost() {
			return sportParticipationCost;
		}
		public void setSportParticipationCost(double sportParticipationCost) {
			this.sportParticipationCost = sportParticipationCost;
		}
		public Athelete getAthelete() {
			return athelete;
		}
		public void setAthelete(Athelete athelete) {
			this.athelete = athelete;
		}
		
		//checkEligiblity() 
		public boolean checkEligiblity() 
		{
			int eligiblityCount = 0;
			Athelete valid = new Athelete(); 
			
			if(valid.validateAthelete(athelete)== true)
			{
				
				for(int loop =0;loop<sportsNameArr.length;loop++){
					
				if(athelete.getSpecializedSport().equalsIgnoreCase(sportsNameArr[loop])) 
				{
					eligiblityCount += 1;
					break;
				}
				
				else {
					eligiblityCount = 0;
				}
				
				}
			}
				if(eligiblityCount >= 1) {
					return true;
				}
				else {
					return false;
				}
					 
		}
		
		//participationCost()
		public double participationCost() {
			if(checkEligiblity()==true) {
				double cost = athelete.weight/athelete.height;
				cost = Math.round(cost*100.0)/100.0;
				for(int count =0;count<weightHeightIndexArr.length;count++) {
				if(cost == weightHeightIndexArr[count]  ) {
					sportParticipationCost = (cost+7000*0.1)+7000;
					break;
				}
				else {
					sportParticipationCost = -1.0;
				}
				}
			}
			else {
				sportParticipationCost = -1.0;
			}
			return sportParticipationCost;
			
		}
		
		
	}
	
	 class Athelete{
		String Name;
		int age;
		double weight;
		double height;
		String specializedSport;
		String atheleteId;
		static int count;
		static int frequency = 1000;
		static ArrayList <String> ids = new ArrayList<String>();
		
		static int countid;
		
		public String getAtheleteId() {
			return atheleteId;
		}
		public void setAtheleteId() {
			this.atheleteId = generateAtheleteId();
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			this.weight = weight;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		public String getSpecializedSport() {
			return specializedSport;
		}
		public void setSpecializedSport(String specializedSport) {
			this.specializedSport = specializedSport;
		}
		public static int getCount() {
			return count;
		}
		public static void setCount(int count) {
			Athelete.count = count;
		}
		
		// generateAtheleteId()
		public  String generateAtheleteId() {
			 frequency = frequency+1;
			char sport = (specializedSport.charAt(specializedSport.length()-1));
			String generatedId = "A"+Name.charAt(0)+(frequency)+sport; 
			ids.add(generatedId);
			countid = countid+1;
			return generatedId;
		}
		//validateAthelete();
		public boolean validateAthelete(Athelete athelete) {
			int count =0;
			for(String x : ids) {
			if(athelete.getAtheleteId().equals(x)) {
				count+=1;
				break;
			}
			else {
			count =0;
			}
			}
			
			if(count>=1) {
				return true;
			}
			else {
				return false;
			}
		}
		
		
	}
	
	public class Amazefit {
	public static void main(String[] args) {
		Athelete obj = new Athelete();
		obj.setName("Java");
		obj.setAge(21);
		obj.setSpecializedSport("Rugby");
		obj.setAtheleteId();
		System.out.println(obj.getAtheleteId());
		
		Athelete obj1 = new Athelete();
		obj1.setName("python");
		obj1.setHeight(172);
		obj1.setWeight(60);
		obj1.setSpecializedSport("volleyball");
		obj1.setAtheleteId();
		System.out.println(obj1.getAtheleteId());

		Athelete obj2 = new Athelete();
		obj2.setName("python");
		obj2.setSpecializedSport("Football");
		obj2.setAtheleteId();
		System.out.println(obj2.getAtheleteId());
		
		Sport sportEntry1 = new Sport();
		sportEntry1.setAthelete(obj1);
		System.out.println(sportEntry1.checkEligiblity());
		System.out.println(sportEntry1.participationCost());

	}

}
