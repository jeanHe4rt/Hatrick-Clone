package com.hatrick.api.endpoint;

import com.hatrick.api.error.CustomErrorType;
import com.hatrick.api.model.Manager;
import com.hatrick.api.repository.ManagerRepository;
import com.hatrick.api.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("hattrick")
public class ManagerEndpoint {

    private final ManagerRepository managerDAO;
    @Autowired
    private DateUtil dateUtil;
    @Autowired
    public ManagerEndpoint(ManagerRepository managerDAO) {
        this.managerDAO = managerDAO;
    }

    @GetMapping(path = "/list")
    public ResponseEntity<?> listAll() {
//        System.out.println(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return  new ResponseEntity<>(managerDAO.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/list/{id}")
    public ResponseEntity<?> getAdministradorById(@PathVariable("id") Long id) {
        verifyIfExistsManager(id);
        Optional<Manager> manager = managerDAO.findById(id);
        return new ResponseEntity<>( manager,HttpStatus.OK);
    }

    @PostMapping(path = "/")
    public ResponseEntity<?> save( @RequestBody Manager manager) {
        return new ResponseEntity<>(managerDAO.save(manager),HttpStatus.CREATED);
    }
    @DeleteMapping(path ="/list/{id}" )
    public ResponseEntity<?> delete(@PathVariable Long id){
        verifyIfExistsManager(id);
        managerDAO.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(path = "/list/")
    public ResponseEntity<?> update(@RequestBody Manager manager){
        verifyIfExistsManager(manager.getId());
        managerDAO.save(manager);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private boolean verifyIfExistsManager(Long id){
        boolean manager = managerDAO.existsById(id);
        if(manager == false) {
             new ResponseEntity<>( new CustomErrorType("User is not found!"), HttpStatus.NOT_FOUND);
            return false;
        }
        return true;
    }
}
