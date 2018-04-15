import com.github.lalyos.jfiglet.FigletFont;

import java.io.IOException;

import static org.apache.commons.lang3.StringUtils.defaultIfBlank;

public class Greeter {
    public static void main(String[] args) throws IOException {
        final String name = defaultIfBlank(args.length == 0 ? null : args[0], "World");

        final String asciiArt = FigletFont.convertOneLine("Hello, " + name);

        System.out.println(asciiArt);
    }
}
