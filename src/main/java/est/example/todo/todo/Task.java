package est.example.todo.todo;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@Entity
@Table(name ="Todo")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Task {
    @Id
    @Column(name = "task_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int task_id;

    private String title;
    @Column(unique = true, nullable = false)
    private String taskCode;
    @Column(columnDefinition = "TEXT" )
    private String description;
    private Integer priority;
    private  Boolean completeStatus;

    private LocalDate createdAt;
    private LocalDate updatedAt;

    private LocalDate startTime;
    private LocalDate endTime;
}
