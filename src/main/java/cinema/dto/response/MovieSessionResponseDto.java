package cinema.dto.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MovieSessionResponseDto {
    private Long movieSessionId;
    private Long movieId;
    private String movieTitle;
    private Long cinemaHallId;
    private String showTime;
}
