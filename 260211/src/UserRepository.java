import java.util.Map;

public class UserRepository {
	Map<String, String> map;
 public UserRepository(Map<String, String> map) {this.map=map;}
 public void save(String id, String name) {map.put(id, name);}
 public String findName(String id) {return map.get(id);}
}

