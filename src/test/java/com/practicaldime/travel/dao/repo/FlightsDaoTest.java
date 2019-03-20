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
import com.practicaldime.travel.dao.entity.Flight;
import com.practicaldime.travel.dao.repo.FlightsDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDaoConfig.class, loader = AnnotationConfigContextLoader.class)
//@SqlGroup({
//    @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:sql/create-tables.sql"),
//    @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:sql/populate-data.sql")
//})
@TestPropertySource("classpath:config/test-app-dao.properties")
public class FlightsDaoTest {

	@Autowired
    public FlightsDao dao;

    @Test
    public void testRetrieveFlights() {
        List<Flight> flights = dao.retrieve(0, 100).getEntity();
        assertEquals(100, flights.size());
    }

    @Ignore()
    @Test
    public void testCreateAirport() {
    	Flight flight = new Flight();        
    	//populate bean
    	flight.origin = "chihuaha";
    	flight.originCode = "chicoa";
    	flight.originAirport = "tamales";
    	flight.destCode = "aruba";
    	flight.destAirport = "airbb";
    	flight.flightCode = "chi_aru";
    	flight.flightFlag = "aru";
    	flight.connect = "tacos";
        flight.coordinates = "00N 44S";
        dao.create(flight);
    }
}
