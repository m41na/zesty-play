package com.practicaldime.travel.dao.repo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.practicaldime.travel.dao.TestDaoConfig;
import com.practicaldime.travel.dao.entity.Country;
import com.practicaldime.travel.dao.repo.CountriesDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDaoConfig.class, loader = AnnotationConfigContextLoader.class)
//@SqlGroup({
//    @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:sql/create-tables.sql"),
//    @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:sql/populate-data.sql")
//})
@TestPropertySource("classpath:config/test-app-dao.properties")
public class CountriesDaoTest {

	@Autowired
    public CountriesDao dao;

    @Test
    public void testRetrieveFlights() {
        List<Country> countries = dao.retrieve(0, 100).getEntity();
        assertEquals(100, countries.size());
    }

    @Ignore()
    @Test
    public void testCreateAirport() {
    	Country country = new Country();        
    	//populate bean
    	country.name = "cou_name";
    	country.priCode = "cou_pri_code";
    	country.secCode = "cou_sec_code";
    	country.dst = "-6.00GMT";
        dao.create(country);
    }
}
