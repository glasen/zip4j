package net.lingala.zip4j.model;

import java.nio.charset.Charset;

public record Zip4jConfig(Charset charset, int bufferSize, boolean useUtf8CharsetForPasswords) {

}
