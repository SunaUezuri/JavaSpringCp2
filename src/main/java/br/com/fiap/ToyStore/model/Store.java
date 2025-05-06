package br.com.fiap.ToyStore.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "TB_CP2_STORE")
@SequenceGenerator(name = "store", sequenceName = "SQ_TB_CP2_STORE", allocationSize = 1)
public class Store {

    @Id @Column(name = "store_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "store")
    private Long id;

    @Column(name = "nm_store", length = 100, nullable = false)
    private String name;

    @Column(name = "address_store", length = 250)
    private String address;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "TB_CP2_STORES_TOY",
            joinColumns = @JoinColumn(name = "store_id"),
            inverseJoinColumns = @JoinColumn(name = "toy_id"))
    private List<Toy> toys;

    public Store() {}

    public Store(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Store(Long id, String name, String address, List<Toy> toys) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.toys = toys;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Toy> getToys() {
        return toys;
    }

    public void setToys(List<Toy> toys) {
        this.toys = toys;
    }
}
