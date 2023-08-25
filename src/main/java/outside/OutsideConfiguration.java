package outside;


import com.intospring.conditional.SampleConditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@SampleConditional
class OutsideConfiguration {

    OutsideConfiguration() {
        System.out.println("OutsideConfiguration");
    }
}