package exercices;

import static java.util.Comparator.comparing;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

import static exercices.Member.Type;
import static exercices.Member.members;
public class TestMember implements Comparable<Member> {

	public static void main(String[] args) {
		
		
		// 1

		List<Member> l1 =  members.stream()
			
				.filter(member -> member.getHandicap() > 20)
				.toList();
				
				
				l1.forEach(System.out::println);
				
				
		// 2
				
				List<String> l2 = members.stream()
						.filter(member->member.getTeam()== "TeamA")
						.map(Member::getLastName)
						.toList();
				l2.forEach(System.out::println);
						
						
						
		// 3
				List<String> l3 =	members.stream()
				.filter(member -> member.getGender()=='F')
				.map(Member::getLastName)
				.toList();
				l3.forEach(System.out::println);
				
				
		// 4
				
				
				members.stream()
				.filter(member->member.getType()==Type.Junior)
				.sorted(comparing(Member::getHandicap))
				.forEach(System.out::println);
				
				
	
				// 5
				
				
				members.stream()
				.filter(member->member.getTeam()=="TeamA")
				.sorted(comparing(Member::getLastName))
				.forEach(System.out::println);
				
				
				
		// 6
				
				
				members.stream()
				.filter(member->member.getTeam()=="TeamC")
				.map(Member::getType)
				.forEach(System.out::println);
		
				
		// 7 
				
				members.stream()

				.filter(member->member.getType( )==Type.Senior)
				.filter(member->member.getTeam()=="TeamB")
				.map(member->member.getLastName())
				.forEach(System.out::println);
				
		
		// 8
				
				int max = members.stream()
				.mapToInt(Member::getHandicap)
				.max()
				.getAsInt();
				System.out.println(max);
				
		// 9 
				
				int min = members.stream()
						.mapToInt(Member::getHandicap)
						.min()
						.getAsInt();
						System.out.println(min);
		// 10
						
						
				System.out.println(members.stream().anyMatch(m->m.getTeam()=="TeamC"&& m.getHandicap()>20));
				
				
				
				
		
		
		
		
		// 1.Sélectionner les membres ayant l’ « handicap » supérieur à 20 ;
		// 2.Sélectionner les noms (LastName) des « Members »  jouant dans TeamA ; 
		// 3.Sélectionner les noms (LastName) des « Members» de « Gender » =F ;
		// 4.Trier les « Members» de type « Junior » en fonction de leur « handicap » ;
		// 5.Tier les « Members» jouant dans « TeamA » en fonction de leur nom (lastName) ;
		// 6.Sélectionner les types (type) des « Members » jouant dans l’équipe « TeamC » ;
		// 7.Sélectionner les noms (LastName) des « Members» de type « Senior » jouant dans « TeamB » ;	
		// 8.Renvoyer le maximum des handicaps ;
		// 9.Renvoyer le minimum des handicaps ;
		// 10. Y'a t-il un membre jouant dans l'équipe TeamC et ayant un handicap >20 ;

		
		
	}

	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
