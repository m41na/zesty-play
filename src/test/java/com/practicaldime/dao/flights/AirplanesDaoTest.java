package com.practicaldime.dao.flights;

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

import com.practicaldime.dao.TestDaoConfig;
import com.practicaldime.dao.entity.Airplane;
import com.practicaldime.dao.repo.AirplanesDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestDaoConfig.class, loader = AnnotationConfigContextLoader.class)
//@SqlGroup({
//    @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:sql/create-tables.sql"),
//    @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:sql/populate-data.sql")
//})
@TestPropertySource("classpath:config/test-app-dao.properties")
public class AirplanesDaoTest {

	@Autowired
    public AirplanesDao dao;

    @Test
    public void testRetrieveFlights() {
        List<Airplane> planes = dao.retrieve(0, 100).getEntity();
        assertEquals(100, planes.size());
    }

    @Ignore()
    @Test
    public void testCreateAirport() {
    	Airplane plane = new Airplane();        
    	//populate bean
        dao.create(plane);
    }
}
