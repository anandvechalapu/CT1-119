@Repository
public class ExampleRepository {

    private final EntityManager entityManager;

    @Autowired
    public ExampleRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Example example) {
        entityManager.persist(example);
    }

    public Example findById(Long id) {
        return entityManager.find(Example.class, id);
    }

    public void deleteById(Long id) {
        Example example = entityManager.find(Example.class, id);
        entityManager.remove(example);
    }

}