package skeleton;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.AbstractDocument.Content;
import javax.validation.constraints.AssertTrue;
import javax.xml.ws.Response;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.matchers.Contains;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.View;

import com.car.rental.controller.CustomerController;
import com.car.rental.domain.Customer;
import com.car.rental.service.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:root-context-test.xml")
@TransactionConfiguration(defaultRollback= false)
@Transactional
public class CustomerControllerTest{

	@Autowired
	CustomerService customerService;

	
	@InjectMocks
	CustomerController controller;

	@Mock
	CustomerService mockCustomerService;

	@Mock
	View mockView;

	private MockMvc mockMvc;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		
		// MockMvcBuilders.standaloneSetup(controller).setSingleView(mockView).build();
		mockMvc = MockMvcBuilders.standaloneSetup(controller).setSingleView(mockView).build();		
	
	}

	@Ignore
	@Test
	public void testListCustomer() {

		List<Customer> expectedCustomer = new ArrayList<Customer>();
		when(mockCustomerService.getAllCustomer()).thenReturn(expectedCustomer);

		ModelMap modelMap = new ModelMap();
		String viewName = controller.allCustomers(modelMap);

		assertEquals("customer/listCustomer", viewName);

	}
	@Test	
	public void testListCustomer2() throws Exception {		
		//Customer actualCustomer = new Customer();
		List<Customer> actualCustomer = customerService.getAllCustomer();
		System.out.println("Hello");
	
		List<Customer> expectedCustomer = new ArrayList<Customer>();
		when(mockCustomerService.getAllCustomer()).thenReturn(expectedCustomer);
		ModelMap modelMap= new ModelMap();
		String viewName= controller.allCustomers(modelMap);
		
		assertEquals("customer/listCustomer", viewName);
		
		this.mockMvc.perform(get("/customer")).andReturn().equals(actualCustomer);
		this.mockMvc.perform(get("/customer").accept(MediaType.TEXT_PLAIN))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.status().isBadRequest())
		.andDo(print());
		
		
				
		System.out.println("------------------end of the test case-------------------------------");
		
	}

}
