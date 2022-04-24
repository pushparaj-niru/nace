/**
 * 
 */
package com.nace.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nace.entity.NACEEntity;
import com.nace.service.NACEService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author PUSHPARAJ
 *
 */
@Api(tags="Nace Controller",value = "Nomenclature of Economic Activities Controller", description = "REST APIs related to Nomenclature of Economic Activities!!!!")
@RestController
@RequestMapping("/api")
public class NACEController {

	@Autowired
	NACEService naceService;
    
	@ApiOperation(value = "Get NACE in the System ", response = NACEEntity.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Suceess|OK"),
	@ApiResponse(code = 401, message = "not authorized!"), @ApiResponse(code = 403, message = "forbidden!!!"),
	@ApiResponse(code = 404, message = "not found!!!") })
	@GetMapping("/nace/{id}")
	public ResponseEntity<NACEEntity> getNaceDetails(@PathVariable("id") int id) {
		Optional<NACEEntity> naceEntityData = Optional.of(naceService.getNaceDetails(id));
		if (naceEntityData.isPresent()) {
			return new ResponseEntity<>(naceEntityData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@ApiOperation(value = "Put the NACE detail into the System ", response = NACEEntity.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Suceess|OK"),
	@ApiResponse(code = 401, message = "not authorized!"), @ApiResponse(code = 403, message = "forbidden!!!"),
	@ApiResponse(code = 404, message = "not found!!!") })
	@PostMapping("/nace")
	public ResponseEntity<NACEEntity> putNaceDetail(@RequestBody NACEEntity naceEntity) {
		try {
			NACEEntity naceEnty = naceService.putNaceDetail(naceEntity);
			if(naceEnty!=null) {
			  return new ResponseEntity<>(naceEnty, HttpStatus.OK);
			}else {
			  return new ResponseEntity<>(naceEnty, HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}	
}
