package suporte;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.*;

public class Web {

    public void abrirNavegador(String browser, String url) {
        Configuration.startMaximized = true;
        Configuration.browser = browser;
        open(url);
    }
}

