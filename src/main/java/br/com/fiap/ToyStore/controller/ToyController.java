package br.com.fiap.ToyStore.controller;

import br.com.fiap.ToyStore.dto.toy.ToyGetDto;
import br.com.fiap.ToyStore.dto.toy.ToyPostDto;
import br.com.fiap.ToyStore.model.enums.Public;
import br.com.fiap.ToyStore.model.enums.ToyType;
import br.com.fiap.ToyStore.repository.ToyRepository;
import br.com.fiap.ToyStore.service.ToyService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/toys")
public class ToyController {

    @Autowired
    ToyService service;

    @Autowired
    ToyRepository repository;

    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid ToyPostDto json) {
        service.registerToy(json);
    }

    @GetMapping
    public Page<ToyGetDto> list(@PageableDefault(size = 5, sort = {"name"}) Pageable page) {
        return repository.findAll(page).map(ToyGetDto::new);
    }

    @GetMapping("/{id}")
    public ToyGetDto listById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping("/type/{types}")
    public List<ToyGetDto> listByType(@PathVariable ToyType types) {
        return repository.findByType(types)
                .stream()
                .map(ToyGetDto::new)
                .toList();
    }

    @GetMapping("/public/{classification}")
    public List<ToyGetDto> listByClassification(@PathVariable Public classification) {
        return repository.findByClassification(classification)
                .stream()
                .map(ToyGetDto::new)
                .toList();
    }

    @GetMapping("/name/{name}")
    public List<ToyGetDto> listByName(@PathVariable String name) {
        return repository.findByNameContainingIgnoreCase(name)
                .stream()
                .map(ToyGetDto::new)
                .toList();
    }
}
