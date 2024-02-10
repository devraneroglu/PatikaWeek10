import jakarta.persistence.*;

@Entity
@Table(name="tbl_color")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "color_id")
    private int
}
