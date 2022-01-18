package cinema.lib;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanWrapperImpl;

@AllArgsConstructor
public class FieldsValueMatchValidator
        implements ConstraintValidator<FieldsValueMatch, Object> {
    private String field;
    private String fieldMatch;

    public boolean isValid(Object value,
                           ConstraintValidatorContext context) {
        Object fieldValue = new BeanWrapperImpl(value)
                .getPropertyValue(field);
        Object fieldMatchValue = new BeanWrapperImpl(value)
                .getPropertyValue(fieldMatch);

        return Objects.equals(fieldValue, fieldMatchValue);
    }
}
