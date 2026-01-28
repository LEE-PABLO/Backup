import java.util.Optional;

public class UserService {
	public String getCityName(User user) {
		return Optional.ofNullable(user)
		.map(User::getAddress)
		.map(Address::getCity)
		//.map(city->{if("Seoul".equalsIgnoreCase(city)) {return "Metropolitan";}
		//else{return city;}})
		.map(city -> "Seoul".equalsIgnoreCase(city) ? "Metropolitan" : city)
		.orElse("unknown");}
}
