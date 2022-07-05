package cabapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cabapplication.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
	
	@Query("select c from Customer c where c.username=?1 and c.password=?2")
	public Customer validateCustomer(String username,String password);

}
