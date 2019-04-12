import com.netcracker.shevko.customer.Customer;
import com.netcracker.shevko.customer.CustomerDao;
import com.netcracker.shevko.customer.CustomerDaoImpl;
import com.netcracker.shevko.databasemanager.PostgreSQLDatabaseManager;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class TestCustomerManager {

@Test
    public void test(){

        //CustomerManagementApplication.main();

    EntityManager entityManager = PostgreSQLDatabaseManager.getInstance().getEntityManager();



    Customer customer= new Customer("Shevko","Egor","Sergeevich",19);

    CustomerDao customerDao = new CustomerDaoImpl();

    customerDao.create(customer);

    Customer readOffer = customerDao.findById(customer.getId());

    assertNotNull(readOffer);
    assertEquals(customer.toString(), readOffer.toString());
    }
}
