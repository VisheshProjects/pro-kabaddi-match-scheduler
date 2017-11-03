package main.java.kabaddi;

import java.util.ArrayList;
import java.util.List;

public class ScheduleGenerator {


	public List<Match> generateMatches(List<Team> teams , int numberOFRounds){
		
		
		//int numberOFMatches = numberOFRounds*(teams.size() * (teams.size()-1) / 2);
		
		List<Match> matches = new ArrayList<Match>();
		
		
		for(int i = 1 ; i < numberOFRounds; i++){
			
			for(int j = 0; j < teams.size() - 1 ;j++){
				
				for(int k = j+1 ; k < teams.size() ; k++){
					
					Match match = new Match();
					match.setTeam1(teams.get(i));
					match.setTeam2(teams.get(j));
					
					matches.add(match);
					//match.setVenue();
					
				}
				
			}
			
			
			
		}
		
		
		return matches;
	}
	
}
