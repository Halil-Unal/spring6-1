package com.example.demo;

import com.example.demo.Animal;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
public class AnimalController {

    private Map<Integer, Animal> animalsMap= new HashMap<>();

    @GetMapping("/animals")
    public String sayhi(){return "welcome";}

    @PostMapping("/")
    public Animal save(@RequestBody Animal animals){
        animalsMap.put(animals.getId(), animals);
        return animalsMap.get(animals.getId());
    }
    @GetMapping("/")
    public List<Animal> getAll(){
        return animalsMap.values().stream().toList();
    }
@GetMapping("/{id}")
public Animal get(@PathVariable int id){
return animalsMap.get(id);
}
@PutMapping("/{id}")
public Animal update(@PathVariable int id,@RequestBody Animal animal){
animalsMap.put(id,new Animal(id,animal.getName(),animal.getKind(),animal.getAge()));
return animalsMap.get(id);
}
    @DeleteMapping("/{id}")
    public Animal delete(@PathVariable int id){
Animal animal=animalsMap.get(id);
animalsMap.remove(id);
return animal;
    }
}

