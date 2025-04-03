package com.souha.chansons;

import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.souha.chansons.entities.Chanson;
import com.souha.chansons.repos.ChansonRepository;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ChansonsApplicationTests {
  	  @Autowired
	    private ChansonRepository chansonRepository;

	    @Test
	    public void testCreateChanson() {
	        Chanson chanson = new Chanson("Lila wil Mizwed khadem", "Mizwed", new Date());
	        chansonRepository.save(chanson);
	    }
	

	    @Test
	    public void testFindChanson() {
	        Chanson chanson = chansonRepository.findById(1L).get();
	        System.out.println(chanson);
	    }
	    
	    @Test
	    public void testUpdateChanson() {
	        Chanson chanson = chansonRepository.findById(1L).get();
	        chanson.setType("Reggae");
	        
	        
	        System.out.println(chanson);
	    }
	    
	    @Test
	    public void testDeleteChanson() {
	       chansonRepository.findById(1L).get();
	     
	    }
	    @Test
	    public void testListerToutesChansons() {
	        List<Chanson> chansons = chansonRepository.findAll();
	        for (Chanson chanson : chansons) {
	            System.out.println(chanson);
	        }
	    }
	    
}
