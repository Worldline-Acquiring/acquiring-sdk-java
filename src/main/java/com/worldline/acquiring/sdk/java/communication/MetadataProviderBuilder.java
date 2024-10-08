package com.worldline.acquiring.sdk.java.communication;

import java.util.ArrayList;
import java.util.List;

import com.worldline.acquiring.sdk.java.domain.ShoppingCartExtension;

/**
 * Builder for a {@link MetadataProvider} object.
 */
public class MetadataProviderBuilder {

    final String integrator;

    ShoppingCartExtension shoppingCartExtension;

    final List<RequestHeader> additionalRequestHeaders = new ArrayList<>();

    /**
     * @param integrator The integrator to use.
     */
    public MetadataProviderBuilder(String integrator) {
        if (integrator == null || integrator.trim().isEmpty()) {
            throw new IllegalArgumentException("integrator is required");
        }
        this.integrator = integrator;
    }

    /**
     * Sets the shopping cart extension to use.
     */
    public MetadataProviderBuilder withShoppingCartExtension(ShoppingCartExtension shoppingCartExtension) {
        this.shoppingCartExtension = shoppingCartExtension;
        return this;
    }

    /**
     * Adds an additional request header.
     * The following names are prohibited in these additional request headers, because these will be set automatically
     * as needed:
     * <ul>
     * <li>X-WL-ServerMetaInfo</li>
     * <li>Date</li>
     * <li>Content-Type</li>
     * <li>Authorization</li>
     * </ul>
     */
    public MetadataProviderBuilder withAdditionalRequestHeader(RequestHeader additionalRequestHeader) {
        MetadataProvider.validateAdditionalRequestHeader(additionalRequestHeader);
        additionalRequestHeaders.add(additionalRequestHeader);
        return this;
    }

    /**
     * Creates a fully initialized {@link MetadataProvider} object.
     */
    public MetadataProvider build() {
        return new MetadataProvider(this);
    }
}
