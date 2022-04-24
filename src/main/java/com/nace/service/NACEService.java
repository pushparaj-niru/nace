/**
 * 
 */
package com.nace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nace.entity.NACEEntity;
import com.nace.repository.NACERepository;

/**
 * @author PUSHPARAJ
 *
 */
@Service
public class NACEService {
	
	@Autowired
    private NACERepository naceRepository;

    public NACEEntity putNaceDetail(NACEEntity naceEntity) {
    	if(naceEntity.getOrderNo()>0 && getNaceDetails(naceEntity.getOrderNo())==null) 
    	   return naceRepository.save(naceEntity);
    	
    	return null;    	
    }

     public NACEEntity getNaceDetails(long id) {
        return id>0?naceRepository.findById(id).orElse(null):null;
    }
    
}
