package ClientService;

public class ClientService {
	ClientDetails getClient(String clientNumber) {
		System.out.println("getClient: " + clientNumber);
		Speciality speciality = new Speciality();
		speciality.name = "FMI";
		speciality.educationYears = 4;
		
		ClientDetails client = new ClientDetails();
		client.clientNumber = "1234567890";
		client.firstName = "Ivan";
		client.lastName = "Petrov";
		client.age = 22;
		client.speciality = speciality;
		
		return client;
	}

}
