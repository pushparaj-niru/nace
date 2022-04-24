/**
 * 
 */
package com.nace;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nace.entity.NACEEntity;
import com.nace.service.NACEService;

/**
 * @author PUSHPARAJ
 *
 */
@SpringBootTest
public class TestNACEController {
	
	@Autowired
	NACEService naceService;

	/*
	 * @MockBean NACERepository naceRepository;
	 */
	@Test
	public void getNaceDetailsTest() {
		NACEEntity naceEntity=naceService.getNaceDetails((long) 5);
		assertNotNull(naceEntity);
	}
	
	@Test
	public void putNaceDetailTest() {
		NACEEntity naceEntityTest=new NACEEntity( 398481, 1, "A", "1",
				"AGRICULTURE, FORESTRY AND FISHING", 
				"This group includes raising (farming) and breeding of all animals, except aquatic animals",
				null, "#NAME", null, "A");
		NACEEntity naceEntity = naceService.putNaceDetail(naceEntityTest);
		assertNotNull(naceEntity);
	}
	 
}
