package kg.mega.naTV.models.requests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.File;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChannelRegistrationRequest {

    private String name;
    private Integer orderNum;
    private File photo;
}
