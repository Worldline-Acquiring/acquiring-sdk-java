package com.worldline.acquiring.sdk.java.logging;

/**
 * An obfuscation rule defines how a single value is obfuscated. This can be as simple as returning a fixed mask,
 * or as complex as necessary.
 * <p>
 * Obfuscation rules should be thread-safe.
 */
public interface ObfuscationRule {

    String obfuscateValue(String value);
}
