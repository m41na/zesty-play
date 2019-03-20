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
import com.practicaldime.travel.dao.entity.Airline;
import com.practicaldime.travel.dao.repo.AirlinesDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDaoConfig.class, loader = AnnotationConfigContextLoader.class)
//@SqlGroup({
//    @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:sql/create-tables.sql"),
//    @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:sql/populate-data.sql")
//})
@TestPropertySource("classpath:config/test-app-dao.properties")
public class AirlinesDaoTest {

	@Autowired
    public AirlinesDao dao;

    @Test
    public void testRetrieveFlights() {
        List<Airline> airline = dao.retrieve(0, 100).getEntity();
        assertEquals(100, airline.size());
    }

    @Ignore()
    @Test
    public void testCreateAirport() {
    	Airline airline = new Airline();        
    	//populate bean
    	airline.id = 100000l;
    	airline.name = "test_flight";
    	airline.alias = "test_flight_alias";
    	airline.iata = "f_iata";
    	airline.icao = "f_icao";
    	airline.service = "flight_service";
    	airline.country = "flight_country";
    	airline.active = "A";
        dao.create(airline);
    }
}
