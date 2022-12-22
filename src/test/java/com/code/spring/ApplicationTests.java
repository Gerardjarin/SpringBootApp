package com.code.spring;

import com.code.spring.model.Employee;
import com.code.spring.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//@WebMvcTest
@SpringBootTest
class ApplicationTests {

//      @Autowired
//      private MockMvc mockMvc;
        @Autowired
        private EmployeeService employeeDao;

        @Autowired
        private Employee employeeCompany;

//      private static ObjectMapper mapper = new ObjectMapper();

        @Test
        void addEmployeeTest() {
            Employee employee = new Employee();
            employee.setName("Gerard Jarin");
            employee.setLocation("Building 8");
            employee.setBranch("Engineering");
            employee.setCompanyName(employeeCompany.getCompanyName());
            employeeDao.save(employee);
        }
       // @Test
        void addEmployeeTest1() {
            Employee employee = new Employee();
            employee.setName("Arjay Verzo");
            employee.setLocation("Building 10");
            employee.setBranch("Crim");
            employee.setCompanyName(employeeCompany.getCompanyName());
            employeeDao.save(employee);


        }


        //@Test
        void getAllEmployees() {
		 List<Employee> employees = employeeDao.getAllEmployees();
         System.out.println(employees);
	}


        //@Test
        void getAllEmployeesAndDeleteThem() {
            List<Employee> employees = employeeDao.getAllEmployees();
            for (Employee employee : employees) {
                employeeDao.delete(employee.getId());
            }
        }

//        @Test
//        public void addEmployeeTest() throws Exception{
//            List<Employee> employees = new ArrayList<>();
//            Employee employee = new Employee();
//            employee.setId(36);
//            employee.setName("Gerard Jarin");
//            employee.setLocation("Building 8");
//            employee.setBranch("Engineering");
//            employee.setCompanyName("IBM");
//            employees.add(employee);
//            Mockito.when(EmployeeService.save(employee)).thenReturn((Employee) employees);
//            mockMvc.perform(get("/get-all")).andExpect(status().isOk()).andExpect(jsonPath("$", Matchers.hasSize(1)))
//                    .andExpect(jsonPath("$[0].name", Matchers.equalTo("Gerard Jarin")));
//        }

    }