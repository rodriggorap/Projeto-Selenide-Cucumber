package runner;
import com.codeborne.selenide.Screenshots;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterMethod;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;

import static com.codeborne.selenide.Selenide.screenshot;


@CucumberOptions(
        features = {"src/feature/logar_no_sistema.feature","src/feature/carrinho_de_compras.feature","src/feature/finalizar_compra.feature"},
        glue = "stepDefinitions",
        tags = "",
        plugin = {"pretty","html:target/Relatorio.html","html:target/cucumber-html-report","json:target/report.json"},
        monochrome = true
)

public class Runner extends AbstractTestNGCucumberTests {

    @AfterMethod
    public void finish() {

        //Tiramos um screenshot pelo Selenide

        screenshot("temp_shot");

        Screenshots.getLastScreenshot();
        File tempshot = Screenshots.getLastScreenshot();



        //Queremos transforma em binário para anexar no report do allure

        try{
            BufferedImage bimage = ImageIO.read(tempshot);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            ImageIO.write(bimage,"png",baos);
            byte [] finalshot = baos.toByteArray();

            io.qameta.allure.Allure.addAttachment("Evidência",new ByteArrayInputStream(finalshot));

        } catch (Exception ex){
            System.out.println("Deu erro ao anexar o Screenshot :(. Trace => " + ex.getMessage());
        }

    }

}
