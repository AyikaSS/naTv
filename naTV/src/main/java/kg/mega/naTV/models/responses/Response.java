package kg.mega.naTV.models.responses;

import kg.mega.NaTV.utils.ResourceBundle;
import kg.mega.NaTV.utils.models.Language;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {

    private String message;
    private Object data;


    public static Response getResponse(String message, Language language) {

        return Response.builder()
                .message(message == null ? ResourceBundle.periodMessage(language,"success") : message)
                .build();
    }

    public static Response getErrorResponse(String message) {
        return Response.builder()
                .message(message == null ? "Произошла ошибка" : message)
                .build();
    }

    public static Response getResponseWithBody(String message, Object data){
        return Response.builder()
                .message(message)
                .data(data)
                .build();
    }
}
