package project.ApiDio.gameapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;
import project.ApiDio.gameapi.enums.Situation;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GameDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String gameName;

    @NotNull
    @Range(min = 1900, max = 3000)
    private Integer gameYear;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String gameProducer;

    @NotEmpty
    private String gameConsole;

    @Enumerated(EnumType.STRING)
    private Situation situationType;


}