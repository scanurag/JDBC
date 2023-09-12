package streamAPIImp;

import java.util.List;
import java.util.stream.Collectors;

public class PersonDataHandler {
public List<Person> sortByName(List<Person> persons){
	return persons.stream().sorted((o1, o2) -> o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
}
public List<Person> sortById(List<Person> persons){
	return persons.stream().sorted((e1,e2) -> e1.getId()-e2.getId()).collect(Collectors.toList());
}
public List<Person> sortByLength(List<Person> persons){
	return persons.stream().sorted((o1, o2) -> o1.getName().length()-o2.getName().length()).collect(Collectors.toList());
}
}
