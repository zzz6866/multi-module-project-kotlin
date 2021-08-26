package kr.co.alldev.pickstock.repository;

import kr.co.alldev.pickstock.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
