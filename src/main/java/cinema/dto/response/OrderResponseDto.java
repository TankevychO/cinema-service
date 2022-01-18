package cinema.dto.response;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrderResponseDto {
    private Long id;
    private List<Long> ticketIds;
    private Long userId;
    private String orderTime;
}
