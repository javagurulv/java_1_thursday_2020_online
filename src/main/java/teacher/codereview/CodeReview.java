package teacher.codereview;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface CodeReview {

	boolean approved();

}