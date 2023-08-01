package azuredataapi.apiforweb.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import azuredataapi.apiforweb.model.ProductLine;
import azuredataapi.apiforweb.repository.ProductLineRepository;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class ProductLineController {

    @Autowired
    private ProductLineRepository productLineRepository;
    
    @GetMapping("/product_lines")
    public ResponseEntity<List<ProductLine>> getAllProducts(@RequestParam(required = false) String productLine) {
        try {
            List<ProductLine> products = new ArrayList<ProductLine>();

            if(productLine == null) 
                productLineRepository.findAll().forEach(products::add);
            else
                productLineRepository.findByFullProductLine(productLine).forEach(products::add);

            if(products.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(products, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
