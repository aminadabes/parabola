package com.elaboratecnologia.parabolas.resource;

import com.elaboratecnologia.parabolas.entity.Parabola;
import com.elaboratecnologia.parabolas.repository.ParabolaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ParabolaResource {

    ParabolaRepository parabolaRepository;

    @PostMapping("/parabola")
    @ResponseStatus(HttpStatus.CREATED)
    public Parabola save(@RequestBody Parabola parabola) {
        return parabolaRepository.save(parabola);
    }

    @GetMapping("/parabolas")
    @ResponseStatus(HttpStatus.OK)
    public List<Parabola> listParabola() {
        return parabolaRepository.findAll();
    }

    @PutMapping("/parabola")
    public Parabola update(@RequestBody Parabola parabola) {
        return parabolaRepository.saveAndFlush(parabola);
    }

    @GetMapping("/parabola/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Parabola> findById(@PathVariable Long id) {
        return parabolaRepository.findById(id);
    }

    @DeleteMapping("/parabola/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        parabolaRepository.deleteById(id);
    }
}
