package br.com.fiap.ToyStore.model;

import br.com.fiap.ToyStore.model.enums.Public;
import br.com.fiap.ToyStore.model.enums.ToyType;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "TB_CP2_TOY")
@SequenceGenerator(name = "toy", sequenceName = "SQ_TB_CP_TOY", allocationSize = 1)
public class Toy {

    @Id @Column(name = "toy_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "toy")
    private Long id;

    @Column(name = "nm_toy", length = 100, nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_toy")
    private ToyType type;

    @Enumerated(EnumType.STRING)
    @Column(name = "classi_toy", nullable = false)
    private Public classification;

    @Column(name = "size_toy", nullable = false)
    private double size;

    @Column(name = "price_toy", nullable = false)
    private double price;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "TB_CP2_TOY_STORES",
    joinColumns = @JoinColumn(name = "toy_id"),
    inverseJoinColumns = @JoinColumn(name = "store_id"))
    private List<Store> stores;

    public Toy() {}

    public Toy(Long id, String name, ToyType type, Public classification, double size, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.classification = classification;
        this.size = size;
        this.price = price;
    }

    public Toy(Long id, String name, ToyType type, Public classification, double size, double price, List<Store> stores) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.classification = classification;
        this.size = size;
        this.price = price;
        this.stores = stores;
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

    public ToyType getType() {
        return type;
    }

    public void setType(ToyType type) {
        this.type = type;
    }

    public Public getClassification() {
        return classification;
    }

    public void setClassification(Public classification) {
        this.classification = classification;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }
}
